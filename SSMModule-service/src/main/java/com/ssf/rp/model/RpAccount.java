package com.ssf.rp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpAccount implements Serializable {
    /**
     *  ,所属表字段为rp_account.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_account.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_account.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_account.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_account.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_account.account_no
     */
    private String accountNo;

    /**
     *  ,所属表字段为rp_account.balance
     */
    private BigDecimal balance;

    /**
     *  ,所属表字段为rp_account.unbalance
     */
    private BigDecimal unbalance;

    /**
     *  ,所属表字段为rp_account.security_money
     */
    private BigDecimal securityMoney;

    /**
     *  ,所属表字段为rp_account.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_account.total_income
     */
    private BigDecimal totalIncome;

    /**
     *  ,所属表字段为rp_account.total_expend
     */
    private BigDecimal totalExpend;

    /**
     *  ,所属表字段为rp_account.today_income
     */
    private BigDecimal todayIncome;

    /**
     *  ,所属表字段为rp_account.today_expend
     */
    private BigDecimal todayExpend;

    /**
     *  ,所属表字段为rp_account.account_type
     */
    private String accountType;

    /**
     *  ,所属表字段为rp_account.sett_amount
     */
    private BigDecimal settAmount;

    /**
     *  ,所属表字段为rp_account.user_no
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getUnbalance() {
        return unbalance;
    }

    public void setUnbalance(BigDecimal unbalance) {
        this.unbalance = unbalance;
    }

    public BigDecimal getSecurityMoney() {
        return securityMoney;
    }

    public void setSecurityMoney(BigDecimal securityMoney) {
        this.securityMoney = securityMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
    }

    public BigDecimal getTotalExpend() {
        return totalExpend;
    }

    public void setTotalExpend(BigDecimal totalExpend) {
        this.totalExpend = totalExpend;
    }

    public BigDecimal getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(BigDecimal todayIncome) {
        this.todayIncome = todayIncome;
    }

    public BigDecimal getTodayExpend() {
        return todayExpend;
    }

    public void setTodayExpend(BigDecimal todayExpend) {
        this.todayExpend = todayExpend;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(BigDecimal settAmount) {
        this.settAmount = settAmount;
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
        sb.append(", balance=").append(balance);
        sb.append(", unbalance=").append(unbalance);
        sb.append(", securityMoney=").append(securityMoney);
        sb.append(", status=").append(status);
        sb.append(", totalIncome=").append(totalIncome);
        sb.append(", totalExpend=").append(totalExpend);
        sb.append(", todayIncome=").append(todayIncome);
        sb.append(", todayExpend=").append(todayExpend);
        sb.append(", accountType=").append(accountType);
        sb.append(", settAmount=").append(settAmount);
        sb.append(", userNo=").append(userNo);
        sb.append("]");
        return sb.toString();
    }
}