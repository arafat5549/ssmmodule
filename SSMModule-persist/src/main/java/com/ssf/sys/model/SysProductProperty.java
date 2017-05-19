package com.ssf.sys.model;

import java.io.Serializable;

public class SysProductProperty implements Serializable {
    /**
     *  主键自增长,所属表字段为sys_product_property.id
     */
    private Long id;

    /**
     *  主键自增长,所属表字段为sys_product_property.category_id
     */
    private Long categoryId;

    /**
     *  属性名称,所属表字段为sys_product_property.name
     */
    private String name;

    /**
     *  创建时间,所属表字段为sys_product_property.create_time
     */
    private String createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}