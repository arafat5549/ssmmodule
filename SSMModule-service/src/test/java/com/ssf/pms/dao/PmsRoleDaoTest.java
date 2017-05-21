package com.ssf.pms.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.pms.dao.PmsRoleDao;
import com.ssf.pms.model.PmsRole;

/**
 * 
 * PmsRoleTest DAO测试类
 *
 * @author wang
 */
public class PmsRoleDaoTest {

	private PmsRoleDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (PmsRoleDao) ctx.getBean("pmsRoleDao");
    }

	@Test
	public void selectListByMapTest() {
		List<PmsRole> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
   		Long id = 1L;
		
		PmsRole ret = mapper.selectByPrimaryKey(id);
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
		//PmsRole record =new PmsRole();
		//return mapper.insert(record);
	//}

	//@Test
	//public void insertSelectiveTest() {
	    //PmsRole record
		//return mapper.insertSelective(record);
	//}

	//@Test
	//public void updateByPrimaryKeySelectiveTest() {
		//PmsRole record
		//return mapper.updateByPrimaryKeySelective(record);
	//}

	//@Test
	//public void updateByPrimaryKey() {
		//PmsRole record
		//return mapper.updateByPrimaryKey(record);
	//}
}
