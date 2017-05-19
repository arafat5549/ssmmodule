package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpUserInfo;
import org.apache.ibatis.annotations.Param;;

public interface RpUserInfoDao extends BaseMapper<RpUserInfo> {
    int deleteByPrimaryKey(String id);

    RpUserInfo selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpUserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpUserInfo record);

    int updateByPrimaryKey(RpUserInfo record);
}