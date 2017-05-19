package com.ssf.pms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpTradePaymentRecord implements Serializable {
    /**
     *  id,所属表字段为rp_trade_payment_record.id
     */
    private String id;

    /**
     *  版本号,所属表字段为rp_trade_payment_record.version
     */
    private Integer version;

    /**
     *  创建时间,所属表字段为rp_trade_payment_record.create_time
     */
    private Date createTime;

    /**
     *  状态(参考枚举:paymentrecordstatusenum),所属表字段为rp_trade_payment_record.status
     */
    private String status;

    /**
     *  修改者,所属表字段为rp_trade_payment_record.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_trade_payment_record.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_trade_payment_record.edit_time
     */
    private Date editTime;

    /**
     *  商品名称,所属表字段为rp_trade_payment_record.product_name
     */
    private String productName;

    /**
     *  商户订单号,所属表字段为rp_trade_payment_record.merchant_order_no
     */
    private String merchantOrderNo;

    /**
     *  支付流水号,所属表字段为rp_trade_payment_record.trx_no
     */
    private String trxNo;

    /**
     *  银行订单号,所属表字段为rp_trade_payment_record.bank_order_no
     */
    private String bankOrderNo;

    /**
     *  银行流水号,所属表字段为rp_trade_payment_record.bank_trx_no
     */
    private String bankTrxNo;

    /**
     *  商家名称,所属表字段为rp_trade_payment_record.merchant_name
     */
    private String merchantName;

    /**
     *  商家编号,所属表字段为rp_trade_payment_record.merchant_no
     */
    private String merchantNo;

    /**
     *  付款人编号,所属表字段为rp_trade_payment_record.payer_user_no
     */
    private String payerUserNo;

    /**
     *  付款人名称,所属表字段为rp_trade_payment_record.payer_name
     */
    private String payerName;

    /**
     *  付款方支付金额,所属表字段为rp_trade_payment_record.payer_pay_amount
     */
    private BigDecimal payerPayAmount;

    /**
     *  付款方手续费,所属表字段为rp_trade_payment_record.payer_fee
     */
    private BigDecimal payerFee;

    /**
     *  付款方账户类型(参考账户类型枚举:accounttypeenum),所属表字段为rp_trade_payment_record.payer_account_type
     */
    private String payerAccountType;

    /**
     *  收款人编号,所属表字段为rp_trade_payment_record.receiver_user_no
     */
    private String receiverUserNo;

    /**
     *  收款人名称,所属表字段为rp_trade_payment_record.receiver_name
     */
    private String receiverName;

    /**
     *  收款方支付金额,所属表字段为rp_trade_payment_record.receiver_pay_amount
     */
    private BigDecimal receiverPayAmount;

    /**
     *  收款方手续费,所属表字段为rp_trade_payment_record.receiver_fee
     */
    private BigDecimal receiverFee;

    /**
     *  收款方账户类型(参考账户类型枚举:accounttypeenum),所属表字段为rp_trade_payment_record.receiver_account_type
     */
    private String receiverAccountType;

    /**
     *  下单ip(客户端ip,从网关中获取),所属表字段为rp_trade_payment_record.order_ip
     */
    private String orderIp;

    /**
     *  从哪个页面链接过来的(可用于防诈骗),所属表字段为rp_trade_payment_record.order_referer_url
     */
    private String orderRefererUrl;

    /**
     *  订单金额,所属表字段为rp_trade_payment_record.order_amount
     */
    private BigDecimal orderAmount;

    /**
     *  平台收入,所属表字段为rp_trade_payment_record.plat_income
     */
    private BigDecimal platIncome;

    /**
     *  费率,所属表字段为rp_trade_payment_record.fee_rate
     */
    private BigDecimal feeRate;

    /**
     *  平台成本,所属表字段为rp_trade_payment_record.plat_cost
     */
    private BigDecimal platCost;

    /**
     *  平台利润,所属表字段为rp_trade_payment_record.plat_profit
     */
    private BigDecimal platProfit;

    /**
     *  页面回调通知url,所属表字段为rp_trade_payment_record.return_url
     */
    private String returnUrl;

    /**
     *  后台异步通知url,所属表字段为rp_trade_payment_record.notify_url
     */
    private String notifyUrl;

    /**
     *  支付方式编号,所属表字段为rp_trade_payment_record.pay_way_code
     */
    private String payWayCode;

    /**
     *  支付方式名称,所属表字段为rp_trade_payment_record.pay_way_name
     */
    private String payWayName;

    /**
     *  支付成功时间,所属表字段为rp_trade_payment_record.pay_success_time
     */
    private Date paySuccessTime;

    /**
     *  完成时间,所属表字段为rp_trade_payment_record.complete_time
     */
    private Date completeTime;

    /**
     *  是否退款(100:是,101:否,默认值为:101),所属表字段为rp_trade_payment_record.is_refund
     */
    private String isRefund;

    /**
     *  退款次数(默认值为:0),所属表字段为rp_trade_payment_record.refund_times
     */
    private Integer refundTimes;

    /**
     *  成功退款总金额,所属表字段为rp_trade_payment_record.success_refund_amount
     */
    private BigDecimal successRefundAmount;

    /**
     *  交易业务类型  ：消费、充值等,所属表字段为rp_trade_payment_record.trx_type
     */
    private String trxType;

    /**
     *  订单来源,所属表字段为rp_trade_payment_record.order_from
     */
    private String orderFrom;

    /**
     *  支付类型编号,所属表字段为rp_trade_payment_record.pay_type_code
     */
    private String payTypeCode;

    /**
     *  支付类型名称,所属表字段为rp_trade_payment_record.pay_type_name
     */
    private String payTypeName;

    /**
     *  资金流入类型,所属表字段为rp_trade_payment_record.fund_into_type
     */
    private String fundIntoType;

    /**
     *  备注,所属表字段为rp_trade_payment_record.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_trade_payment_record.field1
     */
    private String field1;

    /**
     *  ,所属表字段为rp_trade_payment_record.field2
     */
    private String field2;

    /**
     *  ,所属表字段为rp_trade_payment_record.field3
     */
    private String field3;

    /**
     *  ,所属表字段为rp_trade_payment_record.field4
     */
    private String field4;

    /**
     *  ,所属表字段为rp_trade_payment_record.field5
     */
    private String field5;

    /**
     *  银行返回信息,所属表字段为rp_trade_payment_record.bank_return_msg
     */
    private String bankReturnMsg;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getTrxNo() {
        return trxNo;
    }

    public void setTrxNo(String trxNo) {
        this.trxNo = trxNo;
    }

    public String getBankOrderNo() {
        return bankOrderNo;
    }

    public void setBankOrderNo(String bankOrderNo) {
        this.bankOrderNo = bankOrderNo;
    }

    public String getBankTrxNo() {
        return bankTrxNo;
    }

    public void setBankTrxNo(String bankTrxNo) {
        this.bankTrxNo = bankTrxNo;
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

    public String getPayerUserNo() {
        return payerUserNo;
    }

    public void setPayerUserNo(String payerUserNo) {
        this.payerUserNo = payerUserNo;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public BigDecimal getPayerPayAmount() {
        return payerPayAmount;
    }

    public void setPayerPayAmount(BigDecimal payerPayAmount) {
        this.payerPayAmount = payerPayAmount;
    }

    public BigDecimal getPayerFee() {
        return payerFee;
    }

    public void setPayerFee(BigDecimal payerFee) {
        this.payerFee = payerFee;
    }

    public String getPayerAccountType() {
        return payerAccountType;
    }

    public void setPayerAccountType(String payerAccountType) {
        this.payerAccountType = payerAccountType;
    }

    public String getReceiverUserNo() {
        return receiverUserNo;
    }

    public void setReceiverUserNo(String receiverUserNo) {
        this.receiverUserNo = receiverUserNo;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public BigDecimal getReceiverPayAmount() {
        return receiverPayAmount;
    }

    public void setReceiverPayAmount(BigDecimal receiverPayAmount) {
        this.receiverPayAmount = receiverPayAmount;
    }

    public BigDecimal getReceiverFee() {
        return receiverFee;
    }

    public void setReceiverFee(BigDecimal receiverFee) {
        this.receiverFee = receiverFee;
    }

    public String getReceiverAccountType() {
        return receiverAccountType;
    }

    public void setReceiverAccountType(String receiverAccountType) {
        this.receiverAccountType = receiverAccountType;
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

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getPlatIncome() {
        return platIncome;
    }

    public void setPlatIncome(BigDecimal platIncome) {
        this.platIncome = platIncome;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getPlatCost() {
        return platCost;
    }

    public void setPlatCost(BigDecimal platCost) {
        this.platCost = platCost;
    }

    public BigDecimal getPlatProfit() {
        return platProfit;
    }

    public void setPlatProfit(BigDecimal platProfit) {
        this.platProfit = platProfit;
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

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
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

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getBankReturnMsg() {
        return bankReturnMsg;
    }

    public void setBankReturnMsg(String bankReturnMsg) {
        this.bankReturnMsg = bankReturnMsg;
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
        sb.append(", status=").append(status);
        sb.append(", editor=").append(editor);
        sb.append(", creater=").append(creater);
        sb.append(", editTime=").append(editTime);
        sb.append(", productName=").append(productName);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", trxNo=").append(trxNo);
        sb.append(", bankOrderNo=").append(bankOrderNo);
        sb.append(", bankTrxNo=").append(bankTrxNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", payerUserNo=").append(payerUserNo);
        sb.append(", payerName=").append(payerName);
        sb.append(", payerPayAmount=").append(payerPayAmount);
        sb.append(", payerFee=").append(payerFee);
        sb.append(", payerAccountType=").append(payerAccountType);
        sb.append(", receiverUserNo=").append(receiverUserNo);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPayAmount=").append(receiverPayAmount);
        sb.append(", receiverFee=").append(receiverFee);
        sb.append(", receiverAccountType=").append(receiverAccountType);
        sb.append(", orderIp=").append(orderIp);
        sb.append(", orderRefererUrl=").append(orderRefererUrl);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", platIncome=").append(platIncome);
        sb.append(", feeRate=").append(feeRate);
        sb.append(", platCost=").append(platCost);
        sb.append(", platProfit=").append(platProfit);
        sb.append(", returnUrl=").append(returnUrl);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", payWayCode=").append(payWayCode);
        sb.append(", payWayName=").append(payWayName);
        sb.append(", paySuccessTime=").append(paySuccessTime);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", refundTimes=").append(refundTimes);
        sb.append(", successRefundAmount=").append(successRefundAmount);
        sb.append(", trxType=").append(trxType);
        sb.append(", orderFrom=").append(orderFrom);
        sb.append(", payTypeCode=").append(payTypeCode);
        sb.append(", payTypeName=").append(payTypeName);
        sb.append(", fundIntoType=").append(fundIntoType);
        sb.append(", remark=").append(remark);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append(", field4=").append(field4);
        sb.append(", field5=").append(field5);
        sb.append(", bankReturnMsg=").append(bankReturnMsg);
        sb.append("]");
        return sb.toString();
    }
}