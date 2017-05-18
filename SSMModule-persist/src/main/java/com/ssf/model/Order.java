package com.ssf.model;

import com.ssf.common.mybatis.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;

public class Order extends BaseEntity implements Serializable {
    /**
     *  唯一ID 订单号,所属表字段为sys_order.ordercode
     */
    private String ordercode;

    /**
     *  收获地址,所属表字段为sys_order.address
     */
    private String address;

    /**
     *  邮编区号,所属表字段为sys_order.post
     */
    private String post;

    /**
     *  收件人,所属表字段为sys_order.receiver
     */
    private String receiver;

    /**
     *  手机,所属表字段为sys_order.mobile
     */
    private String mobile;

    /**
     *  用户信息-备注信息,所属表字段为sys_order.message
     */
    private String message;

    /**
     *  外键 用户ID,所属表字段为sys_order.user_id
     */
    private Long userId;

    /**
     *  订单状态,所属表字段为sys_order.status
     */
    private String status;

    /**
     *  订单付款时间,所属表字段为sys_order.pay_date
     */
    private Date payDate;

    /**
     *  订单发货时间,所属表字段为sys_order.delivery_date
     */
    private Date deliveryDate;

    /**
     *  订单确认到货时间,所属表字段为sys_order.confirm_date
     */
    private Date confirmDate;

    private static final long serialVersionUID = 1L;

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordercode=").append(ordercode);
        sb.append(", address=").append(address);
        sb.append(", post=").append(post);
        sb.append(", receiver=").append(receiver);
        sb.append(", mobile=").append(mobile);
        sb.append(", message=").append(message);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append(", payDate=").append(payDate);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", confirmDate=").append(confirmDate);
        sb.append("]");
        return sb.toString();
    }
}