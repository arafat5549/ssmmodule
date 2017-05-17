package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Sysmanresource;
import org.apache.ibatis.annotations.Param;;

public interface SysmanresourceDao extends BaseMapper<Sysmanresource> {
    int deleteByPrimaryKey(Integer id);

    Sysmanresource selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Sysmanresource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmanresource record);

    int updateByPrimaryKey(Sysmanresource record);
}