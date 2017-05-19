package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.SysOrderItem;
import org.apache.ibatis.annotations.Param;;

public interface SysOrderItemDao extends BaseMapper<SysOrderItem> {
    int deleteByPrimaryKey(Long id);

    SysOrderItem selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysOrderItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysOrderItem record);

    int updateByPrimaryKey(SysOrderItem record);
}