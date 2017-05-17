package com.ssf.common.vo.enums.sql.operation;

/**
 * SQL 操作 操作符部分，用于数据权限部分来限定动态SQL 的操作；
 * 数据权限部分增加 动态的数据权限规则（SQL部分）
 * 形如 (=)  相等操作 (like) 模糊匹配操作 值范围包含操作(in)
 * @author alexgaoyh
 *
 */
public enum SQLOperationModelEnum {

	EQUALS(200, "=", "相等"),
	GREATER(201, "myGreater_", "大于"),
	LESSER(202, "myLesser_", "小于"),
	LIKE(300, "myLike_", "前后模糊匹配"),
	LIKE_START(301, "myLikeStart_", "起始点模糊匹配"),
	LIKE_END(302, "myLikeEnd_", "终止点模糊匹配"),
	IN(400, "myIn_", "包含某些范围");
	
	private int code;
	private String name;
	private String desc;
	
	private SQLOperationModelEnum(int code, String name, String desc){
		this.code = code;
		this.name = name;
		this.desc = desc;
	}
	
	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
}
