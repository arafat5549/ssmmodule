package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class ProductImage extends BaseEntity implements Serializable {
    /**
     *  外键 对应商品,所属表字段为sys_product_image.product_id
     */
    private Long productId;

    /**
     *  图片类型,所属表字段为sys_product_image.type
     */
    private String type;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}