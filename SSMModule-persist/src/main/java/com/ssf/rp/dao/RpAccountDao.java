package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.RpAccount;
import org.apache.ibatis.annotations.Param;;

public interface RpAccountDao extends BaseMapper<RpAccount> {
    int deleteByPrimaryKey(String id);

    RpAccount selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpAccount record);

    int updateByPrimaryKey(RpAccount record);
}