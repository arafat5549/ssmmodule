package com.ssf.sys.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.sys.dao.SysOrderItemDao;
import com.ssf.sys.model.SysOrderItem;

/**
 * 
 * SysOrderItemTest DAO测试类
 *
 * @author wang
 */
public class SysOrderItemDaoTest {

	private SysOrderItemDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (SysOrderItemDao) ctx.getBean("sysOrderItemDao");
    }

	@Test
	public void selectListByMapTest() {
		List<SysOrderItem> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		Long id = 1L;
		
		SysOrderItem ret = mapper.selectByPrimaryKey(id);
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
		//SysOrderItem record =new SysOrderItem();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //SysOrderItem record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//SysOrderItem record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//SysOrderItem record
		//return mapper.updateByPrimaryKey(record);
	//}
}
