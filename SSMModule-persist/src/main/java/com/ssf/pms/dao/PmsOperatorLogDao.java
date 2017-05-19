package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.PmsOperatorLog;
import org.apache.ibatis.annotations.Param;;

public interface PmsOperatorLogDao extends BaseMapper<PmsOperatorLog> {
    int deleteByPrimaryKey(Long id);

    PmsOperatorLog selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsOperatorLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsOperatorLog record);

    int updateByPrimaryKey(PmsOperatorLog record);
}