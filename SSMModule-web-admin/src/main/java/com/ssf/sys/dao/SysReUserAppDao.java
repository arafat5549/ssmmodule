package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysReUserApp;

public interface SysReUserAppDao extends BaseMapper<SysReUserApp> {
    int deleteByPrimaryKey(Integer id);

    SysReUserApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysReUserApp record);

    int updateByPrimaryKey(SysReUserApp record);
}