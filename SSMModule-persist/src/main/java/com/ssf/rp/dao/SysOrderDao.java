package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.SysOrder;
import org.apache.ibatis.annotations.Param;;

public interface SysOrderDao extends BaseMapper<SysOrder> {
    int deleteByPrimaryKey(Long id);

    SysOrder selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
}