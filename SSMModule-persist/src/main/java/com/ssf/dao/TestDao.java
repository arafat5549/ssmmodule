package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Test;
import org.apache.ibatis.annotations.Param;;

public interface TestDao extends BaseMapper<Test> {
    int deleteByPrimaryKey(Integer id);

    Test selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}