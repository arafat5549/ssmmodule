package com.ssf.rp.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.rp.dao.RpPayProductDao;
import com.ssf.rp.model.RpPayProduct;

/**
 * 
 * RpPayProductTest DAO测试类
 *
 * @author wang
 */
public class RpPayProductDaoTest {

	private RpPayProductDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (RpPayProductDao) ctx.getBean("rpPayProductDao");
    }

	@Test
	public void selectListByMapTest() {
		List<RpPayProduct> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		String id = "1";
		
		RpPayProduct ret = mapper.selectByPrimaryKey(id);
		System.out.println("测试selectByPrimaryKey："+ret);
	}
	
	//
	@Test
	public void deleteByPrimaryKeyTest() {
   		 String id = "1";
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
		//RpPayProduct record =new RpPayProduct();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //RpPayProduct record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//RpPayProduct record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//RpPayProduct record
		//return mapper.updateByPrimaryKey(record);
	//}
}
