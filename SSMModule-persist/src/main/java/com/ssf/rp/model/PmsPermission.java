package com.ssf.rp.model;

import java.io.Serializable;
import java.util.Date;

public class PmsPermission implements Serializable {
    /**
     *  主键,所属表字段为pms_permission.id
     */
    private Long id;

    /**
     *  ,所属表字段为pms_permission.version
     */
    private Long version;

    /**
     *  创建人,所属表字段为pms_permission.creater
     */
    private String creater;

    /**
     *  创建时间,所属表字段为pms_permission.create_time
     */
    private Date createTime;

    /**
     *  修改人,所属表字段为pms_permission.editor
     */
    private String editor;

    /**
     *  修改时间,所属表字段为pms_permission.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为pms_permission.status
     */
    private String status;

    /**
     *  ,所属表字段为pms_permission.remark
     */
    private String remark;

    /**
     *  ,所属表字段为pms_permission.permission_name
     */
    private String permissionName;

    /**
     *  ,所属表字段为pms_permission.permission
     */
    private String permission;

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

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
        sb.append(", permissionName=").append(permissionName);
        sb.append(", permission=").append(permission);
        sb.append("]");
        return sb.toString();
    }
}