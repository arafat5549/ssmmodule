package com.ssf.common.mybatis.base;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import com.ssf.common.utils.StringUtilss;
import com.ssf.common.vo.enums.DeleteFlagEnum;

/**
 * mybatis 部分，抽离公共基础model
 * @author wang
 *
 */
public class BaseEntity implements Serializable, IDynamicTableName{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID， 主键部分
	 */
	private Long id;

	/**
	 * 删除标示
	 */
	private String deleteFlag;

	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建时间
	 */
	private Date updateTime;
	
	/**
	 * 动态表名部分，与数据库内真是的字段无关性
	 */
    private String dynamicTableName;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	@Transient
	public String getDynamicTableName() {
		if(this.dynamicTableName != null && !this.dynamicTableName.equals("")) {
			return dynamicTableName;
		} else {
			String simpleNameTemp = this.getClass().getSimpleName();
			String tableNameTemp = StringUtilss.toUnderlineCase(simpleNameTemp);
			return tableNameTemp;
		}
		
	}

	public void setDynamicTableName(String dynamicTableName) {
		this.dynamicTableName = dynamicTableName;
	}

	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
	        sb.append(",id=").append(id);
	        sb.append(",deleteFlag=").append(deleteFlag);
	        sb.append(",createTime=").append(createTime);
	        sb.append(",updateTime=").append(updateTime);
	        sb.append(",dynamicTableName=").append(dynamicTableName);
	        return sb.toString();
	}
	
	
}
