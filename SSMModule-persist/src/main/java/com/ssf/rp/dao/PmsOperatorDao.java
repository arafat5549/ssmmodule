package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.PmsOperator;
import org.apache.ibatis.annotations.Param;;

public interface PmsOperatorDao extends BaseMapper<PmsOperator> {
    int deleteByPrimaryKey(Long id);

    PmsOperator selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsOperator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsOperator record);

    int updateByPrimaryKey(PmsOperator record);
}