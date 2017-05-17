package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class Resource extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sys_resource.name
     */
    private String name;

    /**
     *  ,所属表字段为sys_resource.description
     */
    private String description;

    /**
     *  ,所属表字段为sys_resource.href
     */
    private String href;

    /**
     *  ,所属表字段为sys_resource.resourceType
     */
    private Integer resourcetype;

    /**
     *  ,所属表字段为sys_resource.parentId
     */
    private Integer parentid;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(Integer resourcetype) {
        this.resourcetype = resourcetype;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", href=").append(href);
        sb.append(", resourcetype=").append(resourcetype);
        sb.append(", parentid=").append(parentid);
        sb.append("]");
        return sb.toString();
    }
}