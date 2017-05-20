package com.ssf.sys.model;

import com.ssf.common.vo.enums.DeleteFlagEnum;
import java.io.Serializable;

public class SysUser implements Serializable {
    /**
     *  主键自增长,所属表字段为sys_user.id
     */
    private Long id;

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

    /**
     *  创建时间,所属表字段为sys_user.create_time
     */
    private String createTime;

    /**
     *  更新时间,所属表字段为sys_user.update_time
     */
    private String updateTime;

    /**
     *  删除标记,所属表字段为sys_user.DELETE_FLAG
     */
    private DeleteFlagEnum deleteFlag;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public DeleteFlagEnum getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(DeleteFlagEnum deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", score=").append(score);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append("]");
        return sb.toString();
    }
}