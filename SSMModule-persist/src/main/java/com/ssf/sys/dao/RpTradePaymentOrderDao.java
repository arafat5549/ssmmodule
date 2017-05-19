package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.RpTradePaymentOrder;
import org.apache.ibatis.annotations.Param;;

public interface RpTradePaymentOrderDao extends BaseMapper<RpTradePaymentOrder> {
    int deleteByPrimaryKey(String id);

    RpTradePaymentOrder selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpTradePaymentOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpTradePaymentOrder record);

    int updateByPrimaryKey(RpTradePaymentOrder record);
}