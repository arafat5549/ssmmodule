package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.PmsPermission;
import org.apache.ibatis.annotations.Param;;

public interface PmsPermissionDao extends BaseMapper<PmsPermission> {
    int deleteByPrimaryKey(Long id);

    PmsPermission selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsPermission record);

    int updateByPrimaryKey(PmsPermission record);
}