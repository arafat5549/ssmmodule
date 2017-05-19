package com.ssf.pms.dao;

import com.ssf.common.mybatis.base.BaseMapper;
import com.ssf.pms.model.RpUserBankAccount;
import org.apache.ibatis.annotations.Param;;

public interface RpUserBankAccountDao extends BaseMapper<RpUserBankAccount> {
    int deleteByPrimaryKey(String id);

    RpUserBankAccount selectByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    int deleteByPrimaryKeyAndTableName(@Param("id") String id, @Param("dynamicTableName") String dynamicTableName);

    RpUserBankAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpUserBankAccount record);

    int updateByPrimaryKey(RpUserBankAccount record);
}