package com.ssf.common.myPage.enums;

public enum MyPagePerLengthEnum {

	length10(10, "每页10条"), 
	length20(20, "每页20条"),
	length30(30, "每页30条"),
	length50(40, "每页50条"),;
	
	private int code;
	private String name;
	
	private MyPagePerLengthEnum(int code, String name){
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
