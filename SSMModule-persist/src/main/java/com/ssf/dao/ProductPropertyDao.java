package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.ProductProperty;
import org.apache.ibatis.annotations.Param;;

public interface ProductPropertyDao extends BaseMapper<ProductProperty> {
    int deleteByPrimaryKey(Long id);

    ProductProperty selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    ProductProperty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductProperty record);

    int updateByPrimaryKey(ProductProperty record);
}