package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.PmsRole;
import org.apache.ibatis.annotations.Param;;

public interface PmsRoleDao extends BaseMapper<PmsRole> {
    int deleteByPrimaryKey(Long id);

    PmsRole selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsRole record);

    int updateByPrimaryKey(PmsRole record);
}