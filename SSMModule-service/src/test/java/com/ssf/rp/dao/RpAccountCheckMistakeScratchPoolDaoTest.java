package com.ssf.rp.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.rp.dao.RpAccountCheckMistakeScratchPoolDao;
import com.ssf.rp.model.RpAccountCheckMistakeScratchPool;

/**
 * 
 * RpAccountCheckMistakeScratchPoolTest DAO测试类
 *
 * @author wang
 */
public class RpAccountCheckMistakeScratchPoolDaoTest {

	private RpAccountCheckMistakeScratchPoolDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (RpAccountCheckMistakeScratchPoolDao) ctx.getBean("rpAccountCheckMistakeScratchPoolDao");
    }

	@Test
	public void selectListByMapTest() {
		List<RpAccountCheckMistakeScratchPool> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   			 String id = "1";
		
		RpAccountCheckMistakeScratchPool ret = mapper.selectByPrimaryKey(id);
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
		//RpAccountCheckMistakeScratchPool record =new RpAccountCheckMistakeScratchPool();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //RpAccountCheckMistakeScratchPool record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//RpAccountCheckMistakeScratchPool record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//RpAccountCheckMistakeScratchPool record
		//return mapper.updateByPrimaryKey(record);
	//}
}