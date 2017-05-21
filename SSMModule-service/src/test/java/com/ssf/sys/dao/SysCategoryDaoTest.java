package com.ssf.sys.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.sys.dao.SysCategoryDao;
import com.ssf.sys.model.SysCategory;

/**
 * 
 * SysCategoryTest DAO测试类
 *
 * @author wang
 */
public class SysCategoryDaoTest {

	private SysCategoryDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (SysCategoryDao) ctx.getBean("sysCategoryDao");
    }

	@Test
	public void selectListByMapTest() {
		List<SysCategory> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		Long id = 1L;
		
		SysCategory ret = mapper.selectByPrimaryKey(id);
		System.out.println("测试selectByPrimaryKey："+ret);
	}
	
	//
	@Test
	public void deleteByPrimaryKeyTest() {
   		Long id = 1L;
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
		//SysCategory record =new SysCategory();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //SysCategory record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//SysCategory record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//SysCategory record
		//return mapper.updateByPrimaryKey(record);
	//}
}
