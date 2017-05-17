package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Sysmanrole;
import org.apache.ibatis.annotations.Param;;

public interface SysmanroleDao extends BaseMapper<Sysmanrole> {
    int deleteByPrimaryKey(Integer id);

    Sysmanrole selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Sysmanrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmanrole record);

    int updateByPrimaryKey(Sysmanrole record);
}