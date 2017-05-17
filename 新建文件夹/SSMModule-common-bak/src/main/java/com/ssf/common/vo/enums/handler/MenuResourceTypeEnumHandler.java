package com.ssf.common.vo.enums.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.ssf.common.vo.enums.MenuResourceTypeEnum;

public class MenuResourceTypeEnumHandler extends BaseTypeHandler<MenuResourceTypeEnum> {
 
    @Override
    public MenuResourceTypeEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
        int i = rs.getInt(columnName);
         
        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的code值，定位MenuResourceTypeEnum子类
            return locateMenuResourceTypeEnum(i);
        }
    }
 
    @Override
    public MenuResourceTypeEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
        int i = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的code值，定位MenuResourceTypeEnum子类
            return locateMenuResourceTypeEnum(i);
        }
    }
 
    @Override
    public MenuResourceTypeEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 根据数据库存储类型决定获取类型，本例子中数据库中存放INT类型
        int i = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            // 根据数据库中的code值，定位MenuResourceTypeEnum子类
            return locateMenuResourceTypeEnum(i);
        }
    }
 
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, MenuResourceTypeEnum parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setInt(i, parameter.getCode());
 
    }
     
    /**
     * 枚举类型转换，由于构造函数获取了枚举的子类enums，让遍历更加高效快捷
     * @param code 数据库中存储的自定义code属性
     * @return code对应的枚举类
     */
    private MenuResourceTypeEnum locateMenuResourceTypeEnum(int code) {
    	MenuResourceTypeEnum[] enums = MenuResourceTypeEnum.values();
        for(MenuResourceTypeEnum status : enums) {
            if(status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的枚举类型：" + code + ",请核对");
    }
 
}
