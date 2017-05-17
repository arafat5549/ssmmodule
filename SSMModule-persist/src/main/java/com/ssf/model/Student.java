package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Student extends BaseEntity implements Serializable {
    /**
     *  创建时间,所属表字段为student.createTime
     */
    private Date createtime;

    /**
     *  删除标示，是否删除状态,所属表字段为student.deleteFlag
     */
    private String deleteflag;

    /**
     *  名称,所属表字段为student.namess
     */
    private String namess;

    /**
     *  所属班级,所属表字段为student.classID
     */
    private Integer classid;

    private static final long serialVersionUID = 1L;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

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
        sb.append(", createtime=").append(createtime);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", namess=").append(namess);
        sb.append(", classid=").append(classid);
        sb.append("]");
        return sb.toString();
    }
}