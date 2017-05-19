package com.ssf.rp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccountHistory implements Serializable {
    /**
     *  ,所属表字段为rp_account_history.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_account_history.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_account_history.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_account_history.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_account_history.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_account_history.account_no
     */
    private String accountNo;

    /**
     *  ,所属表字段为rp_account_history.amount
     */
    private BigDecimal amount;

    /**
     *  ,所属表字段为rp_account_history.balance
     */
    private BigDecimal balance;

    /**
     *  ,所属表字段为rp_account_history.fund_direction
     */
    private String fundDirection;

    /**
     *  ,所属表字段为rp_account_history.is_allow_sett
     */
    private String isAllowSett;

    /**
     *  ,所属表字段为rp_account_history.is_complete_sett
     */
    private String isCompleteSett;

    /**
     *  ,所属表字段为rp_account_history.request_no
     */
    private String requestNo;

    /**
     *  ,所属表字段为rp_account_history.bank_trx_no
     */
    private String bankTrxNo;

    /**
     *  ,所属表字段为rp_account_history.trx_type
     */
    private String trxType;

    /**
     *  ,所属表字段为rp_account_history.risk_day
     */
    private Integer riskDay;

    /**
     *  ,所属表字段为rp_account_history.user_no
     */
    private String userNo;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getFundDirection() {
        return fundDirection;
    }

    public void setFundDirection(String fundDirection) {
        this.fundDirection = fundDirection;
    }

    public String getIsAllowSett() {
        return isAllowSett;
    }

    public void setIsAllowSett(String isAllowSett) {
        this.isAllowSett = isAllowSett;
    }

    public String getIsCompleteSett() {
        return isCompleteSett;
    }

    public void setIsCompleteSett(String isCompleteSett) {
        this.isCompleteSett = isCompleteSett;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getBankTrxNo() {
        return bankTrxNo;
    }

    public void setBankTrxNo(String bankTrxNo) {
        this.bankTrxNo = bankTrxNo;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public Integer getRiskDay() {
        return riskDay;
    }

    public void setRiskDay(Integer riskDay) {
        this.riskDay = riskDay;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", editTime=").append(editTime);
        sb.append(", version=").append(version);
        sb.append(", remark=").append(remark);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", amount=").append(amount);
        sb.append(", balance=").append(balance);
        sb.append(", fundDirection=").append(fundDirection);
        sb.append(", isAllowSett=").append(isAllowSett);
        sb.append(", isCompleteSett=").append(isCompleteSett);
        sb.append(", requestNo=").append(requestNo);
        sb.append(", bankTrxNo=").append(bankTrxNo);
        sb.append(", trxType=").append(trxType);
        sb.append(", riskDay=").append(riskDay);
        sb.append(", userNo=").append(userNo);
        sb.append("]");
        return sb.toString();
    }
}