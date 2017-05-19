package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpRefundRecord;
import org.apache.ibatis.annotations.Param;;

public interface RpRefundRecordDao extends BaseMapper<RpRefundRecord> {
    int deleteByPrimaryKey(String id);

    RpRefundRecord selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpRefundRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpRefundRecord record);

    int updateByPrimaryKey(RpRefundRecord record);
}