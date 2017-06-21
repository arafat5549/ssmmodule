package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysApp;

public interface SysAppDao extends BaseMapper<SysApp> {
    int deleteByPrimaryKey(Integer id);

    SysApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysApp record);

    int updateByPrimaryKey(SysApp record);
}