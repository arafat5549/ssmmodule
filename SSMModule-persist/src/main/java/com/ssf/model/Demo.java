package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Demo extends BaseEntity implements Serializable {
    /**
     *  创建时间,所属表字段为demo.createTime
     */
    private Date createtime;

    /**
     *  删除标示，是否删除状态,所属表字段为demo.deleteFlag
     */
    private String deleteflag;

    /**
     *  名称,所属表字段为demo.name
     */
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", createtime=").append(createtime);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}