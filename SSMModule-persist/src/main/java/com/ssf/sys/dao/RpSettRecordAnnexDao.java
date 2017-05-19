package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.RpSettRecordAnnex;
import org.apache.ibatis.annotations.Param;;

public interface RpSettRecordAnnexDao extends BaseMapper<RpSettRecordAnnex> {
    int deleteByPrimaryKey(String id);

    RpSettRecordAnnex selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpSettRecordAnnex selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpSettRecordAnnex record);

    int updateByPrimaryKey(RpSettRecordAnnex record);
}