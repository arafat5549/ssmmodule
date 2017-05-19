package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.SysProductPropertyValue;
import org.apache.ibatis.annotations.Param;;

public interface SysProductPropertyValueDao extends BaseMapper<SysProductPropertyValue> {
    int deleteByPrimaryKey(Long id);

    SysProductPropertyValue selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysProductPropertyValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysProductPropertyValue record);

    int updateByPrimaryKey(SysProductPropertyValue record);
}