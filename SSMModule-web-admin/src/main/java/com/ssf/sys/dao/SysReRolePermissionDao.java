package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysReRolePermission;

public interface SysReRolePermissionDao extends BaseMapper<SysReRolePermission> {
    int deleteByPrimaryKey(Integer id);

    SysReRolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysReRolePermission record);

    int updateByPrimaryKey(SysReRolePermission record);
}