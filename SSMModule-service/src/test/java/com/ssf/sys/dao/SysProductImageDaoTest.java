package com.ssf.sys.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.sys.dao.SysProductImageDao;
import com.ssf.sys.model.SysProductImage;

/**
 * 
 * SysProductImageTest DAO测试类
 *
 * @author wang
 */
public class SysProductImageDaoTest {

	private SysProductImageDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (SysProductImageDao) ctx.getBean("sysProductImageDao");
    }

	@Test
	public void selectListByMapTest() {
		List<SysProductImage> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		Long id = 1L;
		
		SysProductImage ret = mapper.selectByPrimaryKey(id);
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
		//SysProductImage record =new SysProductImage();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //SysProductImage record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//SysProductImage record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//SysProductImage record
		//return mapper.updateByPrimaryKey(record);
	//}
}
