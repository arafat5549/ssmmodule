package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class Role extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sys_role.name
     */
    private String name;

    /**
     *  ,所属表字段为sys_role.description
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}