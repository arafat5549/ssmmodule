package test.web.admin;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.mybatis.generator.CodeGeneratorUtil;
import org.mybatis.generator.MybatisGenerator;
import org.springside.modules.utils.base.PropertiesUtil;

/**
 * 自动生成 Controller和JSP模板
 * @author wyy
 *
 */
public class JSPGenertor {

	public static void main(String[] args) 
	{
		Properties props =PropertiesUtil.loadFromFile("classpath://jdbc.properties");		
		//List<String> tableNames = MybatisGenerator.getTableNames(props);
		Map<String, String> comments = MybatisGenerator.getTableComments(props);
		
		
		CodeGeneratorUtil.jspGenerator(props, comments, MybatisGenerator.BASE_PREFIX);
	}
}
