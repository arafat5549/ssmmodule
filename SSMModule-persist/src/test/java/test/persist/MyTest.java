package test.persist;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.MybatisGenerator;
import org.springside.modules.utils.base.PropertiesUtil;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

public class MyTest 
{
	private static final String ORIGIN_CONFIG = "generatorConfig.xml";
	private static final String OUT_CONFIG   = "src/main/resources/generatorConfigBak.xml";
	
	public static void main(String[] args) throws SAXException, IOException, CloneNotSupportedException 
	{
		
		Properties props =PropertiesUtil.loadFromFile("classpath://jdbc.properties");		
//		System.out.println(props.get("dbName"));
//		
//		List<String> lists = Lists.newArrayList("sql/data/mybatistest.sql","sql/data/mybatistest_data.sql");
//		MybatisGenerator.runSql(props,lists);s
		MybatisGenerator.createConfigs(props,ORIGIN_CONFIG,OUT_CONFIG);
		MybatisGenerator.generator(OUT_CONFIG);
		
	}
}
