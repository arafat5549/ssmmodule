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
	public static void main(String[] args) throws SAXException, IOException, CloneNotSupportedException 
	{
		String out = "src/main/resources/generatorConfigPersist.xml";
		Properties props =PropertiesUtil.loadFromFile("classpath://mybatis-generator.properties");		
		System.out.println(props.get("dbName"));
		
		//List<String> lists = Lists.newArrayList("sql/data/mybatistest20160425.sql");
		//MybatisGenerator.runSql(props,lists);
		//MybatisGenerator.createConfigs(props,out);
		
		MybatisGenerator.generator(out);
		
//		System.out.println("开始生成代码...");
//		MybatisGenerator t = new MybatisGenerator();
//		String config = "generatorConfigBak.xml";
//		try {
//			config = Resources.getResourceAsFile(config).getPath();
//		}  catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		System.out.println("完整的配置文件路径：" + config);
//		String[] arg = { "-configfile", config, "-overwrite" };
//		ShellRunner.main(arg);
//		System.out.println("完成。");
	}
}
