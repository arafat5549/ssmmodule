package com.ssf.common.vo.enums;

/**
 * 后台管理权限-资源列表- 功能分类（菜单类别 按钮类别）
 * @author lenovo
 *
 */
public enum MenuResourceTypeEnum {

	MENU(0, "菜单"), BUTTON(1, "按钮");
	
	private int code;
	private String name;
	
	private MenuResourceTypeEnum(int code, String name){
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
