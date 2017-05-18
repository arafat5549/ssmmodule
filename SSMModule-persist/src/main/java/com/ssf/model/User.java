package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class User extends BaseEntity implements Serializable {
    /**
     *  用户名,所属表字段为sys_user.name
     */
    private String name;

    /**
     *  密码,所属表字段为sys_user.password
     */
    private String password;

    /**
     *  手机号,所属表字段为sys_user.phone
     */
    private Long phone;

    /**
     *  积分,所属表字段为sys_user.score
     */
    private Integer score;

    private static final long serialVersionUID = 1L;

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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", score=").append(score);
        sb.append("]");
        return sb.toString();
    }
}