package com.ssf.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 *   sys_user	用户表
 *
 */
public class SysUser implements Serializable {
    /**
     *  ,所属表字段为sys_user.id
     */
    private Integer id;

    /**
     *  登录名,所属表字段为sys_user.account
     */
    private String account;

    /**
     *  密码(加密),所属表字段为sys_user.password
     */
    private String password;

    /**
     *  最后登录IP,所属表字段为sys_user.lastLoginIp
     */
    private String lastloginip;

    /**
     *  最后登录时间,所属表字段为sys_user.lastLoginTime
     */
    private Date lastlogintime;

    /**
     *  登录总次数,所属表字段为sys_user.loginCount
     */
    private Integer logincount;

    /**
     *  创建时间,所属表字段为sys_user.createTime
     */
    private Date createtime;

    /**
     *  是否启用,所属表字段为sys_user.isEnable
     */
    private Boolean isenable;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", lastloginip=").append(lastloginip);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", logincount=").append(logincount);
        sb.append(", createtime=").append(createtime);
        sb.append(", isenable=").append(isenable);
        sb.append("]");
        return sb.toString();
    }
}