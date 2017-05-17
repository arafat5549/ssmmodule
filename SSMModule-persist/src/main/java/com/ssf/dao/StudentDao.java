package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Student;
import org.apache.ibatis.annotations.Param;;

public interface StudentDao extends BaseMapper<Student> {
    int deleteByPrimaryKey(Integer id);

    Student selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}