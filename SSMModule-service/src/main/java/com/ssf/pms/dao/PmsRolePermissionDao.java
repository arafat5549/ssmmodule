package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.PmsRolePermission;
import org.apache.ibatis.annotations.Param;;

public interface PmsRolePermissionDao extends BaseMapper<PmsRolePermission> {
    int deleteByPrimaryKey(Long id);

    PmsRolePermission selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsRolePermission record);

    int updateByPrimaryKey(PmsRolePermission record);
}