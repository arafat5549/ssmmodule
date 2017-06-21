package com.ssf.common.dto;


/**
 * 基础返回码，具体业务返回码可继承ResultCodeEnum
 * 
 * 业务异常基类，所有业务异常都必须继承于此异常 定义异常时，需要先确定异常所属模块。 例如：无效用户可以定义为 [10010001]
 * 前四位数为系统模块编号，后4位为错误代码 ,唯一
 * @author Joe
 */
public enum ResultCodeEnum {

//	public final static int SUCCESS = 1;// 成功
//
//	// 通用错误以9开头
//	public final static int ERROR = 9999;// 未知错误
//	public final static int APPLICATION_ERROR = 9000;// 应用级错误
//	public final static int VALIDATE_ERROR = 9001;// 参数验证错误
//	public final static int SERVICE_ERROR = 9002;// 业务逻辑验证错误
//	public final static int CACHE_ERROR = 9003;// 缓存访问错误
//	public final static int DAO_ERROR = 9004;// 数据访问错误
	
	    //
		SUCCESS(1,"访问成功"),
		ERROR(99990001,"未知错误"),
		APPLICATION_ERROR(90000001,"应用级错误"),
		VALIDATE_ERROR(90010001,"参数验证错误"),
		SERVICE_ERROR(90020001,"业务逻辑验证错误"),
		CACHE_ERROR(90030001,"缓存访问错误"),
		DAO_ERROR(90040001,"数据访问错误"),
		
		// 数据库想操作异常
		DB_INSERT_RESULT_ERROR(99990001, "db insert error"),
		DB_UPDATE_RESULT_ERROR(99990002, "db update error"),
		DB_SELECTONE_IS_NULL(99990003,"db select return null"),
		// 系统异常
		INNER_ERROR(99980001, "系统错误"), 
		TOKEN_IS_ILLICIT(99980002, "Token验证非法"), 
		SESSION_IS_OUT_TIME(99980003, "会话超时"),
		// 用户相关异常
		INVALID_USER(1001001, "无效用户");

		private int state;

		private String msg;

		ResultCodeEnum(int state, String msg) {
			this.state = state;
			this.msg = msg;
		}

		public int getState() {
			return state;
		}

		public String getMsg() {
			return msg;
		}

		public static ResultCodeEnum stateOf(int index) {
			for (ResultCodeEnum state : values()) {
				if (state.getState() == index) {
					return state;
				}
			}
			return null;
		}
}
