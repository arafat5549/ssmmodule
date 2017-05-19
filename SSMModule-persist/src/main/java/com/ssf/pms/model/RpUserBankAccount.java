package com.ssf.pms.model;

import java.io.Serializable;
import java.util.Date;

public class RpUserBankAccount implements Serializable {
    /**
     *  ,所属表字段为rp_user_bank_account.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_user_bank_account.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_user_bank_account.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_user_bank_account.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_user_bank_account.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_user_bank_account.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_user_bank_account.user_no
     */
    private String userNo;

    /**
     *  ,所属表字段为rp_user_bank_account.bank_name
     */
    private String bankName;

    /**
     *  ,所属表字段为rp_user_bank_account.bank_code
     */
    private String bankCode;

    /**
     *  ,所属表字段为rp_user_bank_account.bank_account_name
     */
    private String bankAccountName;

    /**
     *  ,所属表字段为rp_user_bank_account.bank_account_no
     */
    private String bankAccountNo;

    /**
     *  ,所属表字段为rp_user_bank_account.card_type
     */
    private String cardType;

    /**
     *  ,所属表字段为rp_user_bank_account.card_no
     */
    private String cardNo;

    /**
     *  ,所属表字段为rp_user_bank_account.mobile_no
     */
    private String mobileNo;

    /**
     *  ,所属表字段为rp_user_bank_account.is_default
     */
    private String isDefault;

    /**
     *  ,所属表字段为rp_user_bank_account.province
     */
    private String province;

    /**
     *  ,所属表字段为rp_user_bank_account.city
     */
    private String city;

    /**
     *  ,所属表字段为rp_user_bank_account.areas
     */
    private String areas;

    /**
     *  ,所属表字段为rp_user_bank_account.street
     */
    private String street;

    /**
     *  ,所属表字段为rp_user_bank_account.bank_account_type
     */
    private String bankAccountType;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
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
        sb.append(", status=").append(status);
        sb.append(", userNo=").append(userNo);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", areas=").append(areas);
        sb.append(", street=").append(street);
        sb.append(", bankAccountType=").append(bankAccountType);
        sb.append("]");
        return sb.toString();
    }
}