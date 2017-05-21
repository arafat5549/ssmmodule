package com.ssf.rp.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.rp.dao.RpSettRecordDao;
import com.ssf.rp.model.RpSettRecord;

/**
 * 
 * RpSettRecordTest DAO测试类
 *
 * @author wang
 */
public class RpSettRecordDaoTest {

	private RpSettRecordDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (RpSettRecordDao) ctx.getBean("rpSettRecordDao");
    }

	@Test
	public void selectListByMapTest() {
		List<RpSettRecord> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		String id = "1";
		
		RpSettRecord ret = mapper.selectByPrimaryKey(id);
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
		//RpSettRecord record =new RpSettRecord();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //RpSettRecord record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//RpSettRecord record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//RpSettRecord record
		//return mapper.updateByPrimaryKey(record);
	//}
}
