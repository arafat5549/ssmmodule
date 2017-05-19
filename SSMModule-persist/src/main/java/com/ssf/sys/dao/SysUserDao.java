package com.ssf.sys.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.sys.model.SysUser;
import org.apache.ibatis.annotations.Param;;

public interface SysUserDao extends BaseMapper<SysUser> {
    int deleteByPrimaryKey(Long id);

    SysUser selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}