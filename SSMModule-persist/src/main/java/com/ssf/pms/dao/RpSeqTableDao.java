package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.RpSeqTable;
import org.apache.ibatis.annotations.Param;;

public interface RpSeqTableDao extends BaseMapper<RpSeqTable> {
    int deleteByPrimaryKey(String seqName);

    RpSeqTable selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpSeqTable selectByPrimaryKey(String seqName);

    int updateByPrimaryKeySelective(RpSeqTable record);

    int updateByPrimaryKey(RpSeqTable record);
}