package com.ssf.rp.model;

import java.io.Serializable;

public class SysCategory implements Serializable {
    /**
     *  主键自增长,所属表字段为sys_category.id
     */
    private Long id;

    /**
     *  分类名称,所属表字段为sys_category.name
     */
    private String name;

    /**
     *  外键 父分类ID,所属表字段为sys_category.parent_id
     */
    private Long parentId;

    /**
     *  记录所有父分类的ID,所属表字段为sys_category.parent_ids
     */
    private String parentIds;

    /**
     *  创建时间,所属表字段为sys_category.create_time
     */
    private String createTime;

    /**
     *  更新时间,所属表字段为sys_category.update_time
     */
    private String updateTime;

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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentIds=").append(parentIds);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}