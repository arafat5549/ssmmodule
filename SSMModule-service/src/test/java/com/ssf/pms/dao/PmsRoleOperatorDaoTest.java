package com.ssf.pms.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.pms.dao.PmsRoleOperatorDao;
import com.ssf.pms.model.PmsRoleOperator;

/**
 * 
 * PmsRoleOperatorTest DAO测试类
 *
 * @author wang
 */
public class PmsRoleOperatorDaoTest {

	private PmsRoleOperatorDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (PmsRoleOperatorDao) ctx.getBean("pmsRoleOperatorDao");
    }

	@Test
	public void selectListByMapTest() {
		List<PmsRoleOperator> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		Long id = 1L;
		
		PmsRoleOperator ret = mapper.selectByPrimaryKey(id);
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
		//PmsRoleOperator record =new PmsRoleOperator();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //PmsRoleOperator record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//PmsRoleOperator record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//PmsRoleOperator record
		//return mapper.updateByPrimaryKey(record);
	//}
}
