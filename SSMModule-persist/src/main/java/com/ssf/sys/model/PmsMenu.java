package com.ssf.sys.model;

import java.io.Serializable;
import java.util.Date;

public class PmsMenu implements Serializable {
    /**
     *  ,所属表字段为pms_menu.id
     */
    private Long id;

    /**
     *  ,所属表字段为pms_menu.version
     */
    private Long version;

    /**
     *  创建人,所属表字段为pms_menu.creater
     */
    private String creater;

    /**
     *  创建时间,所属表字段为pms_menu.create_time
     */
    private Date createTime;

    /**
     *  修改人,所属表字段为pms_menu.editor
     */
    private String editor;

    /**
     *  修改时间,所属表字段为pms_menu.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为pms_menu.status
     */
    private String status;

    /**
     *  ,所属表字段为pms_menu.remark
     */
    private String remark;

    /**
     *  ,所属表字段为pms_menu.is_leaf
     */
    private String isLeaf;

    /**
     *  ,所属表字段为pms_menu.level
     */
    private Short level;

    /**
     *  ,所属表字段为pms_menu.parent_id
     */
    private Long parentId;

    /**
     *  ,所属表字段为pms_menu.target_name
     */
    private String targetName;

    /**
     *  ,所属表字段为pms_menu.number
     */
    private String number;

    /**
     *  ,所属表字段为pms_menu.name
     */
    private String name;

    /**
     *  ,所属表字段为pms_menu.url
     */
    private String url;

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

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", level=").append(level);
        sb.append(", parentId=").append(parentId);
        sb.append(", targetName=").append(targetName);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append("]");
        return sb.toString();
    }
}