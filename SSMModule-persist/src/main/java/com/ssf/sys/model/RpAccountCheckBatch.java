package com.ssf.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountCheckBatch implements Serializable {
    /**
     *  ,所属表字段为rp_account_check_batch.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_account_check_batch.version
     */
    private Integer version;

    /**
     *  ,所属表字段为rp_account_check_batch.create_time
     */
    private Date createTime;

    /**
     *  修改者,所属表字段为rp_account_check_batch.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_account_check_batch.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_account_check_batch.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_account_check_batch.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_account_check_batch.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_account_check_batch.batch_no
     */
    private String batchNo;

    /**
     *  ,所属表字段为rp_account_check_batch.bill_date
     */
    private Date billDate;

    /**
     *  ,所属表字段为rp_account_check_batch.bill_type
     */
    private String billType;

    /**
     *  ,所属表字段为rp_account_check_batch.handle_status
     */
    private String handleStatus;

    /**
     *  ,所属表字段为rp_account_check_batch.bank_type
     */
    private String bankType;

    /**
     *  ,所属表字段为rp_account_check_batch.mistake_count
     */
    private Integer mistakeCount;

    /**
     *  ,所属表字段为rp_account_check_batch.unhandle_mistake_count
     */
    private Integer unhandleMistakeCount;

    /**
     *  ,所属表字段为rp_account_check_batch.trade_count
     */
    private Integer tradeCount;

    /**
     *  ,所属表字段为rp_account_check_batch.bank_trade_count
     */
    private Integer bankTradeCount;

    /**
     *  ,所属表字段为rp_account_check_batch.trade_amount
     */
    private BigDecimal tradeAmount;

    /**
     *  ,所属表字段为rp_account_check_batch.bank_trade_amount
     */
    private BigDecimal bankTradeAmount;

    /**
     *  ,所属表字段为rp_account_check_batch.refund_amount
     */
    private BigDecimal refundAmount;

    /**
     *  ,所属表字段为rp_account_check_batch.bank_refund_amount
     */
    private BigDecimal bankRefundAmount;

    /**
     *  ,所属表字段为rp_account_check_batch.bank_fee
     */
    private BigDecimal bankFee;

    /**
     *  ,所属表字段为rp_account_check_batch.org_check_file_path
     */
    private String orgCheckFilePath;

    /**
     *  ,所属表字段为rp_account_check_batch.release_check_file_path
     */
    private String releaseCheckFilePath;

    /**
     *  ,所属表字段为rp_account_check_batch.release_status
     */
    private String releaseStatus;

    /**
     *  ,所属表字段为rp_account_check_batch.check_fail_msg
     */
    private String checkFailMsg;

    /**
     *  ,所属表字段为rp_account_check_batch.bank_err_msg
     */
    private String bankErrMsg;

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

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public Integer getMistakeCount() {
        return mistakeCount;
    }

    public void setMistakeCount(Integer mistakeCount) {
        this.mistakeCount = mistakeCount;
    }

    public Integer getUnhandleMistakeCount() {
        return unhandleMistakeCount;
    }

    public void setUnhandleMistakeCount(Integer unhandleMistakeCount) {
        this.unhandleMistakeCount = unhandleMistakeCount;
    }

    public Integer getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Integer getBankTradeCount() {
        return bankTradeCount;
    }

    public void setBankTradeCount(Integer bankTradeCount) {
        this.bankTradeCount = bankTradeCount;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getBankTradeAmount() {
        return bankTradeAmount;
    }

    public void setBankTradeAmount(BigDecimal bankTradeAmount) {
        this.bankTradeAmount = bankTradeAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
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

    public String getOrgCheckFilePath() {
        return orgCheckFilePath;
    }

    public void setOrgCheckFilePath(String orgCheckFilePath) {
        this.orgCheckFilePath = orgCheckFilePath;
    }

    public String getReleaseCheckFilePath() {
        return releaseCheckFilePath;
    }

    public void setReleaseCheckFilePath(String releaseCheckFilePath) {
        this.releaseCheckFilePath = releaseCheckFilePath;
    }

    public String getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public String getCheckFailMsg() {
        return checkFailMsg;
    }

    public void setCheckFailMsg(String checkFailMsg) {
        this.checkFailMsg = checkFailMsg;
    }

    public String getBankErrMsg() {
        return bankErrMsg;
    }

    public void setBankErrMsg(String bankErrMsg) {
        this.bankErrMsg = bankErrMsg;
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
        sb.append(", batchNo=").append(batchNo);
        sb.append(", billDate=").append(billDate);
        sb.append(", billType=").append(billType);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", bankType=").append(bankType);
        sb.append(", mistakeCount=").append(mistakeCount);
        sb.append(", unhandleMistakeCount=").append(unhandleMistakeCount);
        sb.append(", tradeCount=").append(tradeCount);
        sb.append(", bankTradeCount=").append(bankTradeCount);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", bankTradeAmount=").append(bankTradeAmount);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", bankRefundAmount=").append(bankRefundAmount);
        sb.append(", bankFee=").append(bankFee);
        sb.append(", orgCheckFilePath=").append(orgCheckFilePath);
        sb.append(", releaseCheckFilePath=").append(releaseCheckFilePath);
        sb.append(", releaseStatus=").append(releaseStatus);
        sb.append(", checkFailMsg=").append(checkFailMsg);
        sb.append(", bankErrMsg=").append(bankErrMsg);
        sb.append("]");
        return sb.toString();
    }
}