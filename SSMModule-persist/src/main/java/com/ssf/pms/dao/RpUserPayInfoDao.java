package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.RpUserPayInfo;
import org.apache.ibatis.annotations.Param;;

public interface RpUserPayInfoDao extends BaseMapper<RpUserPayInfo> {
    int deleteByPrimaryKey(String id);

    RpUserPayInfo selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpUserPayInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpUserPayInfo record);

    int updateByPrimaryKey(RpUserPayInfo record);
}