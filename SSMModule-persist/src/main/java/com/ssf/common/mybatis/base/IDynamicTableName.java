/**
 * File : IDynamicTableName.java <br/>
 * Author : lenovo <br/>
 * Version : 1.1 <br/>
 * Date : 2017年1月10日 <br/>
 * Modify : <br/>
 * Package Name : com.zhongpin.zp.persist.base.entity <br/>
 * Project Name : zp-persist-base <br/>
 * Description : <br/>
 * 
 */

package com.ssf.common.mybatis.base;

/**
 * ClassName : IDynamicTableName <br/>
 * Function : Mybatis 动态表名处理.  <br/>
 * Reason : Mybatis 动态表名处理.  <br/>
 * Date : 2017年1月10日 上午11:06:47 <br/>
 * 
 * @author : wang <br/>
 * @version : 1.1 <br/>
 * @since : JDK 1.6 <br/>
 * @see
 */

public interface IDynamicTableName {

	/**
     * 获取动态表名 - 这个方法是关键，只要有返回值，不是null和''，就会用返回值作为表名
     *
     * @return
     */
    String getDynamicTableName();
}
