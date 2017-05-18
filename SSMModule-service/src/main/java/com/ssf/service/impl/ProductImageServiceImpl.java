package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.IProductImageService;

import com.ssf.dao.ProductImageDao;
import com.ssf.model.ProductImage;

/**
 * 
 * IProductImageService 接口实现类
 *
 * @author wang
 */
@Service(value = "productImageService")
public class ProductImageServiceImpl implements IProductImageService {

	@Resource(name = "productImageDao")
	private ProductImageDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<ProductImage> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public ProductImage selectByPrimaryKey(Long id) {
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
	public int insert(ProductImage record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(ProductImage record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(ProductImage record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ProductImage record) {
		return mapper.updateByPrimaryKey(record);
	}
}
