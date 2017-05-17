package com.ssf.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.model.Mutidatabase;
import org.apache.ibatis.annotations.Param;;

public interface MutidatabaseDao extends BaseMapper<Mutidatabase> {
    int deleteByPrimaryKey(Long id);

    Mutidatabase selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    Mutidatabase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Mutidatabase record);

    int updateByPrimaryKey(Mutidatabase record);
}