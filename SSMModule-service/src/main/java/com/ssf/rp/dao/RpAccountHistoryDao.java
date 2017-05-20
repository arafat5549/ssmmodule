package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpAccountHistory;
import org.apache.ibatis.annotations.Param;;

public interface RpAccountHistoryDao extends BaseMapper<RpAccountHistory> {
    int deleteByPrimaryKey(String id);

    RpAccountHistory selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpAccountHistory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpAccountHistory record);

    int updateByPrimaryKey(RpAccountHistory record);
}