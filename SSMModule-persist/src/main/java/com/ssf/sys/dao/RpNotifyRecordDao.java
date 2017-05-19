package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.RpNotifyRecord;
import org.apache.ibatis.annotations.Param;;

public interface RpNotifyRecordDao extends BaseMapper<RpNotifyRecord> {
    int deleteByPrimaryKey(String id);

    RpNotifyRecord selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpNotifyRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpNotifyRecord record);

    int updateByPrimaryKey(RpNotifyRecord record);
}