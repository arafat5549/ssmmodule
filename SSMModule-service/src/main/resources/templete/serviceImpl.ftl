package ${packageName}.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.I${className}Service;

import com.ssf.dao.${className}Dao;
import com.ssf.model.${className};
import com.ssf.cache.RedisCache;

/**
 * 
 * I${className}Service 接口实现类
 *
 * @author wang
 */
@Service(value = "${smallClassName}Service")
public class ${className}ServiceImpl implements I${className}Service {

	private static final Logger LOG = LoggerFactory.getLogger(${className}ServiceImpl.class);
	private static final String PREFIX_CAHCE = RedisCache.CAHCENAME + "|${className}|";
	private static final Class<${className}> SELF_CLASS = ${className}.class;

	@Resource(name = "${smallClassName}Dao")
	private ${className}Dao mapper;

	@Resource(name= "redisCache")
	private RedisCache redisCache;
	
	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectCountByMap|" + map;
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<${className}> selectListByMap(Map<Object, Object> map) {
		String cache_key = PREFIX_CAHCE + "selectListByMap|" + map;
		return mapper.selectListByMap(map);
	}

	@Override
	public ${className} selectByPrimaryKey(Long id) {
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
	public int insert(${className} record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(${className} record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(${className} record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(${className} record) {
		return mapper.updateByPrimaryKey(record);
	}
}
