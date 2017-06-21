package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysReUserRole;

public interface SysReUserRoleDao extends BaseMapper<SysReUserRole> {
    int deleteByPrimaryKey(Integer id);

    SysReUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysReUserRole record);

    int updateByPrimaryKey(SysReUserRole record);
}