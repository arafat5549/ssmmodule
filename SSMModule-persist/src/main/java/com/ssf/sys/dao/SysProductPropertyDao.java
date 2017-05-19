package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysProductProperty;
import org.apache.ibatis.annotations.Param;;

public interface SysProductPropertyDao extends BaseMapper<SysProductProperty> {
    int deleteByPrimaryKey(Long id);

    SysProductProperty selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysProductProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysProductProperty record);

    int updateByPrimaryKey(SysProductProperty record);
}