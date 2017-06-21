package com.ssf.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 *   sys_app	应用表
 *
 */
public class SysApp implements Serializable {
    /**
     *  ,所属表字段为sys_app.id
     */
    private Integer id;

    /**
     *  名称,所属表字段为sys_app.name
     */
    private String name;

    /**
     *  排序,所属表字段为sys_app.sort
     */
    private Integer sort;

    /**
     *  创建时间,所属表字段为sys_app.createTime
     */
    private Date createtime;

    /**
     *  是否启用,所属表字段为sys_app.isEnable
     */
    private Boolean isenable;

    /**
     *  编码,所属表字段为sys_app.code
     */
    private String code;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsenable() {
        return isenable;
    }

    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", createtime=").append(createtime);
        sb.append(", isenable=").append(isenable);
        sb.append(", code=").append(code);
        sb.append("]");
        return sb.toString();
    }
}