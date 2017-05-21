package com.ssf.sys.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.sys.dao.SysProductDao;
import com.ssf.sys.model.SysProduct;

/**
 * 
 * SysProductTest DAO测试类
 *
 * @author wang
 */
public class SysProductDaoTest {

	private SysProductDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (SysProductDao) ctx.getBean("sysProductDao");
    }

	@Test
	public void selectListByMapTest() {
		List<SysProduct> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		Long id = 1L;
		
		SysProduct ret = mapper.selectByPrimaryKey(id);
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
		//SysProduct record =new SysProduct();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //SysProduct record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//SysProduct record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//SysProduct record
		//return mapper.updateByPrimaryKey(record);
	//}
}
