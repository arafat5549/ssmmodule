package com.ssf.cache;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.utils.ProtoStuffSerializerUtil;

/**
 * redis缓存
 * 
 * @author yingjun
 *
 */
@Component("redisCache")
public class RedisCache {
	
	
	public final static String CAHCENAME="cache";//缓存名
	public final static int CAHCETIME=60;//默认缓存时间

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public <T> boolean putCache(String key, T obj) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serialize(obj);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.setNX(bkey, bvalue);
			}
		});
		return result;
	}

	public <T> void putCacheWithExpireTime(String key, T obj, final long expireTime) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serialize(obj);
		redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.setEx(bkey, expireTime, bvalue);
				return true;
			}
		});
	}

	public <T> boolean putListCache(String key, List<T> objList) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serializeList(objList);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.setNX(bkey, bvalue);
			}
		});
		return result;
	}

	public <T> boolean putListCacheWithExpireTime(String key, List<T> objList, final long expireTime) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serializeList(objList);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.setEx(bkey, expireTime, bvalue);
				return true;
			}
		});
		return result;
	}

	public <T> T getCache(final String key, Class<T> targetClass) {
		byte[] result = redisTemplate.execute(new RedisCallback<byte[]>() {
			@Override
			public byte[] doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.get(key.getBytes());
			}
		});
		if (result == null) {
			return null;
		}
		return ProtoStuffSerializerUtil.deserialize(result, targetClass);
	}

	public <T> List<T> getListCache(final String key, Class<T> targetClass) {
		byte[] result = redisTemplate.execute(new RedisCallback<byte[]>() {
			@Override
			public byte[] doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.get(key.getBytes());
			}
		});
		if (result == null) {
			return null;
		}
		return ProtoStuffSerializerUtil.deserializeList(result, targetClass);
	}
	
//	/**
//	 * 查找ListCache，有
//	 */
//	public <T> List<T> findListCache(final String key, Class<T> targetClass,Logger LOG)
//	{
//		List<T> result_cache = getListCache(key, targetClass);
//		if (result_cache != null) {
//			LOG.info("get cache with key:" + key);
//		} else {
//			// 缓存中没有再去数据库取，并插入缓存（缓存时间为60秒）
//			result_cache = productDao.queryAll(offset, limit);
//			putListCacheWithExpireTime(key, result_cache, RedisCache.CAHCETIME);
//			LOG.info("put cache with key:" + key);
//			return result_cache;
//		}
//		return result_cache;
//	}

	/**
	 * 精确删除key
	 * 
	 * @param key
	 */
	public void deleteCache(String key) {
		redisTemplate.delete(key);
	}

	/**
	 * 模糊删除key
	 * 
	 * @param pattern
	 */
	public void deleteCacheWithPattern(String pattern) {
		Set<String> keys = redisTemplate.keys(RedisCache.CAHCENAME + "|" + pattern);
		redisTemplate.delete(keys);
	}

	/**
	 * 清空所有缓存
	 */
	public void clearCache() {
		deleteCacheWithPattern(RedisCache.CAHCENAME+"|*");
	}
	/**
	 * 通用方法
	 * @param cache_key
	 * @param t
	 * @param sql
	 * @param dao
	 * @param LOG
	 * @return
	 */ 
	public <T> List<T> cacheList(String cache_key,Class<T> t,Map<Object , Object>  paramMap,BaseMapper<T> dao,Logger LOG){
		List<T> result_cache = getListCache(cache_key, t);
	
		if (result_cache != null) {
			LOG.info("get cache with key:" + cache_key);
		} else {
			result_cache = dao.selectListByMap(paramMap);
			putListCacheWithExpireTime(cache_key, result_cache, RedisCache.CAHCETIME);
			LOG.info("put cache with key:" + cache_key);
			return result_cache;
		}
		return result_cache;
	}
	//---------------------------------------------------------------------------------
	public <T> T cacheObject(String cache_key,Class<T> t,Map<Object,Object>  paramMap,BaseMapper<T> dao,Logger LOG){
		T result_cache = getCache(cache_key, t);
		if (result_cache != null) {
			LOG.info("get cache with key:" + cache_key);
		} else {
			List<T> lists = dao.selectListByMap(paramMap);
			result_cache = lists!=null&&lists.size()>0 ? lists.get(0) :null;
			if(result_cache!=null){
				putCacheWithExpireTime(cache_key, result_cache, RedisCache.CAHCETIME);
				LOG.info("put cache with key:" + cache_key);
			}
			else{
				LOG.error(cache_key+":获取的是空的对象");
			}
			return result_cache;
		}
		return result_cache;
	}
//	//按主键查找
//	public <T> T cacheObjectPK(String cache_key,Class<T> t,Object id,BaseMapper<T> dao,Logger LOG)
//	{
//		T result_cache = getCache(cache_key, t);
//		if (result_cache != null) {
//			LOG.info("get cache with key:" + cache_key);
//		} else {
//			result_cache = dao.sele
//			if(result_cache!=null){
//				putCacheWithExpireTime(cache_key, result_cache, RedisCache.CAHCETIME);
//				LOG.info("put cache with key:" + cache_key);
//			}
//			else{
//				LOG.error(cache_key+":获取的是空的对象");
//			}
//			return result_cache;
//		}
//		return result_cache;
//	}
	
	//-生成CacheKey
	public  static String generatorCacheKey(String base,Map<Object,Object>  paramMap){
		String cache_key = base + paramMap;
		return cache_key;
	}
	
	
}
