package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.RpSettDailyCollect;
import org.apache.ibatis.annotations.Param;;

public interface RpSettDailyCollectDao extends BaseMapper<RpSettDailyCollect> {
    int deleteByPrimaryKey(String id);

    RpSettDailyCollect selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpSettDailyCollect selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpSettDailyCollect record);

    int updateByPrimaryKey(RpSettDailyCollect record);
}