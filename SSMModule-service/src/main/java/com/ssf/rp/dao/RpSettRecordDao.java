package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpSettRecord;
import org.apache.ibatis.annotations.Param;;

public interface RpSettRecordDao extends BaseMapper<RpSettRecord> {
    int deleteByPrimaryKey(String id);

    RpSettRecord selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpSettRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpSettRecord record);

    int updateByPrimaryKey(RpSettRecord record);
}