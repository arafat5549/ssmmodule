package com.ssf.pms.model;

import java.io.Serializable;
import java.util.Date;

public class PmsOperator implements Serializable {
    /**
     *  主键,所属表字段为pms_operator.id
     */
    private Long id;

    /**
     *  ,所属表字段为pms_operator.version
     */
    private Long version;

    /**
     *  创建人,所属表字段为pms_operator.creater
     */
    private String creater;

    /**
     *  创建时间,所属表字段为pms_operator.create_time
     */
    private Date createTime;

    /**
     *  修改人,所属表字段为pms_operator.editor
     */
    private String editor;

    /**
     *  修改时间,所属表字段为pms_operator.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为pms_operator.status
     */
    private String status;

    /**
     *  ,所属表字段为pms_operator.remark
     */
    private String remark;

    /**
     *  ,所属表字段为pms_operator.real_name
     */
    private String realName;

    /**
     *  ,所属表字段为pms_operator.mobile_no
     */
    private String mobileNo;

    /**
     *  ,所属表字段为pms_operator.login_name
     */
    private String loginName;

    /**
     *  ,所属表字段为pms_operator.login_pwd
     */
    private String loginPwd;

    /**
     *  ,所属表字段为pms_operator.type
     */
    private String type;

    /**
     *  ,所属表字段为pms_operator.salt
     */
    private String salt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", editor=").append(editor);
        sb.append(", editTime=").append(editTime);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", realName=").append(realName);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", loginName=").append(loginName);
        sb.append(", loginPwd=").append(loginPwd);
        sb.append(", type=").append(type);
        sb.append(", salt=").append(salt);
        sb.append("]");
        return sb.toString();
    }
}