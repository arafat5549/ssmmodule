package com.ssf.sys.model;

import java.io.Serializable;

/**
 *   sys_re_user_app	用户应用表
 *
 */
public class SysReUserApp implements Serializable {
    /**
     *  ,所属表字段为sys_re_user_app.id
     */
    private Integer id;

    /**
     *  用户ID ,所属表字段为sys_re_user_app.userId
     */
    private Integer userid;

    /**
     *  应用ID,所属表字段为sys_re_user_app.appId
     */
    private Integer appid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", appid=").append(appid);
        sb.append("]");
        return sb.toString();
    }
}