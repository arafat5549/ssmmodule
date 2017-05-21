package com.ssf.rp.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.rp.dao.RpTradePaymentOrderDao;
import com.ssf.rp.model.RpTradePaymentOrder;

/**
 * 
 * RpTradePaymentOrderTest DAO测试类
 *
 * @author wang
 */
public class RpTradePaymentOrderDaoTest {

	private RpTradePaymentOrderDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (RpTradePaymentOrderDao) ctx.getBean("rpTradePaymentOrderDao");
    }

	@Test
	public void selectListByMapTest() {
		List<RpTradePaymentOrder> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		String id = "1";
		
		RpTradePaymentOrder ret = mapper.selectByPrimaryKey(id);
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
		//RpTradePaymentOrder record =new RpTradePaymentOrder();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //RpTradePaymentOrder record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//RpTradePaymentOrder record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//RpTradePaymentOrder record
		//return mapper.updateByPrimaryKey(record);
	//}
}
