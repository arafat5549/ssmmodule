package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class SysmanroleresourcerelKey extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sysmanroleresourcerel.sysmanRoleId
     */
    private Integer sysmanroleid;

    /**
     *  ,所属表字段为sysmanroleresourcerel.sysmanResourceId
     */
    private Integer sysmanresourceid;

    private static final long serialVersionUID = 1L;

    public Integer getSysmanroleid() {
        return sysmanroleid;
    }

    public void setSysmanroleid(Integer sysmanroleid) {
        this.sysmanroleid = sysmanroleid;
    }

    public Integer getSysmanresourceid() {
        return sysmanresourceid;
    }

    public void setSysmanresourceid(Integer sysmanresourceid) {
        this.sysmanresourceid = sysmanresourceid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysmanroleid=").append(sysmanroleid);
        sb.append(", sysmanresourceid=").append(sysmanresourceid);
        sb.append("]");
        return sb.toString();
    }
}