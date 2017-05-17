package com.ssf.common.vo.GMT.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.ssf.common.utils.DateUtils;
import com.ssf.common.utils.StringUtilss;

public class GMTDateTransHandler implements TypeHandler<Object> {

	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, (String) parameter);
	}

	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		String _value = rs.getString(columnName);
		if(rs.wasNull()) {
			return "";
		} else {
			if(StringUtilss.isNotEmpty(_value)) {
				return GMTTimeZoneTransToSysTimeZone(_value);
			} else {
				return "";
			}
			
		}
	}

	@Override
	public Object getResult(ResultSet rs, int columnIndex) throws SQLException {
		String _value = rs.getString(columnIndex);
		if(rs.wasNull()) {
			return "";
		} else {
			if(StringUtilss.isNotEmpty(_value)) {
				return GMTTimeZoneTransToSysTimeZone(_value);
			} else {
				return "";
			}
			
		}
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		return "";
	}
	
	/**
     * 将 GMT 时间 转换为服务系统服务器所属时区的时间
     * @param GMTTimeStr GMT 时间格式，支持格式为  20160613040211
     * @return code对应的枚举类
     */
    private String GMTTimeZoneTransToSysTimeZone(String GMTTimeStr) {
    	if(StringUtilss.isNotEmpty(GMTTimeStr)) {
    		return DateUtils.GMTTimeZoneTransToSysTimeZoneStr(GMTTimeStr);
    	} else {
    		return "";
    	}
    }

}
