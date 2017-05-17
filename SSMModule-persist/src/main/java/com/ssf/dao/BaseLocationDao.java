package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.BaseLocation;
import org.apache.ibatis.annotations.Param;;

public interface BaseLocationDao extends BaseMapper<BaseLocation> {
    int deleteByPrimaryKey(Integer id);

    BaseLocation selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    BaseLocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseLocation record);

    int updateByPrimaryKey(BaseLocation record);
}