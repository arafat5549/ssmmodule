package com.ssf.pms.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.ssf.common.spring.SpringContextHelper;

import com.ssf.pms.service.IPmsRoleOperatorService;
import com.ssf.pms.dao.PmsRoleOperatorDao;
import com.ssf.pms.model.PmsRoleOperator;
import com.ssf.cache.RedisCache;
import com.ssf.utils.PageUtil;

import com.ssf.common.myPage.MyPageView;
import com.ssf.common.vo.mybatis.pagination.Page;
/**
 * 
 * IPmsRoleOperatorService 接口实现类
 *
 * @author wang
 */
@Service(value = "pmsRoleOperatorService")
public class PmsRoleOperatorServiceImpl implements IPmsRoleOperatorService {

	private static final Logger LOG = LoggerFactory.getLogger(PmsRoleOperatorServiceImpl.class);
	private static final String PREFIX_CAHCE = RedisCache.CAHCENAME + "|PmsRoleOperator|";
	private static final Class<PmsRoleOperator> SELF_CLASS = PmsRoleOperator.class;

	@Resource(name = "pmsRoleOperatorDao")
	private PmsRoleOperatorDao mapper;

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
	public List<PmsRoleOperator> selectListByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectListByMap|" + map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, map, mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}
	@Override
	public List<PmsRoleOperator> listPage(int offset,int limit,Map<Object, Object> map)
	{
		String cache_key = PREFIX_CAHCE + "listPage|" + offset +"|"+ limit+ "|" +map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, PageUtil.getPageParamMap(offset, limit,map), mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}

	@Override
	public PmsRoleOperator selectByPrimaryKey(Long id) {
		String cache_key = PREFIX_CAHCE + "selectByPrimaryKey|" + id;
		if(springContextHelper.getRedisAcaliable())
		{
			PmsRoleOperator result_cache = redisCache.getCache(cache_key, SELF_CLASS);
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
	public int insert(PmsRoleOperator record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(PmsRoleOperator record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(PmsRoleOperator record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PmsRoleOperator record) {
		return mapper.updateByPrimaryKey(record);
	}
	
	@Override
	public MyPageView<PmsRoleOperator> generateMyPageViewVO(Map<Object, Object> map) {
		
		int _totalCount = mapper.selectCountByMap(map);
		
		List<PmsRoleOperator> _list = mapper.selectListByMap(map);
		
		int recordPerPage = 10;
		int currentPage = 1;
		if(map.get("page") != null) {
			Object _pageObj = map.get("page");
			if(_pageObj instanceof Page) {
				Page _page = (Page)_pageObj;
				currentPage = _page.getPageNo();
				recordPerPage = _page.getLength();
			}
		}
		MyPageView<PmsRoleOperator> pageView = MyPageView.generaterMyPageView(recordPerPage, currentPage, _totalCount, _list);
		
		return pageView;
		
	}
	
	/**
	  * 底下是一些自定义的方法
	**/
}
