package com.ssf.pms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpSettRecord implements Serializable {
    /**
     *  id,所属表字段为rp_sett_record.id
     */
    private String id;

    /**
     *  版本号,所属表字段为rp_sett_record.version
     */
    private Integer version;

    /**
     *  创建时间,所属表字段为rp_sett_record.create_time
     */
    private Date createTime;

    /**
     *  修改时间,所属表字段为rp_sett_record.edit_time
     */
    private Date editTime;

    /**
     *  结算发起方式(参考settmodetypeenum),所属表字段为rp_sett_record.sett_mode
     */
    private String settMode;

    /**
     *  账户编号,所属表字段为rp_sett_record.account_no
     */
    private String accountNo;

    /**
     *  用户编号,所属表字段为rp_sett_record.user_no
     */
    private String userNo;

    /**
     *  用户姓名,所属表字段为rp_sett_record.user_name
     */
    private String userName;

    /**
     *  用户类型,所属表字段为rp_sett_record.user_type
     */
    private String userType;

    /**
     *  结算日期,所属表字段为rp_sett_record.sett_date
     */
    private Date settDate;

    /**
     *  银行编码,所属表字段为rp_sett_record.bank_code
     */
    private String bankCode;

    /**
     *  银行名称,所属表字段为rp_sett_record.bank_name
     */
    private String bankName;

    /**
     *  开户名,所属表字段为rp_sett_record.bank_account_name
     */
    private String bankAccountName;

    /**
     *  开户账户,所属表字段为rp_sett_record.bank_account_no
     */
    private String bankAccountNo;

    /**
     *  开户账户,所属表字段为rp_sett_record.bank_account_type
     */
    private String bankAccountType;

    /**
     *  开户行所在国家,所属表字段为rp_sett_record.country
     */
    private String country;

    /**
     *  开户行所在省份,所属表字段为rp_sett_record.province
     */
    private String province;

    /**
     *  开户行所在城市,所属表字段为rp_sett_record.city
     */
    private String city;

    /**
     *  开户行所在区,所属表字段为rp_sett_record.areas
     */
    private String areas;

    /**
     *  开户行全称,所属表字段为rp_sett_record.bank_account_address
     */
    private String bankAccountAddress;

    /**
     *  收款人手机号,所属表字段为rp_sett_record.mobile_no
     */
    private String mobileNo;

    /**
     *  结算金额,所属表字段为rp_sett_record.sett_amount
     */
    private BigDecimal settAmount;

    /**
     *  结算手续费,所属表字段为rp_sett_record.sett_fee
     */
    private BigDecimal settFee;

    /**
     *  结算打款金额,所属表字段为rp_sett_record.remit_amount
     */
    private BigDecimal remitAmount;

    /**
     *  结算状态(参考枚举:settrecordstatusenum),所属表字段为rp_sett_record.sett_status
     */
    private String settStatus;

    /**
     *  打款确认时间,所属表字段为rp_sett_record.remit_confirm_time
     */
    private Date remitConfirmTime;

    /**
     *  描述,所属表字段为rp_sett_record.remark
     */
    private String remark;

    /**
     *  打款备注,所属表字段为rp_sett_record.remit_remark
     */
    private String remitRemark;

    /**
     *  操作员登录名,所属表字段为rp_sett_record.operator_loginname
     */
    private String operatorLoginname;

    /**
     *  操作员姓名,所属表字段为rp_sett_record.operator_realname
     */
    private String operatorRealname;

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

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getSettMode() {
        return settMode;
    }

    public void setSettMode(String settMode) {
        this.settMode = settMode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Date getSettDate() {
        return settDate;
    }

    public void setSettDate(Date settDate) {
        this.settDate = settDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getBankAccountAddress() {
        return bankAccountAddress;
    }

    public void setBankAccountAddress(String bankAccountAddress) {
        this.bankAccountAddress = bankAccountAddress;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public BigDecimal getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(BigDecimal settAmount) {
        this.settAmount = settAmount;
    }

    public BigDecimal getSettFee() {
        return settFee;
    }

    public void setSettFee(BigDecimal settFee) {
        this.settFee = settFee;
    }

    public BigDecimal getRemitAmount() {
        return remitAmount;
    }

    public void setRemitAmount(BigDecimal remitAmount) {
        this.remitAmount = remitAmount;
    }

    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus;
    }

    public Date getRemitConfirmTime() {
        return remitConfirmTime;
    }

    public void setRemitConfirmTime(Date remitConfirmTime) {
        this.remitConfirmTime = remitConfirmTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemitRemark() {
        return remitRemark;
    }

    public void setRemitRemark(String remitRemark) {
        this.remitRemark = remitRemark;
    }

    public String getOperatorLoginname() {
        return operatorLoginname;
    }

    public void setOperatorLoginname(String operatorLoginname) {
        this.operatorLoginname = operatorLoginname;
    }

    public String getOperatorRealname() {
        return operatorRealname;
    }

    public void setOperatorRealname(String operatorRealname) {
        this.operatorRealname = operatorRealname;
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
        sb.append(", editTime=").append(editTime);
        sb.append(", settMode=").append(settMode);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", userType=").append(userType);
        sb.append(", settDate=").append(settDate);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", bankAccountType=").append(bankAccountType);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", areas=").append(areas);
        sb.append(", bankAccountAddress=").append(bankAccountAddress);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", settAmount=").append(settAmount);
        sb.append(", settFee=").append(settFee);
        sb.append(", remitAmount=").append(remitAmount);
        sb.append(", settStatus=").append(settStatus);
        sb.append(", remitConfirmTime=").append(remitConfirmTime);
        sb.append(", remark=").append(remark);
        sb.append(", remitRemark=").append(remitRemark);
        sb.append(", operatorLoginname=").append(operatorLoginname);
        sb.append(", operatorRealname=").append(operatorRealname);
        sb.append("]");
        return sb.toString();
    }
}