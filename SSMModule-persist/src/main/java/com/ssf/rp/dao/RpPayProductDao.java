package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpPayProduct;
import org.apache.ibatis.annotations.Param;;

public interface RpPayProductDao extends BaseMapper<RpPayProduct> {
    int deleteByPrimaryKey(String id);

    RpPayProduct selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpPayProduct selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpPayProduct record);

    int updateByPrimaryKey(RpPayProduct record);
}