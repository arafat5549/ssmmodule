package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.BaseLocation;
import org.apache.ibatis.annotations.Param;;

public interface BaseLocationDao extends BaseMapper<BaseLocation> {
    int deleteByPrimaryKey(Long id);

    BaseLocation selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    BaseLocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseLocation record);

    int updateByPrimaryKey(BaseLocation record);
}