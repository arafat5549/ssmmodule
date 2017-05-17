package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class Mutidatabase extends BaseEntity implements Serializable {
    /**
     *  ,所属表字段为mutidatabase.id
     */
    //private Long id;

    /**
     *  ,所属表字段为mutidatabase.name
     */
    private String name;

    private static final long serialVersionUID = 1L;

//    @Override
//    public Long getId() {
//        return this.id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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
        //sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}