package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.RpNotifyRecordLog;
import org.apache.ibatis.annotations.Param;;

public interface RpNotifyRecordLogDao extends BaseMapper<RpNotifyRecordLog> {
    int deleteByPrimaryKey(String id);

    RpNotifyRecordLog selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpNotifyRecordLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpNotifyRecordLog record);

    int updateByPrimaryKey(RpNotifyRecordLog record);
}