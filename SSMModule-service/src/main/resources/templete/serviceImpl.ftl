package ${packageName}.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.I${className}Service;

import com.ssf.dao.${className}Dao;
import com.ssf.model.${className};

/**
 * 
 * I${className}Service 接口实现类
 *
 * @author wang
 */
@Service(value = "${smallClassName}Service")
public class ${className}ServiceImpl implements I${className}Service {

	@Resource(name = "${smallClassName}Dao")
	private ${className}Dao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<${className}> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public ${className} selectByPrimaryKey(Long id) {
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
