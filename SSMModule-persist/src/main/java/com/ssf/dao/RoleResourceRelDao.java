package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.RoleResourceRelKey;

public interface RoleResourceRelDao extends BaseMapper<RoleResourceRelKey> {
    int deleteByPrimaryKey(RoleResourceRelKey key);
}