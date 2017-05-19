package test.persist;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.MybatisGenerator;
import org.springside.modules.utils.base.PropertiesUtil;
import org.springside.modules.utils.io.URLResourceUtil;
import org.xml.sax.SAXException;

import com.google.common.collect.Lists;

public class MyTest 
{
	//private static final String ORIGIN_CONFIG = MybatisGenerator.ORIGIN_CONFIG;//"generatorConfig.xml";
	private static final String OUT_CONFIG    = MybatisGenerator.OUT_CONFIG;   //"generatorConfigBak.xml";
	private static final List<String> BASE_PREFIX   = MybatisGenerator.BASE_PREFIX;
	//public static final String CONFIG_GENERATOR = "mybatis-generator.properties";
	
	
	public static void main(String[] args) throws SAXException, IOException, CloneNotSupportedException 
	{
		
		Properties props =PropertiesUtil.loadFromFile("classpath://jdbc.properties");		
		
		//List<String> lists = Lists.newArrayList("sql/finalssm.sql","sql/finalssm.sql","sql/alipay.sql");
		//MybatisGenerator.runSql(props,lists);
		
		List<String> configs = MybatisGenerator.generateConfigXML(props, BASE_PREFIX);
		System.out.println(configs);
		
		for (String conf : configs) {
			MybatisGenerator.generator(conf);
		}
		
	}
}
