package com.ssf.sys.model;

import java.io.Serializable;

/**
 *   sys_role	角色表
 *
 */
public class SysRole implements Serializable {
    /**
     *  ,所属表字段为sys_role.id
     */
    private Integer id;

    /**
     *  应用ID,所属表字段为sys_role.appId
     */
    private Integer appid;

    /**
     *  名称,所属表字段为sys_role.name
     */
    private String name;

    /**
     *  排序,所属表字段为sys_role.sort
     */
    private Integer sort;

    /**
     *  描述,所属表字段为sys_role.description
     */
    private String description;

    /**
     *  是否启用,所属表字段为sys_role.isEnable
     */
    private Boolean isenable;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsenable() {
        return isenable;
    }

    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appid=").append(appid);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", description=").append(description);
        sb.append(", isenable=").append(isenable);
        sb.append("]");
        return sb.toString();
    }
}