package com.ssf.sys.service;

import java.util.List;
import java.util.Map;

import com.ssf.sys.model.SysCategory;

/**
 * 
 $ {className} 模块 接口
 * 
 * @author wang
 *
 */
public interface ISysCategoryService {

    //读取部分
    
	int selectCountByMap(Map<Object, Object> map);
	/**
	 * 根据参数过滤结果集<p>
	 * 
	 *  用法例子(分页效果):<br>
	 *  Map<Object,Object> map = new HashMap<Object, Object>();<br>
	 * 	Page page = new Page(0, 10);<br>
	 * 	map.put("page", page);<br>
	 * 	map.put("databaseId","mysql");//分页时候记得指定数据库集合<br>
	 * 
	 * @param map
	 * @return
	 */
	List<SysCategory> selectListByMap(Map<Object, Object> map);

	List<SysCategory> listPage(int offset,int limit,Map<Object, Object> map);

	SysCategory selectByPrimaryKey(Long id);
    
    //写部分
    /**
	 * 删除操作(注意会直接删除数据,物理删除)
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Long id);
    
	/**
	 * 根据ids数组，逻辑删除对象(逻辑删除 置delete标志位)
	 * @param deleteFlag 要设置的delete标志位 0普通 1删除
	 * @param ids 
	 * @return
	 */
	int deleteLogicByIds(Integer deleteFlag, Integer[] ids);
	
	int insert(SysCategory record);

	int insertSelective(SysCategory record);

	int updateByPrimaryKeySelective(SysCategory record);

	int updateByPrimaryKey(SysCategory record);
    
}
