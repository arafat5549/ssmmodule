package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysCategory;
import org.apache.ibatis.annotations.Param;;

public interface SysCategoryDao extends BaseMapper<SysCategory> {
    int deleteByPrimaryKey(Long id);

    SysCategory selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysCategory record);

    int updateByPrimaryKey(SysCategory record);
}