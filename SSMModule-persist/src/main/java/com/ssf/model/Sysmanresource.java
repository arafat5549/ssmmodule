package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Sysmanresource extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sysmanresource.deleteFlag
     */
    private String deleteflag;

    /**
     *  ,所属表字段为sysmanresource.createTime
     */
    private Date createtime;

    /**
     *  ,所属表字段为sysmanresource.name
     */
    private String name;

    /**
     *  ,所属表字段为sysmanresource.description
     */
    private String description;

    /**
     *  ,所属表字段为sysmanresource.href
     */
    private String href;

    /**
     *  ,所属表字段为sysmanresource.resourceType
     */
    private Integer resourcetype;

    /**
     *  ,所属表字段为sysmanresource.parentId
     */
    private Integer parentid;

    private static final long serialVersionUID = 1L;

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

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
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", createtime=").append(createtime);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", href=").append(href);
        sb.append(", resourcetype=").append(resourcetype);
        sb.append(", parentid=").append(parentid);
        sb.append("]");
        return sb.toString();
    }
}