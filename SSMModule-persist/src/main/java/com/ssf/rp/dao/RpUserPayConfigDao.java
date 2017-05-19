package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpUserPayConfig;
import org.apache.ibatis.annotations.Param;;

public interface RpUserPayConfigDao extends BaseMapper<RpUserPayConfig> {
    int deleteByPrimaryKey(String id);

    RpUserPayConfig selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpUserPayConfig selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpUserPayConfig record);

    int updateByPrimaryKey(RpUserPayConfig record);
}