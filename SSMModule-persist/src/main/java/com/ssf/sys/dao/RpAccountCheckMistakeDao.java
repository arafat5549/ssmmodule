package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.RpAccountCheckMistake;
import org.apache.ibatis.annotations.Param;;

public interface RpAccountCheckMistakeDao extends BaseMapper<RpAccountCheckMistake> {
    int deleteByPrimaryKey(String id);

    RpAccountCheckMistake selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpAccountCheckMistake selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpAccountCheckMistake record);

    int updateByPrimaryKey(RpAccountCheckMistake record);
}