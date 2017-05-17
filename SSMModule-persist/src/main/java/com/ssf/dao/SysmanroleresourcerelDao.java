package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.SysmanroleresourcerelKey;

public interface SysmanroleresourcerelDao extends BaseMapper<SysmanroleresourcerelKey> {
    int deleteByPrimaryKey(SysmanroleresourcerelKey key);
}