package com.ssf.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

import com.ssf.dao.UserDao;
import com.ssf.model.User;

/**
 * 
 * UserTest DAO测试类
 *
 * @author wang
 */
public class UserDaoTest {

	private UserDao mapper;

	@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        mapper = (UserDao) ctx.getBean("user");
    }

	@Test
	public void selectListByMapTest() {
		List<User> ret = mapper.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}

	@Test
	public void selectByPrimaryKeyTest() {
		Long id =1L;
		User ret = mapper.selectByPrimaryKey(id);
		System.out.println("测试selectByPrimaryKey："+ret);
	}
	
	//
	@Test
	public void deleteByPrimaryKeyTest() {
	    Long id = 1L;
		int ret = mapper.deleteByPrimaryKey(id);
		System.out.println("测试deleteByPrimaryKeyTest："+ret);
	}
	
	@Test
	public void deleteLogicByIdsTest() {
		//Integer deleteFlag, Integer[] ids
		//return mapper.deleteLogicByIds(deleteFlag, ids);
	}

	@Test
	public void insertTest() {
		//User record 
		//return mapper.insert(record);
	}

	@Test
	public void insertSelectiveTest() {
	    //User record
		//return mapper.insertSelective(record);
	}

	@Test
	public void updateByPrimaryKeySelectiveTest() {
		//User record
		//return mapper.updateByPrimaryKeySelective(record);
	}

	@Test
	public void updateByPrimaryKey() {
		//User record
		//return mapper.updateByPrimaryKey(record);
	}
}
