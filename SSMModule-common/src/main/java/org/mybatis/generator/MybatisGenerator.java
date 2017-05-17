package org.mybatis.generator;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.ShellRunner;
import org.springside.modules.utils.io.URLResourceUtil;
import org.xml.sax.SAXException;


public class MybatisGenerator {
	private static final String ORIGIN_CONFIG = "generatorConfig.xml";
	private static final String OUT_CONFIG   = "src/main/resources/generatorConfigBak.xml";
	
	public static final Properties PROPERTIES = new Properties();
	static
	{
		try {
			InputStream is = URLResourceUtil.asStream("classpath://mybatis-generator.properties");//DataSourceFactory.class.getResourceAsStream("/jdbc.properties");
			PROPERTIES.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//第一步生成-数据库结构
	public static void runSql(Properties props,List<String> lists){
		
		DataBasePopulator.initDatabase(props,lists);
	}
	//第二步-生成配置文件
	public static void createConfigs(){
		createConfigs(PROPERTIES,ORIGIN_CONFIG,OUT_CONFIG);
	}
	
	public static void createConfigs(Properties props,String src,String out){
		String dbName = props.getProperty("dbName");
		String dbType = props.getProperty("dbType");
		if(dbName==null || "".equals(dbName)){
			throw new RuntimeException("dbName没有在配置文件里面设置");
		}
		if(dbType==null || "".equals(dbType)){
			dbType="mysql";
			System.out.println("dbType为空设为默认值mysql");
		}
		
		try {
			GeneratorConfigXMLUtil.convertXmlStrToObjectTest(props,dbName, dbType,src,out);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	//生成-DAO/Mapper映射文件
	public static void generator(String config){
		System.out.println("开始生成代码...");
		//String config = OUT_CONFIG;
		try {
			//Resources.getResourceAsFile(config)
			config = URLResourceUtil.asFile("file:"+config).getPath();
			System.out.println(config);
		}  catch (IOException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("完整的配置文件路径：" + config);
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
		System.out.println("代码生成完成。");
	}
	
	
	public static void main(String[] args) 
	{
		//List<String> lists = Lists.newArrayList("sql/finalssm.sql","sql/finalssm_data.sql");
		//runSql(PROPERTIES,lists);
		//createConfigs();
		
		generator(OUT_CONFIG);
	}
}
