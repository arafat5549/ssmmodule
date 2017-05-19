package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpPayWay;
import org.apache.ibatis.annotations.Param;;

public interface RpPayWayDao extends BaseMapper<RpPayWay> {
    int deleteByPrimaryKey(String id);

    RpPayWay selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpPayWay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpPayWay record);

    int updateByPrimaryKey(RpPayWay record);
}