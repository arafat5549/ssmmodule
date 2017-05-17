package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Demo;
import org.apache.ibatis.annotations.Param;;

public interface DemoDao extends BaseMapper<Demo> {
    int deleteByPrimaryKey(Integer id);

    Demo selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}