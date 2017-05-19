package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.RpAccountCheckBatch;
import org.apache.ibatis.annotations.Param;;

public interface RpAccountCheckBatchDao extends BaseMapper<RpAccountCheckBatch> {
    int deleteByPrimaryKey(String id);

    RpAccountCheckBatch selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpAccountCheckBatch selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpAccountCheckBatch record);

    int updateByPrimaryKey(RpAccountCheckBatch record);
}