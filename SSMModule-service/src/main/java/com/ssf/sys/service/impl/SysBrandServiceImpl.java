package com.ssf.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.ssf.common.spring.SpringContextHelper;

import com.ssf.sys.service.ISysBrandService;
import com.ssf.sys.dao.SysBrandDao;
import com.ssf.sys.model.SysBrand;
import com.ssf.cache.RedisCache;
import com.ssf.utils.PageUtil;

/**
 * 
 * ISysBrandService 接口实现类
 *
 * @author wang
 */
@Service(value = "sysBrandService")
public class SysBrandServiceImpl implements ISysBrandService {

	private static final Logger LOG = LoggerFactory.getLogger(SysBrandServiceImpl.class);
	private static final String PREFIX_CAHCE = RedisCache.CAHCENAME + "|SysBrand|";
	private static final Class<SysBrand> SELF_CLASS = SysBrand.class;

	@Resource(name = "sysBrandDao")
	private SysBrandDao mapper;

	@Resource(name= "redisCache")
	private RedisCache redisCache;
	
	@Resource(name="springContextHelper")
	private SpringContextHelper springContextHelper;
	
	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		//String cache_key = PREFIX_CAHCE + "selectCountByMap|" + map;
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<SysBrand> selectListByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectListByMap|" + map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, map, mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}
	@Override
	public List<SysBrand> listPage(int offset,int limit,Map<Object, Object> map)
	{
		String cache_key = PREFIX_CAHCE + "listPage|" + offset +"|"+ limit+ "|" +map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, PageUtil.getPageParamMap(offset, limit,map), mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}

	@Override
	public SysBrand selectByPrimaryKey(Long id) {
		String cache_key = PREFIX_CAHCE + "selectByPrimaryKey|" + id;
		if(springContextHelper.getRedisAcaliable())
		{
			SysBrand result_cache = redisCache.getCache(cache_key, SELF_CLASS);
			if (result_cache != null) {
				LOG.info("get cache with key:" + cache_key);
			} else {
				result_cache = mapper.selectByPrimaryKey(id);
				if(result_cache!=null){
					redisCache.putCacheWithExpireTime(cache_key, result_cache, RedisCache.CAHCETIME);
					LOG.info("put cache with key:" + cache_key);
				}
				else{
					LOG.error(cache_key+":获取的是空的对象");
				}
				return result_cache;
			}
			return result_cache;
		}
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
	public int insert(SysBrand record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(SysBrand record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(SysBrand record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysBrand record) {
		return mapper.updateByPrimaryKey(record);
	}
	
	/**
	  * 底下是一些自定义的方法
	**/
}
