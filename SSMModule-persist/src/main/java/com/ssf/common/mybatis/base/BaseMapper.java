package com.ssf.common.mybatis.base;

import java.util.List;
import java.util.Map;

/**
 * 基础 BaseMapper 方法
 * 		需要注意，针对复合主键的话，mybatis-generator 的代码生成器部分会有区别，所以这里的BaseMapper 类文件，只有部分通用的代码部分
 * 		如果约定 后续项目中几乎不存在 复合主键的情况，那么可以把这里的代码给增加上其他通用的代码
 * 			比如说  deleteByPrimaryKey 方法，只有一个主键的话，入参为主键ID，但是复合主键的话，则入参会变为一个实体
 * @author wang
 *
 * @param <T>	泛型类
 */
public interface BaseMapper<T> {

	/**
	 * 根据map集合，查询符合条件的资源总数
	 * @param map
	 * @return
	 */
	int selectCountByMap(Map<Object, Object> map);

	/**
	 * 根据map集合，查询符合条件的资源集合
	 * @param map
	 * @return
	 */
	List<T> selectListByMap(Map<Object, Object> map);

	/**
	 * 根据资源实体信息，进行插入操作
	 * @param record
	 * @return
	 */
	int insert(T record);

	/**
	 * 根据资源实体信息，有选择性的插入操作
	 * @param record
	 * @return
	 */
	int insertSelective(T record);
	
	//测试方法-没有意义
	List<T> selectTest(Map<Object, Object> map);

}
