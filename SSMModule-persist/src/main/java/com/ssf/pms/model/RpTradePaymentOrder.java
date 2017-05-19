package com.ssf.pms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpTradePaymentOrder implements Serializable {
    /**
     *  id,所属表字段为rp_trade_payment_order.id
     */
    private String id;

    /**
     *  版本号,所属表字段为rp_trade_payment_order.version
     */
    private Integer version;

    /**
     *  创建时间,所属表字段为rp_trade_payment_order.create_time
     */
    private Date createTime;

    /**
     *  修改者,所属表字段为rp_trade_payment_order.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_trade_payment_order.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_trade_payment_order.edit_time
     */
    private Date editTime;

    /**
     *  状态(参考枚举:orderstatusenum),所属表字段为rp_trade_payment_order.status
     */
    private String status;

    /**
     *  商品名称,所属表字段为rp_trade_payment_order.product_name
     */
    private String productName;

    /**
     *  商户订单号,所属表字段为rp_trade_payment_order.merchant_order_no
     */
    private String merchantOrderNo;

    /**
     *  订单金额,所属表字段为rp_trade_payment_order.order_amount
     */
    private BigDecimal orderAmount;

    /**
     *  订单来源,所属表字段为rp_trade_payment_order.order_from
     */
    private String orderFrom;

    /**
     *  商家名称,所属表字段为rp_trade_payment_order.merchant_name
     */
    private String merchantName;

    /**
     *  商户编号,所属表字段为rp_trade_payment_order.merchant_no
     */
    private String merchantNo;

    /**
     *  下单时间,所属表字段为rp_trade_payment_order.order_time
     */
    private Date orderTime;

    /**
     *  下单日期,所属表字段为rp_trade_payment_order.order_date
     */
    private Date orderDate;

    /**
     *  下单ip(客户端ip,在网关页面获取),所属表字段为rp_trade_payment_order.order_ip
     */
    private String orderIp;

    /**
     *  从哪个页面链接过来的(可用于防诈骗),所属表字段为rp_trade_payment_order.order_referer_url
     */
    private String orderRefererUrl;

    /**
     *  页面回调通知url,所属表字段为rp_trade_payment_order.return_url
     */
    private String returnUrl;

    /**
     *  后台异步通知url,所属表字段为rp_trade_payment_order.notify_url
     */
    private String notifyUrl;

    /**
     *  订单撤销原因,所属表字段为rp_trade_payment_order.cancel_reason
     */
    private String cancelReason;

    /**
     *  订单有效期(单位分钟),所属表字段为rp_trade_payment_order.order_period
     */
    private Short orderPeriod;

    /**
     *  到期时间,所属表字段为rp_trade_payment_order.expire_time
     */
    private Date expireTime;

    /**
     *  支付方式编号,所属表字段为rp_trade_payment_order.pay_way_code
     */
    private String payWayCode;

    /**
     *  支付方式名称,所属表字段为rp_trade_payment_order.pay_way_name
     */
    private String payWayName;

    /**
     *  支付备注,所属表字段为rp_trade_payment_order.remark
     */
    private String remark;

    /**
     *  交易业务类型  ：消费、充值等,所属表字段为rp_trade_payment_order.trx_type
     */
    private String trxType;

    /**
     *  支付流水号,所属表字段为rp_trade_payment_order.trx_no
     */
    private String trxNo;

    /**
     *  支付类型编号,所属表字段为rp_trade_payment_order.pay_type_code
     */
    private String payTypeCode;

    /**
     *  支付类型名称,所属表字段为rp_trade_payment_order.pay_type_name
     */
    private String payTypeName;

    /**
     *  资金流入类型,所属表字段为rp_trade_payment_order.fund_into_type
     */
    private String fundIntoType;

    /**
     *  是否退款(100:是,101:否,默认值为:101),所属表字段为rp_trade_payment_order.is_refund
     */
    private String isRefund;

    /**
     *  退款次数(默认值为:0),所属表字段为rp_trade_payment_order.refund_times
     */
    private Integer refundTimes;

    /**
     *  成功退款总金额,所属表字段为rp_trade_payment_order.success_refund_amount
     */
    private BigDecimal successRefundAmount;

    /**
     *  ,所属表字段为rp_trade_payment_order.field1
     */
    private String field1;

    /**
     *  ,所属表字段为rp_trade_payment_order.field2
     */
    private String field2;

    /**
     *  ,所属表字段为rp_trade_payment_order.field3
     */
    private String field3;

    /**
     *  ,所属表字段为rp_trade_payment_order.field4
     */
    private String field4;

    /**
     *  ,所属表字段为rp_trade_payment_order.field5
     */
    private String field5;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderIp() {
        return orderIp;
    }

    public void setOrderIp(String orderIp) {
        this.orderIp = orderIp;
    }

    public String getOrderRefererUrl() {
        return orderRefererUrl;
    }

    public void setOrderRefererUrl(String orderRefererUrl) {
        this.orderRefererUrl = orderRefererUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Short getOrderPeriod() {
        return orderPeriod;
    }

    public void setOrderPeriod(Short orderPeriod) {
        this.orderPeriod = orderPeriod;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getPayWayCode() {
        return payWayCode;
    }

    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode;
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public String getTrxNo() {
        return trxNo;
    }

    public void setTrxNo(String trxNo) {
        this.trxNo = trxNo;
    }

    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public String getFundIntoType() {
        return fundIntoType;
    }

    public void setFundIntoType(String fundIntoType) {
        this.fundIntoType = fundIntoType;
    }

    public String getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(String isRefund) {
        this.isRefund = isRefund;
    }

    public Integer getRefundTimes() {
        return refundTimes;
    }

    public void setRefundTimes(Integer refundTimes) {
        this.refundTimes = refundTimes;
    }

    public BigDecimal getSuccessRefundAmount() {
        return successRefundAmount;
    }

    public void setSuccessRefundAmount(BigDecimal successRefundAmount) {
        this.successRefundAmount = successRefundAmount;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", createTime=").append(createTime);
        sb.append(", editor=").append(editor);
        sb.append(", creater=").append(creater);
        sb.append(", editTime=").append(editTime);
        sb.append(", status=").append(status);
        sb.append(", productName=").append(productName);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", orderFrom=").append(orderFrom);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", orderIp=").append(orderIp);
        sb.append(", orderRefererUrl=").append(orderRefererUrl);
        sb.append(", returnUrl=").append(returnUrl);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", orderPeriod=").append(orderPeriod);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", payWayCode=").append(payWayCode);
        sb.append(", payWayName=").append(payWayName);
        sb.append(", remark=").append(remark);
        sb.append(", trxType=").append(trxType);
        sb.append(", trxNo=").append(trxNo);
        sb.append(", payTypeCode=").append(payTypeCode);
        sb.append(", payTypeName=").append(payTypeName);
        sb.append(", fundIntoType=").append(fundIntoType);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", refundTimes=").append(refundTimes);
        sb.append(", successRefundAmount=").append(successRefundAmount);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append("]");
        return sb.toString();
    }
}