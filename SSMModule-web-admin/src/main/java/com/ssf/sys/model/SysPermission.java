package com.ssf.sys.model;

import java.io.Serializable;

/**
 *   sys_permission	权限表
 *
 */
public class SysPermission implements Serializable {
    /**
     *  ,所属表字段为sys_permission.id
     */
    private Integer id;

    /**
     *  应用ID,所属表字段为sys_permission.appId
     */
    private Integer appid;

    /**
     *  父ID,所属表字段为sys_permission.parentId
     */
    private Integer parentid;

    /**
     *  名称,所属表字段为sys_permission.name
     */
    private String name;

    /**
     *  权限URL,所属表字段为sys_permission.url
     */
    private String url;

    /**
     *  排序,所属表字段为sys_permission.sort
     */
    private Integer sort;

    /**
     *  是否菜单,所属表字段为sys_permission.isMenu
     */
    private Boolean ismenu;

    /**
     *  是否启用,所属表字段为sys_permission.isEnable
     */
    private Boolean isenable;

    /**
     *  图标,所属表字段为sys_permission.icon
     */
    private String icon;

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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Boolean ismenu) {
        this.ismenu = ismenu;
    }

    public Boolean getIsenable() {
        return isenable;
    }

    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appid=").append(appid);
        sb.append(", parentid=").append(parentid);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", sort=").append(sort);
        sb.append(", ismenu=").append(ismenu);
        sb.append(", isenable=").append(isenable);
        sb.append(", icon=").append(icon);
        sb.append("]");
        return sb.toString();
    }
}