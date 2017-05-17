/**
 * File : MybatisPluginException.java <br/>
 * Author : lenovo <br/>
 * Version : 1.1 <br/>
 * Date : 2016年11月21日 <br/>
 * Modify : <br/>
 * Package Name : com.zhongpin.zp.common.mybatis.plugin.exception <br/>
 * Project Name : zp-common <br/>
 * Description : <br/>
 * 
 */

package com.ssf.common.mybatis.exception;

/**
 * ClassName : MybatisPluginException <br/>
 * Function : mybatis插件异常信息. <br/>
 * Reason : mybatis异常信息插件处理机制. <br/>
 * Date : 2016年11月21日 下午4:45:29 <br/>
 * 
 * @author : wang <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

public class MybatisPluginException extends RuntimeException {

	
	/**  
	 * serialVersionUID : 
	 */
	private static final long serialVersionUID = -6310746119189973681L;

	public MybatisPluginException() {
		super();
	}
	
	public MybatisPluginException(String message){
		super(message);
	}
	
	public MybatisPluginException(String message, Throwable cause){
		super(message,cause);
	}
	
	public MybatisPluginException(Throwable cause){
		super(cause);
	}

}
