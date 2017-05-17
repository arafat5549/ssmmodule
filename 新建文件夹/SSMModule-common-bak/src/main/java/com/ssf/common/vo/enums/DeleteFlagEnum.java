package com.ssf.common.vo.enums;

public enum DeleteFlagEnum {

	NORMAL(0, "未删除"), DELETE(1, "已删除");
	
	private int code;
	private String name;
	
	private DeleteFlagEnum(int code, String name){
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
