package org.mybatis.generator;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.ShellRunner;
import org.springside.modules.utils.io.URLResourceUtil;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;
import com.itextpdf.text.pdf.PdfStructTreeController.returnType;


public class MybatisGenerator {
	public static final String ORIGIN_CONFIG    = "generatorConfig.xml";
	public static final String OUT_CONFIG       = "generatorConfigBak.xml";
	public static final String CONFIG_GENERATOR = "mybatis-generator.properties";
	public static final List<String> BASE_PREFIX = Lists.newArrayList("rp_","pms_","sys_");//也就是包名
	
	public static final Properties PROPERTIES = new Properties();
	static
	{
		try {
			InputStream is = URLResourceUtil.asStream("classpath://"+CONFIG_GENERATOR);//DataSourceFactory.class.getResourceAsStream("/jdbc.properties");
			PROPERTIES.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static  List<String> getTableNames(Properties props){
		String dbName = props.getProperty("dbName");
		String dbType = props.getProperty("dbType");
		return DataBasePopulator.getTableNames(props, dbName,dbType);
	}
	
	//第一步生成-数据库结构
	public static void runSql(Properties props,List<String> lists){
		
		DataBasePopulator.initDatabase(props,lists);
	}
//	//第二步-生成配置文件
//	public static void createConfigs(){
//		createConfigs(PROPERTIES,ORIGIN_CONFIG,OUT_CONFIG);
//	}
//	/**
//	 * 生成model都在同一目录下
//	 * @param props
//	 * @param src
//	 * @param out
//	 */
//	public static void createConfigs(Properties props,String src,String out){
//		String dbName = props.getProperty("dbName");
//		String dbType = props.getProperty("dbType");
//		if(dbName==null || "".equals(dbName)){
//			throw new RuntimeException("dbName没有在配置文件里面设置");
//		}
//		if(dbType==null || "".equals(dbType)){
//			dbType="mysql";
//			System.out.println("dbType为空设为默认值mysql");
//		}
//		try {
//			GeneratorConfigXMLUtil.convertXmlStrToObjectTest(props,dbName, dbType,src,out);
//		} catch (SAXException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//	}
	//生成-DAO/Mapper映射文件
	public static void generator(String config){
		System.out.println("开始生成代码...");
		try {
			//Resources.getResourceAsFile(config)
			config = URLResourceUtil.asFile("classpath://"+config).getPath();
			System.out.println("配置文件:"+config);
		}  catch (IOException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("完整的配置文件路径：" + config);
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
		System.out.println("代码生成完成。");
	}
	
	/**
	 * 第二步-生成配置文件
	 * prefixs ==null 生成路径为generatorConfigBak.xml 统一生在一个包下面com.ssf.model
	 * 默认使用BASE_PREFIX
	 */
	public static List<String> generateConfigXML(Properties props,List<String> prefixs){
		String dbName = props.getProperty("dbName");
		String dbType = props.getProperty("dbType");
		if(dbName==null || "".equals(dbName)){
			throw new RuntimeException("dbName没有在配置文件里面设置");
		}
		if(dbType==null || "".equals(dbType)){
			dbType="mysql";
			System.out.println("dbType为空设为默认值mysql");
		}
		 List<String> tableNames = getTableNames(props);
		 String myBussinessPackage = props.getProperty("myBussinessPackage");
		 String myModelPackage 	   = props.getProperty("myModelPackage");
		 
		 
		 try {
			return GeneratorConfigXMLUtil.generateConfigXML(tableNames, prefixs, ORIGIN_CONFIG, myBussinessPackage, myModelPackage);
		} catch (IOException | CloneNotSupportedException e) {
			e.printStackTrace();
		}
		 return Lists.newArrayList();
	}
	
	
	public static void main(String[] args) 
	{
		//List<String> lists = Lists.newArrayList("sql/finalssm.sql","sql/finalssm_data.sql");
		//runSql(PROPERTIES,lists);
		//generateConfigXML(PROPERTIES, BASE_PREFIX);
		//generator(OUT_CONFIG);
	}
}
