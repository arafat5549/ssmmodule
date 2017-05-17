package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class SysmanuserrolerelKey extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为sysmanuserrolerel.sysmanUserId
     */
    private Integer sysmanuserid;

    /**
     *  ,所属表字段为sysmanuserrolerel.sysmanRoleId
     */
    private Integer sysmanroleid;

    private static final long serialVersionUID = 1L;

    public Integer getSysmanuserid() {
        return sysmanuserid;
    }

    public void setSysmanuserid(Integer sysmanuserid) {
        this.sysmanuserid = sysmanuserid;
    }

    public Integer getSysmanroleid() {
        return sysmanroleid;
    }

    public void setSysmanroleid(Integer sysmanroleid) {
        this.sysmanroleid = sysmanroleid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysmanuserid=").append(sysmanuserid);
        sb.append(", sysmanroleid=").append(sysmanroleid);
        sb.append("]");
        return sb.toString();
    }
}