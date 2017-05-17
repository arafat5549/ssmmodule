package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Classss;
import org.apache.ibatis.annotations.Param;;

public interface ClassssDao extends BaseMapper<Classss> {
    int deleteByPrimaryKey(Long id);

    Classss selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Classss selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Classss record);

    int updateByPrimaryKey(Classss record);
}