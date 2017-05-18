package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.IUserService;

import com.ssf.dao.UserDao;
import com.ssf.model.User;

/**
 * 
 * IUserService 接口实现类
 *
 * @author wang
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {

	@Resource(name = "userDao")
	private UserDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<User> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	//
	@Override
	public int deleteByPrimaryKey(Long id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public int deleteLogicByIds(Integer deleteFlag, Integer[] ids) {
		return mapper.deleteLogicByIds(deleteFlag, ids);
	}

	@Override
	public int insert(User record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return mapper.updateByPrimaryKey(record);
	}
}
