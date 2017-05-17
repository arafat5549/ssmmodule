package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.UserRoleRelKey;

public interface UserRoleRelDao extends BaseMapper<UserRoleRelKey> {
    int deleteByPrimaryKey(UserRoleRelKey key);
}