package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Sysmanuser;
import org.apache.ibatis.annotations.Param;;

public interface SysmanuserDao extends BaseMapper<Sysmanuser> {
    int deleteByPrimaryKey(Integer id);

    Sysmanuser selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Sysmanuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmanuser record);

    int updateByPrimaryKey(Sysmanuser record);
}