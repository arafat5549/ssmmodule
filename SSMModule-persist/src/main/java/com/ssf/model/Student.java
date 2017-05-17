package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class Student extends BaseEntity implements Serializable {
    /**
     *  名称,所属表字段为student.namess
     */
    private String namess;

    /**
     *  所属班级,所属表字段为student.classID
     */
    private Integer classid;

    private static final long serialVersionUID = 1L;

    public String getNamess() {
        return namess;
    }

    public void setNamess(String namess) {
        this.namess = namess;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", namess=").append(namess);
        sb.append(", classid=").append(classid);
        sb.append("]");
        return sb.toString();
    }
}