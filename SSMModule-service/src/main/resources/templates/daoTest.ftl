package ${daoPackageName};

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import ${daoPackageName}.${className}Dao;
import ${modelPackageName}.${className};

/**
 * 
 * ${className}Test DAO测试类
 *
 * @author wang
 */
public class ${className}DaoTest {

	private ${className}Dao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (${className}Dao) ctx.getBean("${smallClassName}Dao");
    }

	@Test
	public void selectListByMapTest() {
		List<${className}> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
		 <#if idField == "Long">
   		Long id = 1L;
		</#if>
		<#if idField == "String">
   		String id = "1";
		</#if>
		
		${className} ret = mapper.selectByPrimaryKey(id);
		System.out.println("测试selectByPrimaryKey："+ret);
	}
	
	//
	@Test
	public void deleteByPrimaryKeyTest() {
	    <#if idField == "Long">
   		Long id = 1L;
		</#if>
		<#if idField == "String">
   		 String id = "1";
		</#if>
		int ret = mapper.deleteByPrimaryKey(id);
		System.out.println("测试deleteByPrimaryKeyTest："+ret);
	}
	
	//@Test
	//public void deleteLogicByIdsTest() {
		//Integer deleteFlag, Integer[] ids
		//return mapper.deleteLogicByIds(deleteFlag, ids);
	//}

	//@Test
	//public void insertTest() {
		//${className} record =new ${className}();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //${className} record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//${className} record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//${className} record
		//return mapper.updateByPrimaryKey(record);
	//}
}
