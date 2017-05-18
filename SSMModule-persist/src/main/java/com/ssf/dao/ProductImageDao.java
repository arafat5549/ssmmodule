package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.ProductImage;
import org.apache.ibatis.annotations.Param;;

public interface ProductImageDao extends BaseMapper<ProductImage> {
    int deleteByPrimaryKey(Long id);

    ProductImage selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    ProductImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductImage record);

    int updateByPrimaryKey(ProductImage record);
}