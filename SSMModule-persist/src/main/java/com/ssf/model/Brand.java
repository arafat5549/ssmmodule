package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class Brand extends BaseEntity implements Serializable {
    /**
     *  品牌名称,所属表字段为sys_brand.name
     */
    private String name;

    /**
     *  品牌Logo,所属表字段为sys_brand.logo
     */
    private String logo;

    /**
     *  品牌介绍,所属表字段为sys_brand.describe
     */
    private String describe;

    private static final long serialVersionUID = 1L;

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
        sb.append(", name=").append(name);
        sb.append(", logo=").append(logo);
        sb.append(", describe=").append(describe);
        sb.append("]");
        return sb.toString();
    }
}