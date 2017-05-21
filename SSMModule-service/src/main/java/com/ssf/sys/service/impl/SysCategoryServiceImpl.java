package com.ssf.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.ssf.common.spring.SpringContextHelper;

import com.ssf.sys.service.ISysCategoryService;
import com.ssf.sys.dao.SysCategoryDao;
import com.ssf.sys.model.SysCategory;
import com.ssf.cache.RedisCache;
import com.ssf.utils.PageUtil;

import com.ssf.common.myPage.MyPageView;
import com.ssf.common.vo.mybatis.pagination.Page;
/**
 * 
 * ISysCategoryService 接口实现类
 *
 * @author wang
 */
@Service(value = "sysCategoryService")
public class SysCategoryServiceImpl implements ISysCategoryService {

	private static final Logger LOG = LoggerFactory.getLogger(SysCategoryServiceImpl.class);
	private static final String PREFIX_CAHCE = RedisCache.CAHCENAME + "|SysCategory|";
	private static final Class<SysCategory> SELF_CLASS = SysCategory.class;

	@Resource(name = "sysCategoryDao")
	private SysCategoryDao mapper;

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
	public List<SysCategory> selectListByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectListByMap|" + map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, map, mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}
	@Override
	public List<SysCategory> listPage(int offset,int limit,Map<Object, Object> map)
	{
		String cache_key = PREFIX_CAHCE + "listPage|" + offset +"|"+ limit+ "|" +map;
		if(springContextHelper.getRedisAcaliable())
		{
			return redisCache.cacheList(cache_key, SELF_CLASS, PageUtil.getPageParamMap(offset, limit,map), mapper, LOG);
		}
		return mapper.selectListByMap(map);
	}

	@Override
	public SysCategory selectByPrimaryKey(Long id) {
		String cache_key = PREFIX_CAHCE + "selectByPrimaryKey|" + id;
		if(springContextHelper.getRedisAcaliable())
		{
			SysCategory result_cache = redisCache.getCache(cache_key, SELF_CLASS);
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
	public int insert(SysCategory record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(SysCategory record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(SysCategory record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysCategory record) {
		return mapper.updateByPrimaryKey(record);
	}
	
	@Override
	public MyPageView<SysCategory> generateMyPageViewVO(Map<Object, Object> map) {
		
		int _totalCount = mapper.selectCountByMap(map);
		
		List<SysCategory> _list = mapper.selectListByMap(map);
		
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
		MyPageView<SysCategory> pageView = MyPageView.generaterMyPageView(recordPerPage, currentPage, _totalCount, _list);
		
		return pageView;
		
	}
	
	/**
	  * 底下是一些自定义的方法
	**/
}
