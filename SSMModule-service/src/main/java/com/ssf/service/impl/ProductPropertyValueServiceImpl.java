package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.IProductPropertyValueService;

import com.ssf.dao.ProductPropertyValueDao;
import com.ssf.model.ProductPropertyValue;

/**
 * 
 * IProductPropertyValueService 接口实现类
 *
 * @author wang
 */
@Service(value = "productPropertyValueService")
public class ProductPropertyValueServiceImpl implements IProductPropertyValueService {

	@Resource(name = "productPropertyValueDao")
	private ProductPropertyValueDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<ProductPropertyValue> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public ProductPropertyValue selectByPrimaryKey(Long id) {
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
	public int insert(ProductPropertyValue record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(ProductPropertyValue record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(ProductPropertyValue record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProductPropertyValue record) {
		return mapper.updateByPrimaryKey(record);
	}
}
