package com.ssf.rp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountCheckMistake implements Serializable {
    /**
     *  ,所属表字段为rp_account_check_mistake.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_account_check_mistake.version
     */
    private Integer version;

    /**
     *  ,所属表字段为rp_account_check_mistake.create_time
     */
    private Date createTime;

    /**
     *  修改者,所属表字段为rp_account_check_mistake.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_account_check_mistake.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_account_check_mistake.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_account_check_mistake.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_account_check_mistake.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_account_check_mistake.account_check_batch_no
     */
    private String accountCheckBatchNo;

    /**
     *  ,所属表字段为rp_account_check_mistake.bill_date
     */
    private Date billDate;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_type
     */
    private String bankType;

    /**
     *  ,所属表字段为rp_account_check_mistake.order_time
     */
    private Date orderTime;

    /**
     *  ,所属表字段为rp_account_check_mistake.merchant_name
     */
    private String merchantName;

    /**
     *  ,所属表字段为rp_account_check_mistake.merchant_no
     */
    private String merchantNo;

    /**
     *  ,所属表字段为rp_account_check_mistake.order_no
     */
    private String orderNo;

    /**
     *  ,所属表字段为rp_account_check_mistake.trade_time
     */
    private Date tradeTime;

    /**
     *  ,所属表字段为rp_account_check_mistake.trx_no
     */
    private String trxNo;

    /**
     *  ,所属表字段为rp_account_check_mistake.order_amount
     */
    private BigDecimal orderAmount;

    /**
     *  ,所属表字段为rp_account_check_mistake.refund_amount
     */
    private BigDecimal refundAmount;

    /**
     *  ,所属表字段为rp_account_check_mistake.trade_status
     */
    private String tradeStatus;

    /**
     *  ,所属表字段为rp_account_check_mistake.fee
     */
    private BigDecimal fee;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_trade_time
     */
    private Date bankTradeTime;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_order_no
     */
    private String bankOrderNo;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_trx_no
     */
    private String bankTrxNo;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_trade_status
     */
    private String bankTradeStatus;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_amount
     */
    private BigDecimal bankAmount;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_refund_amount
     */
    private BigDecimal bankRefundAmount;

    /**
     *  ,所属表字段为rp_account_check_mistake.bank_fee
     */
    private BigDecimal bankFee;

    /**
     *  ,所属表字段为rp_account_check_mistake.err_type
     */
    private String errType;

    /**
     *  ,所属表字段为rp_account_check_mistake.handle_status
     */
    private String handleStatus;

    /**
     *  ,所属表字段为rp_account_check_mistake.handle_value
     */
    private String handleValue;

    /**
     *  ,所属表字段为rp_account_check_mistake.handle_remark
     */
    private String handleRemark;

    /**
     *  ,所属表字段为rp_account_check_mistake.operator_name
     */
    private String operatorName;

    /**
     *  ,所属表字段为rp_account_check_mistake.operator_account_no
     */
    private String operatorAccountNo;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccountCheckBatchNo() {
        return accountCheckBatchNo;
    }

    public void setAccountCheckBatchNo(String accountCheckBatchNo) {
        this.accountCheckBatchNo = accountCheckBatchNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTrxNo() {
        return trxNo;
    }

    public void setTrxNo(String trxNo) {
        this.trxNo = trxNo;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getBankTradeTime() {
        return bankTradeTime;
    }

    public void setBankTradeTime(Date bankTradeTime) {
        this.bankTradeTime = bankTradeTime;
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

    public String getBankTradeStatus() {
        return bankTradeStatus;
    }

    public void setBankTradeStatus(String bankTradeStatus) {
        this.bankTradeStatus = bankTradeStatus;
    }

    public BigDecimal getBankAmount() {
        return bankAmount;
    }

    public void setBankAmount(BigDecimal bankAmount) {
        this.bankAmount = bankAmount;
    }

    public BigDecimal getBankRefundAmount() {
        return bankRefundAmount;
    }

    public void setBankRefundAmount(BigDecimal bankRefundAmount) {
        this.bankRefundAmount = bankRefundAmount;
    }

    public BigDecimal getBankFee() {
        return bankFee;
    }

    public void setBankFee(BigDecimal bankFee) {
        this.bankFee = bankFee;
    }

    public String getErrType() {
        return errType;
    }

    public void setErrType(String errType) {
        this.errType = errType;
    }

    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getHandleValue() {
        return handleValue;
    }

    public void setHandleValue(String handleValue) {
        this.handleValue = handleValue;
    }

    public String getHandleRemark() {
        return handleRemark;
    }

    public void setHandleRemark(String handleRemark) {
        this.handleRemark = handleRemark;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorAccountNo() {
        return operatorAccountNo;
    }

    public void setOperatorAccountNo(String operatorAccountNo) {
        this.operatorAccountNo = operatorAccountNo;
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
        sb.append(", remark=").append(remark);
        sb.append(", accountCheckBatchNo=").append(accountCheckBatchNo);
        sb.append(", billDate=").append(billDate);
        sb.append(", bankType=").append(bankType);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", trxNo=").append(trxNo);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", fee=").append(fee);
        sb.append(", bankTradeTime=").append(bankTradeTime);
        sb.append(", bankOrderNo=").append(bankOrderNo);
        sb.append(", bankTrxNo=").append(bankTrxNo);
        sb.append(", bankTradeStatus=").append(bankTradeStatus);
        sb.append(", bankAmount=").append(bankAmount);
        sb.append(", bankRefundAmount=").append(bankRefundAmount);
        sb.append(", bankFee=").append(bankFee);
        sb.append(", errType=").append(errType);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", handleValue=").append(handleValue);
        sb.append(", handleRemark=").append(handleRemark);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", operatorAccountNo=").append(operatorAccountNo);
        sb.append("]");
        return sb.toString();
    }
}