package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.RpAccountCheckMistakeScratchPool;
import org.apache.ibatis.annotations.Param;;

public interface RpAccountCheckMistakeScratchPoolDao extends BaseMapper<RpAccountCheckMistakeScratchPool> {
    int deleteByPrimaryKey(String id);

    RpAccountCheckMistakeScratchPool selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpAccountCheckMistakeScratchPool selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpAccountCheckMistakeScratchPool record);

    int updateByPrimaryKey(RpAccountCheckMistakeScratchPool record);
}