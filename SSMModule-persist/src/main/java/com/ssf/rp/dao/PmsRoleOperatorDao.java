package com.ssf.rp.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.rp.model.PmsRoleOperator;
import org.apache.ibatis.annotations.Param;;

public interface PmsRoleOperatorDao extends BaseMapper<PmsRoleOperator> {
    int deleteByPrimaryKey(Long id);

    PmsRoleOperator selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    PmsRoleOperator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsRoleOperator record);

    int updateByPrimaryKey(PmsRoleOperator record);
}