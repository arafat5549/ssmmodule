package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysProductImage;
import org.apache.ibatis.annotations.Param;;

public interface SysProductImageDao extends BaseMapper<SysProductImage> {
    int deleteByPrimaryKey(Long id);

    SysProductImage selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysProductImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysProductImage record);

    int updateByPrimaryKey(SysProductImage record);
}