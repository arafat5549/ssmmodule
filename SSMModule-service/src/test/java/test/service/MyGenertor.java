package test.service;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.MybatisGenerator;
import org.springside.modules.utils.base.PropertiesUtil;
import org.springside.modules.utils.io.URLResourceUtil;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

public class MyGenertor 
{
	//private static final String ORIGIN_CONFIG = MybatisGenerator.ORIGIN_CONFIG;//"generatorConfig.xml";
	private static final String OUT_CONFIG    = MybatisGenerator.OUT_CONFIG;   //"generatorConfigBak.xml";
	private static final List<String> BASE_PREFIX   = MybatisGenerator.BASE_PREFIX;
	//public static final String CONFIG_GENERATOR = "mybatis-generator.properties";
	
	
	public static void main(String[] args) throws SAXException, IOException, CloneNotSupportedException 
	{
		List<String> configs = Lists.newArrayList("generator/generatorConfig_sys.xml", 
				"generator/generatorConfig_pms.xml","generator/generatorConfig_rp.xml");
		Properties props =PropertiesUtil.loadFromFile("classpath://jdbc.properties");		
		List<String> tableNames = MybatisGenerator.getTableNames(props);
		
		
		
		//1.执行sql语句
		//List<String> lists = Lists.newArrayList("sql/finalssm.sql","sql/finalssm.sql","sql/alipay.sql");
		//MybatisGenerator.runSql(props,lists);
		
		//2.生成配置文件
		//configs =MybatisGenerator.generateConfigXML(props,tableNames, BASE_PREFIX);
		System.out.println(configs);
		
		//生成dao和映射文件
//		for (String conf : configs) {
//			MybatisGenerator.generator(conf);
//		}
		
		//生成Service  如果没有主键id 则不会生成Service
		CodeGeneratorUtil.codeGenerator(props, tableNames, BASE_PREFIX);
		
	}
}
