package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Sysmanrole extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sysmanrole.deleteFlag
     */
    private String deleteflag;

    /**
     *  ,所属表字段为sysmanrole.createTime
     */
    private Date createtime;

    /**
     *  ,所属表字段为sysmanrole.name
     */
    private String name;

    /**
     *  ,所属表字段为sysmanrole.description
     */
    private String description;

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
        sb.append("]");
        return sb.toString();
    }
}