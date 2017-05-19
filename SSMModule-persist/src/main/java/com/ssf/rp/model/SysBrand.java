package com.ssf.rp.model;

import java.io.Serializable;

public class SysBrand implements Serializable {
    /**
     *  主键自增长,所属表字段为sys_brand.id
     */
    private Long id;

    /**
     *  品牌名称,所属表字段为sys_brand.name
     */
    private String name;

    /**
     *  品牌Logo,所属表字段为sys_brand.logo
     */
    private String logo;

    /**
     *  创建时间,所属表字段为sys_brand.create_time
     */
    private String createTime;

    /**
     *  更新时间,所属表字段为sys_brand.update_time
     */
    private String updateTime;

    /**
     *  品牌介绍,所属表字段为sys_brand.describe
     */
    private String describe;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", logo=").append(logo);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", describe=").append(describe);
        sb.append("]");
        return sb.toString();
    }
}