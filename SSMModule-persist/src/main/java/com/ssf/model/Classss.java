package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class Classss extends BaseEntity implements Serializable {
    /**
     *  名称,所属表字段为classss.namess
     */
    private String namess;

    private static final long serialVersionUID = 1L;

    public String getNamess() {
        return namess;
    }

    public void setNamess(String namess) {
        this.namess = namess;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", namess=").append(namess);
        sb.append("]");
        return sb.toString();
    }
}