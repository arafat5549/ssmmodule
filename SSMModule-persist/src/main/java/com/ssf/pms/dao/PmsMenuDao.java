package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.PmsMenu;
import org.apache.ibatis.annotations.Param;;

public interface PmsMenuDao extends BaseMapper<PmsMenu> {
    int deleteByPrimaryKey(Long id);

    PmsMenu selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMenu record);

    int updateByPrimaryKey(PmsMenu record);
}