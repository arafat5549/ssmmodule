package com.ssf.rp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.ssf.common.spring.SpringContextHelper;

import com.ssf.rp.service.IRpTradePaymentOrderService;
import com.ssf.rp.dao.RpTradePaymentOrderDao;
import com.ssf.rp.model.RpTradePaymentOrder;
import com.ssf.cache.RedisCache;
import com.ssf.utils.PageUtil;

/**
 * 
 * IRpTradePaymentOrderService 接口实现类
 *
 * @author wang
 */
@Service(value = "rpTradePaymentOrderService")
public class RpTradePaymentOrderServiceImpl implements IRpTradePaymentOrderService {

	private static final Logger LOG = LoggerFactory.getLogger(RpTradePaymentOrderServiceImpl.class);
	private static final String PREFIX_CAHCE = RedisCache.CAHCENAME + "|RpTradePaymentOrder|";
	private static final Class<RpTradePaymentOrder> SELF_CLASS = RpTradePaymentOrder.class;

	@Resource(name = "rpTradePaymentOrderDao")
	private RpTradePaymentOrderDao mapper;

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
	public List<RpTradePaymentOrder> selectListByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectListByMap|" + map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, map, mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}
	@Override
	public List<RpTradePaymentOrder> listPage(int offset,int limit,Map<Object, Object> map)
	{
		String cache_key = PREFIX_CAHCE + "listPage|" + offset +"|"+ limit+ "|" +map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, PageUtil.getPageParamMap(offset, limit,map), mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}

	@Override
	public RpTradePaymentOrder selectByPrimaryKey(String id) {
		String cache_key = PREFIX_CAHCE + "selectByPrimaryKey|" + id;
		if(springContextHelper.getRedisAcaliable())
		{
			RpTradePaymentOrder result_cache = redisCache.getCache(cache_key, SELF_CLASS);
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
	public int deleteByPrimaryKey(String id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public int deleteLogicByIds(Integer deleteFlag, Integer[] ids) {
		return mapper.deleteLogicByIds(deleteFlag, ids);
	}

	@Override
	public int insert(RpTradePaymentOrder record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(RpTradePaymentOrder record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(RpTradePaymentOrder record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(RpTradePaymentOrder record) {
		return mapper.updateByPrimaryKey(record);
	}
	
	/**
	  * 底下是一些自定义的方法
	**/
}
