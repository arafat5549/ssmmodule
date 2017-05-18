package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ssf.service.IBrandService;
import com.ssf.cache.RedisCache;
import com.ssf.dao.BrandDao;
import com.ssf.model.Brand;
import com.ssf.model.Product;

/**
 * 
 * IBrandService 接口实现类
 *
 * @author wang
 */
@Service(value = "brandService")
public class BrandServiceImpl implements IBrandService {

	private static final Logger LOG = LoggerFactory.getLogger(BrandServiceImpl.class);
	private static final String PREFIX_CAHCE = RedisCache.CAHCENAME + "|Brand|";
	private static final Class<Brand> SELF_CLASS = Brand.class;
	
	@Resource(name = "brandDao")
	private BrandDao mapper;
	
	@Resource(name= "redisCache")
	private RedisCache redisCache;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectCountByMap|" + map;
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<Brand> selectListByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectListByMap|" + map;
		//redisCache.cacheList(cache_key, t, paramMap, dao, LOG)
		return mapper.selectListByMap(map);
	}

	@Override
	public Brand selectByPrimaryKey(Long id) {
		String cache_key = PREFIX_CAHCE + "selectByPrimaryKey|" + id;
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
	public int insert(Brand record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Brand record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Brand record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Brand record) {
		return mapper.updateByPrimaryKey(record);
	}
}
