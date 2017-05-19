package com.ssf.model;

import java.io.Serializable;

public class ProductImage implements Serializable {
    /**
     *  主键自增长,所属表字段为sys_product_image.id
     */
    private Long id;

    /**
     *  外键 对应商品,所属表字段为sys_product_image.product_id
     */
    private Long productId;

    /**
     *  图片类型,所属表字段为sys_product_image.type
     */
    private String type;

    /**
     *  创建时间,所属表字段为sys_product_image.create_time
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}