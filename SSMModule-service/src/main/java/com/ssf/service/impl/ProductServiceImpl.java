package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.IProductService;

import com.ssf.dao.ProductDao;
import com.ssf.model.Product;

/**
 * 
 * IProductService 接口实现类
 *
 * @author wang
 */
@Service(value = "productService")
public class ProductServiceImpl implements IProductService {

	@Resource(name = "productDao")
	private ProductDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<Product> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public Product selectByPrimaryKey(Long id) {
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
	public int insert(Product record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Product record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Product record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Product record) {
		return mapper.updateByPrimaryKey(record);
	}
}
