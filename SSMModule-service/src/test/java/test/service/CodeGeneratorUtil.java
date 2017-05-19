package test.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.MybatisGenerator;
import org.springside.modules.utils.base.PropertiesUtil;

import com.google.common.collect.Lists;
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
	
	/**
	 * 首字母小写
	 * @param str
	 * @return
	 */
	public static String lowerCapital(final String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }

        char firstChar = str.charAt(0);
        if (Character.isTitleCase(firstChar)) {
            return str;
        }

        return new StringBuilder(strLen)
            .append(Character.toLowerCase(firstChar))
            .append(str.substring(1))
            .toString();
    }
	 
	public static void main(String[] args) {
		String packageName = "com.ssf.service";
		Properties props =PropertiesUtil.loadFromFile("classpath://jdbc.properties");
		List<String> lists =MybatisGenerator.getTableNames(props);
		for (String tname : lists) {
			String clsName = StringUtilss.toCamelCase(tname.replace("sys_", ""));
			clsName = StringUtils.capitalize(clsName);
			System.out.println(clsName);
			createTemplate(packageName,clsName);
			System.out.println("生成Service模板:"+packageName+"."+clsName+"ServiceImpl");
		}
		
//		String packageName    = "com.ssf.dao";
//		String clsName = "User";
//		createTemplateDaoTest(packageName,clsName);
//		System.out.println("生成DaoTest模板:"+packageName+"."+clsName+"Test");
		
	}

	
	private static void createTemplateDaoTest(String packageName,String clsName){
		Map<String, Object> root = new HashMap<String, Object>();
		root.put("packageName", packageName);
		//实体类名称
		root.put("className", clsName);// 类名称
		//实体类名称首字母小写，驼峰式
		root.put("smallClassName", lowerCapital(clsName));// 类名称的首字母小写
		
		String workDir = (String) System.getProperties().get("user.dir");
		try {
			daoTest(workDir, root);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * -------------------生成模板---------------------
	 */
	private static void createTemplate(String packageName,String clsName) {
		Map<String, Object> root = new HashMap<String, Object>();
		//子文件的包名
		root.put("packageName", packageName);
		
		
		//实体类名称
		root.put("className", clsName);// 类名称
		//实体类名称首字母小写，驼峰式
		root.put("smallClassName", lowerCapital(clsName));// 类名称的首字母小写
		
		String workDir = (String) System.getProperties().get("user.dir");
		try {
			service(workDir, root);
			serviceImpl(workDir, root);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	private static void daoTest(String workDir, Map<String, Object> input) throws Exception{
		String packageName = input.get("packageName").toString().replaceAll("\\.", "/");
		
		StringBuffer sb = new StringBuffer();
		sb.append(workDir).append("/src/test/java/")
		.append("/"+packageName+"/")
		.append(input.get("className").toString()+"DaoTest.java");
		
		String fileName = sb.toString();
		File myFile = new File(fileName);
		myFile.getParentFile().mkdirs();
		myFile.createNewFile();
		buildFile("templete/daoTest.ftl", fileName, input);
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
		buildFile("templete/service.ftl", fileName, input);
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
		buildFile("templete/serviceImpl.ftl", fileName, input);
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
