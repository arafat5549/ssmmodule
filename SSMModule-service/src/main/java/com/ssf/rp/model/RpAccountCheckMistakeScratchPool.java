package com.ssf.rp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountCheckMistakeScratchPool implements Serializable {
    /**
     *  ,所属表字段为rp_account_check_mistake_scratch_pool.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_account_check_mistake_scratch_pool.version
     */
    private Integer version;

    /**
     *  ,所属表字段为rp_account_check_mistake_scratch_pool.create_time
     */
    private Date createTime;

    /**
     *  修改者,所属表字段为rp_account_check_mistake_scratch_pool.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_account_check_mistake_scratch_pool.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_account_check_mistake_scratch_pool.edit_time
     */
    private Date editTime;

    /**
     *  商品名称,所属表字段为rp_account_check_mistake_scratch_pool.product_name
     */
    private String productName;

    /**
     *  商户订单号,所属表字段为rp_account_check_mistake_scratch_pool.merchant_order_no
     */
    private String merchantOrderNo;

    /**
     *  支付流水号,所属表字段为rp_account_check_mistake_scratch_pool.trx_no
     */
    private String trxNo;

    /**
     *  银行订单号,所属表字段为rp_account_check_mistake_scratch_pool.bank_order_no
     */
    private String bankOrderNo;

    /**
     *  银行流水号,所属表字段为rp_account_check_mistake_scratch_pool.bank_trx_no
     */
    private String bankTrxNo;

    /**
     *  订单金额,所属表字段为rp_account_check_mistake_scratch_pool.order_amount
     */
    private BigDecimal orderAmount;

    /**
     *  平台收入,所属表字段为rp_account_check_mistake_scratch_pool.plat_income
     */
    private BigDecimal platIncome;

    /**
     *  费率,所属表字段为rp_account_check_mistake_scratch_pool.fee_rate
     */
    private BigDecimal feeRate;

    /**
     *  平台成本,所属表字段为rp_account_check_mistake_scratch_pool.plat_cost
     */
    private BigDecimal platCost;

    /**
     *  平台利润,所属表字段为rp_account_check_mistake_scratch_pool.plat_profit
     */
    private BigDecimal platProfit;

    /**
     *  状态(参考枚举:paymentrecordstatusenum),所属表字段为rp_account_check_mistake_scratch_pool.status
     */
    private String status;

    /**
     *  支付通道编号,所属表字段为rp_account_check_mistake_scratch_pool.pay_way_code
     */
    private String payWayCode;

    /**
     *  支付通道名称,所属表字段为rp_account_check_mistake_scratch_pool.pay_way_name
     */
    private String payWayName;

    /**
     *  支付成功时间,所属表字段为rp_account_check_mistake_scratch_pool.pay_success_time
     */
    private Date paySuccessTime;

    /**
     *  完成时间,所属表字段为rp_account_check_mistake_scratch_pool.complete_time
     */
    private Date completeTime;

    /**
     *  是否退款(100:是,101:否,默认值为:101),所属表字段为rp_account_check_mistake_scratch_pool.is_refund
     */
    private String isRefund;

    /**
     *  退款次数(默认值为:0),所属表字段为rp_account_check_mistake_scratch_pool.refund_times
     */
    private Short refundTimes;

    /**
     *  成功退款总金额,所属表字段为rp_account_check_mistake_scratch_pool.success_refund_amount
     */
    private BigDecimal successRefundAmount;

    /**
     *  备注,所属表字段为rp_account_check_mistake_scratch_pool.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_account_check_mistake_scratch_pool.batch_no
     */
    private String batchNo;

    /**
     *  ,所属表字段为rp_account_check_mistake_scratch_pool.bill_date
     */
    private Date billDate;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Short getRefundTimes() {
        return refundTimes;
    }

    public void setRefundTimes(Short refundTimes) {
        this.refundTimes = refundTimes;
    }

    public BigDecimal getSuccessRefundAmount() {
        return successRefundAmount;
    }

    public void setSuccessRefundAmount(BigDecimal successRefundAmount) {
        this.successRefundAmount = successRefundAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
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
        sb.append(", productName=").append(productName);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", trxNo=").append(trxNo);
        sb.append(", bankOrderNo=").append(bankOrderNo);
        sb.append(", bankTrxNo=").append(bankTrxNo);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", platIncome=").append(platIncome);
        sb.append(", feeRate=").append(feeRate);
        sb.append(", platCost=").append(platCost);
        sb.append(", platProfit=").append(platProfit);
        sb.append(", status=").append(status);
        sb.append(", payWayCode=").append(payWayCode);
        sb.append(", payWayName=").append(payWayName);
        sb.append(", paySuccessTime=").append(paySuccessTime);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", refundTimes=").append(refundTimes);
        sb.append(", successRefundAmount=").append(successRefundAmount);
        sb.append(", remark=").append(remark);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", billDate=").append(billDate);
        sb.append("]");
        return sb.toString();
    }
}