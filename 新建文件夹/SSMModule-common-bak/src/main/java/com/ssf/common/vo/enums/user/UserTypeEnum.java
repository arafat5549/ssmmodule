package com.ssf.common.vo.enums.user;

/**
 * 用户 种类 划分 枚举类
 * @author wang
 *
 */
public enum UserTypeEnum {

	SUPER_USER(0, "超级管理员"), 
	IMPLEMENT_USER(1, "实施管理员"),
	SERVIER_USER(2, "业务人员");
	
	private int code;
	private String name;
	
	private UserTypeEnum(int code, String name){
		this.code = code;
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}
