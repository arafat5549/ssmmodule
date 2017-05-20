package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.PmsMenuRole;
import org.apache.ibatis.annotations.Param;;

public interface PmsMenuRoleDao extends BaseMapper<PmsMenuRole> {
    int deleteByPrimaryKey(Long id);

    PmsMenuRole selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsMenuRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsMenuRole record);

    int updateByPrimaryKey(PmsMenuRole record);
}