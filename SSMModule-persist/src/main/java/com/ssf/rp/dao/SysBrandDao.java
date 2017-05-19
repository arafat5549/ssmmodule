package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.SysBrand;
import org.apache.ibatis.annotations.Param;;

public interface SysBrandDao extends BaseMapper<SysBrand> {
    int deleteByPrimaryKey(Long id);

    SysBrand selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysBrand record);

    int updateByPrimaryKeyWithBLOBs(SysBrand record);

    int updateByPrimaryKey(SysBrand record);
}