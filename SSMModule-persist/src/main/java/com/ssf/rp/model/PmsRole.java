package com.ssf.rp.model;

import java.io.Serializable;
import java.util.Date;

public class PmsRole implements Serializable {
    /**
     *  主键,所属表字段为pms_role.id
     */
    private Long id;

    /**
     *  ,所属表字段为pms_role.version
     */
    private Long version;

    /**
     *  创建人,所属表字段为pms_role.creater
     */
    private String creater;

    /**
     *  创建时间,所属表字段为pms_role.create_time
     */
    private Date createTime;

    /**
     *  修改人,所属表字段为pms_role.editor
     */
    private String editor;

    /**
     *  修改时间,所属表字段为pms_role.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为pms_role.status
     */
    private String status;

    /**
     *  ,所属表字段为pms_role.remark
     */
    private String remark;

    /**
     *  角色类型（1:超级管理员角色，0:普通操作员角色）,所属表字段为pms_role.role_code
     */
    private String roleCode;

    /**
     *  ,所属表字段为pms_role.role_name
     */
    private String roleName;

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

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleName=").append(roleName);
        sb.append("]");
        return sb.toString();
    }
}