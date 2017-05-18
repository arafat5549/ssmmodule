package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;

public class OrderItem extends BaseEntity implements Serializable {
    /**
     *  外键 商品id,所属表字段为sys_order_item.product_id
     */
    private Long productId;

    /**
     *  外键 订单id,所属表字段为sys_order_item.order_id
     */
    private Long orderId;

    /**
     *  外键 用户id,所属表字段为sys_order_item.user_id
     */
    private Long userId;

    /**
     *  订单商品数量,所属表字段为sys_order_item.count
     */
    private Integer count;

    private static final long serialVersionUID = 1L;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", count=").append(count);
        sb.append("]");
        return sb.toString();
    }
}