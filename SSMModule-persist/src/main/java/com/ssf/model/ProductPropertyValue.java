package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class ProductPropertyValue extends BaseEntity implements Serializable {
    /**
     *  外键 关联商品,所属表字段为sys_product_property_value.product_id
     */
    private Long productId;

    /**
     *  外键 关联商品属性,所属表字段为sys_product_property_value.property_id
     */
    private Long propertyId;

    /**
     *  属性值名称,所属表字段为sys_product_property_value.name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
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
        sb.append(", productId=").append(productId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}