package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysProduct;
import org.apache.ibatis.annotations.Param;;

public interface SysProductDao extends BaseMapper<SysProduct> {
    int deleteByPrimaryKey(Long id);

    SysProduct selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysProduct record);

    int updateByPrimaryKey(SysProduct record);
}