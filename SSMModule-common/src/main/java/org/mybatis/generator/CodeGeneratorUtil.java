package org.mybatis.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.collections.functors.IfClosure;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.GeneratorConfigXMLUtil;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.ssf.common.utils.StringUtilss;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 利用freemarker模板引擎自动生成Service层通用代码
 * 
 * @author Administrator
 *
 */
public class CodeGeneratorUtil {

	private static final String CHARSET = "UTF-8";
	

	
	/*==============================================================*/
	/* 页面生成器区域                                   										*/
	/* 生成Controller和JSP页面模板										*/
	/*==============================================================*/
	
	public static void jspGenerator(Properties props,/*List<String> tableNames*/Map<String, String> comments,List<String> prefixs){
		
		List<String> tableNames = Lists.newArrayList(comments.keySet());
		
		Multimap<String, String> multimap = MybatisGenerator.getTableMultimap(tableNames, prefixs);
		String servicePackage     = "com.ssf.service";
		String webPackage         = "com.ssf.controller";
		String daoPackage    = props.getProperty("myBussinessPackage");
		String modelPackage  = props.getProperty("myModelPackage"); 
		
		
		for (String key : multimap.keySet()) {
			String webPackageName = MybatisGenerator.parsePackageName(webPackage, key);
			String jspPackageName = key.replace(".", "");
			//System.out.println(webPackageName); 
			for (String tname : multimap.get(key)) {
				String clsName = StringUtils.capitalize(StringUtilss.toCamelCase(tname));
				String pName = tname.replace("_", "/");
				String comment = comments.get(tname);
				int idx = comment.lastIndexOf("表");
				String pageTitle= idx > 0 ? comment.substring(0,comment.lastIndexOf("表")) : comment;
				System.out.println(pageTitle+","+comment+","+tname);
				//System.out.println(key+","+clsName+","+tname+","+webPackageName);
				if(clsName.equals("SysUser"))
				{
					//createJspTemplate(webPackageName, clsName, jspPackageName,pageTitle,"templates/jsp.ftl","list.jsp");
				}
			}
		}
		
	}
	/**
	 * 生成jsp页面模板
	 */
	private static void createJspTemplate(String webPackageName,String clsName,String jspPackageName,String pageTitle,String template,String suffix){
		Map<String, Object> root = new HashMap<String, Object>();
		//子文件的包名
		root.put("webPackageName", webPackageName);
		root.put("jspPackageName", jspPackageName);
		//root.put("daoPackageName", daoPackageName);
		//实体类名称
		root.put("className", clsName);// 类名称
		//实体类名称首字母小写，驼峰式
		String smallClassName =  MybatisGenerator.lowerCapital(clsName);
		root.put("smallClassName", smallClassName);// 类名称的首字母小写
		
		String mapping = jspPackageName+"/"+MybatisGenerator.lowerCapital(smallClassName.replace(jspPackageName, ""));
		root.put("mapping", mapping);//映射路径 比如类SysUser为 sys/user
		String pageContentJsp = jspPackageName+"/"+(smallClassName+"Content.jsp");
		root.put("pageContentJsp",pageContentJsp);
		
		root.put("pageTitle",pageTitle);
		String workDir = (String) System.getProperties().get("user.dir");
		try {
			jsp(template,workDir, root, "jspPackageName",suffix);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	private static void jsp(String template,String workDir, Map<String, Object> root,String pName,String suffix) throws Exception{
		String packageName = root.get(pName).toString().replaceAll("\\.", "/");
		
		StringBuffer sb = new StringBuffer();
		sb.append(workDir).append("/src/main/webapp/views/")
		.append(root.get("mapping").toString()+"/")
		.append(suffix);
		
		System.out.println("生成JSP位于:"+sb.toString());
		
		String fileName = sb.toString();
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile(template, fileName, root);
	}
	
	
	/*==============================================================*/
	/* 代码生成器区域                                   										*/
	/*         													    */
	/*==============================================================*/
	/**
	 * 
	 * @param config 位于classpath路径底下的配置文件
	 */
	public static void codeGenerator(Properties props,List<String> tableNames,List<String> prefixs){
		
		Multimap<String, String> multimap = MybatisGenerator.getTableMultimap(tableNames, prefixs);
		String servicePackage = "com.ssf.service";
		String daoPackage     = props.getProperty("myBussinessPackage");
		String modelPackage   = props.getProperty("myModelPackage"); 
		//获取主键类型
		
		for (String key : multimap.keySet()) {
			
			String servicePackageName = MybatisGenerator.parsePackageName(servicePackage, key);
			String daoPackageName = MybatisGenerator.parsePackageName(daoPackage, key);
			String modelPackageName = MybatisGenerator.parsePackageName(modelPackage, key);
			for (String tname : multimap.get(key)) {
				String clsName = StringUtils.capitalize(StringUtilss.toCamelCase(tname));
				createTemplate(servicePackageName,daoPackageName,modelPackageName,clsName);
			}
		}
		
	}
	/**
	 * -------------------生成模板---------------------
	 */
	private static void createTemplate(String packageName,String daoPackageName,String modelPackageName,String clsName) {
		Map<String, Object> root = new HashMap<String, Object>();
		//子文件的包名
		root.put("packageName", packageName);
		root.put("modelPackageName", modelPackageName);
		root.put("daoPackageName", daoPackageName);
		//实体类名称
		root.put("className", clsName);// 类名称
		//实体类名称首字母小写，驼峰式
		root.put("smallClassName", MybatisGenerator.lowerCapital(clsName));// 类名称的首字母小写
		
		String workDir = (String) System.getProperties().get("user.dir");
		try {
			Field field = Class.forName(modelPackageName+"."+clsName).getDeclaredField("id");
			if(field!=null){
				String idField = field.getType().getName();
				int idx = idField.lastIndexOf(".");
				idField = idField.substring(idx+1);
				root.put("idField", idField);
			}
			service(workDir, root);
			serviceImpl(workDir, root);
			
			daoTest(workDir, root, "daoPackageName");
		} catch (NoSuchFieldException | SecurityException
				| ClassNotFoundException e) {
			System.out.println("没有主键id无法生成:["+clsName+"]");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
		}
//		catch (Exception e) {
//			System.out.println("没有主键id无法生成:["+clsName+"]");
//		}
	}
	
	
	private static void daoTest(String workDir, Map<String, Object> root,String pName) throws Exception{
		String packageName = root.get(pName).toString().replaceAll("\\.", "/");
		
		StringBuffer sb = new StringBuffer();
		sb.append(workDir).append("/src/test/java/")
		.append("/"+packageName+"/")
		.append(root.get("className").toString()+"DaoTest.java");
		
		String fileName = sb.toString();
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile("templates/daoTest.ftl", fileName, root);
	}
	
	private static void service(String workDir, Map<String, Object> input) throws Exception {
		String packageName = input.get("packageName").toString().replaceAll("\\.", "/");
		
		StringBuffer sb = new StringBuffer();
		sb.append(workDir).append("/src/main/java/")
		//.append(input.get("packageName").toString().replaceAll("\\.", "/"))
		.append("/"+packageName+"/")
		.append("I" + input.get("className").toString()+"Service.java");
		
//		String fileName = workDir + "/src/main/java/"
//				+ input.get("packageName").toString().replaceAll("\\.", "/")
//				+ "/service/" + "I" + input.get("className").toString()
//				+ "Service.java";
		
		String fileName = sb.toString();
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile("templates/service.ftl", fileName, input);
	}

	private static void serviceImpl(String workDir, Map<String, Object> input)
			throws Exception {
		String packageName = input.get("packageName").toString().replaceAll("\\.", "/");
		StringBuffer sb = new StringBuffer();
		sb.append(workDir).append("/src/main/java/")
		//.append(input.get("packageName").toString().replaceAll("\\.", "/"))
		.append("/"+packageName+"/impl/")
		.append(input.get("className").toString()+"ServiceImpl.java");
		
//		String fileName = workDir + "/src/main/java/"
//				+ input.get("packageName").toString().replaceAll("\\.", "/")
//				+ "/service/impl/" + input.get("className").toString()
//				+ "ServiceImpl.java";
		
		String fileName = sb.toString();
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile("templates/serviceImpl.ftl", fileName, input);
	}
	
	/**
	 * 生成文件
	 * 
	 * @param templateName
	 *            模板文件
	 * @param fileName
	 *            生成文件
	 * @param root
	 *            参数
	 */
	@SuppressWarnings("deprecation")
	private static void buildFile(String templateName, String fileName, Map root) {
		Configuration freemarkerCfg = new Configuration(Configuration.VERSION_2_3_0);
		freemarkerCfg.setClassForTemplateLoading(CodeGeneratorUtil.class, "/");
		freemarkerCfg.setEncoding(Locale.getDefault(), CHARSET);
		Template template;
		try {
			template = freemarkerCfg.getTemplate(templateName);
			template.setEncoding(CHARSET);
			File htmlFile = new File(fileName);
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(htmlFile), CHARSET));
			template.process(root, out);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
