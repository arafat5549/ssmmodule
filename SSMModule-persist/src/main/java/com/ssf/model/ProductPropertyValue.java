package com.ssf.model;

import java.io.Serializable;

public class ProductPropertyValue implements Serializable {
    /**
     *  主键自增长,所属表字段为sys_product_property_value.id
     */
    private Long id;

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

    /**
     *  创建时间,所属表字段为sys_product_property_value.create_time
     */
    private String createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}