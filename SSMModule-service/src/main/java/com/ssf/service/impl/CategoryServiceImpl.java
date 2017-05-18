package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.ICategoryService;

import com.ssf.dao.CategoryDao;
import com.ssf.model.Category;

/**
 * 
 * ICategoryService 接口实现类
 *
 * @author wang
 */
@Service(value = "categoryService")
public class CategoryServiceImpl implements ICategoryService {

	@Resource(name = "categoryDao")
	private CategoryDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<Category> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public Category selectByPrimaryKey(Long id) {
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
	public int insert(Category record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Category record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Category record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Category record) {
		return mapper.updateByPrimaryKey(record);
	}
}
