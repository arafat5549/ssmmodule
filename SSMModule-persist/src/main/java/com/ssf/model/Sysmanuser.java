package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Sysmanuser extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sysmanuser.deleteFlag
     */
    private String deleteflag;

    /**
     *  ,所属表字段为sysmanuser.createTime
     */
    private Date createtime;

    /**
     *  ,所属表字段为sysmanuser.name
     */
    private String name;

    /**
     *  ,所属表字段为sysmanuser.password
     */
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        sb.append(", password=").append(password);
        sb.append("]");
        return sb.toString();
    }
}