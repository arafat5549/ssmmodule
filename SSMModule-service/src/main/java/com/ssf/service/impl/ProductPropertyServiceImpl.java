package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.IProductPropertyService;

import com.ssf.dao.ProductPropertyDao;
import com.ssf.model.ProductProperty;

/**
 * 
 * IProductPropertyService 接口实现类
 *
 * @author wang
 */
@Service(value = "productPropertyService")
public class ProductPropertyServiceImpl implements IProductPropertyService {

	@Resource(name = "productPropertyDao")
	private ProductPropertyDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<ProductProperty> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public ProductProperty selectByPrimaryKey(Long id) {
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
	public int insert(ProductProperty record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(ProductProperty record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(ProductProperty record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProductProperty record) {
		return mapper.updateByPrimaryKey(record);
	}
}
