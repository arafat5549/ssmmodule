package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.SysmanuserrolerelKey;

public interface SysmanuserrolerelDao extends BaseMapper<SysmanuserrolerelKey> {
    int deleteByPrimaryKey(SysmanuserrolerelKey key);
}