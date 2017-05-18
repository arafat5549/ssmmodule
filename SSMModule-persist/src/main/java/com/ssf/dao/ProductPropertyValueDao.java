package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.ProductPropertyValue;
import org.apache.ibatis.annotations.Param;;

public interface ProductPropertyValueDao extends BaseMapper<ProductPropertyValue> {
    int deleteByPrimaryKey(Long id);

    ProductPropertyValue selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    ProductPropertyValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductPropertyValue record);

    int updateByPrimaryKey(ProductPropertyValue record);
}