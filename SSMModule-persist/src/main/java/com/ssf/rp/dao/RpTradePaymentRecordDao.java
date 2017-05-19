package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpTradePaymentRecord;
import org.apache.ibatis.annotations.Param;;

public interface RpTradePaymentRecordDao extends BaseMapper<RpTradePaymentRecord> {
    int deleteByPrimaryKey(String id);

    RpTradePaymentRecord selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpTradePaymentRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpTradePaymentRecord record);

    int updateByPrimaryKey(RpTradePaymentRecord record);
}