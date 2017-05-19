package com.ssf.sys.model;

import java.io.Serializable;
import java.util.Date;

public class RpUserPayConfig implements Serializable {
    /**
     *  ,所属表字段为rp_user_pay_config.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_user_pay_config.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_user_pay_config.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_user_pay_config.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_user_pay_config.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_user_pay_config.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_user_pay_config.audit_status
     */
    private String auditStatus;

    /**
     *  ,所属表字段为rp_user_pay_config.is_auto_sett
     */
    private String isAutoSett;

    /**
     *  支付产品编号,所属表字段为rp_user_pay_config.product_code
     */
    private String productCode;

    /**
     *  支付产品名称,所属表字段为rp_user_pay_config.product_name
     */
    private String productName;

    /**
     *  ,所属表字段为rp_user_pay_config.user_no
     */
    private String userNo;

    /**
     *  ,所属表字段为rp_user_pay_config.user_name
     */
    private String userName;

    /**
     *  ,所属表字段为rp_user_pay_config.risk_day
     */
    private Integer riskDay;

    /**
     *  ,所属表字段为rp_user_pay_config.pay_key
     */
    private String payKey;

    /**
     *  ,所属表字段为rp_user_pay_config.fund_into_type
     */
    private String fundIntoType;

    /**
     *  ,所属表字段为rp_user_pay_config.pay_secret
     */
    private String paySecret;

    /**
     *  安全等级,所属表字段为rp_user_pay_config.security_rating
     */
    private String securityRating;

    /**
     *  商户服务器IP,所属表字段为rp_user_pay_config.merchant_server_ip
     */
    private String merchantServerIp;

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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getIsAutoSett() {
        return isAutoSett;
    }

    public void setIsAutoSett(String isAutoSett) {
        this.isAutoSett = isAutoSett;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public Integer getRiskDay() {
        return riskDay;
    }

    public void setRiskDay(Integer riskDay) {
        this.riskDay = riskDay;
    }

    public String getPayKey() {
        return payKey;
    }

    public void setPayKey(String payKey) {
        this.payKey = payKey;
    }

    public String getFundIntoType() {
        return fundIntoType;
    }

    public void setFundIntoType(String fundIntoType) {
        this.fundIntoType = fundIntoType;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    public String getSecurityRating() {
        return securityRating;
    }

    public void setSecurityRating(String securityRating) {
        this.securityRating = securityRating;
    }

    public String getMerchantServerIp() {
        return merchantServerIp;
    }

    public void setMerchantServerIp(String merchantServerIp) {
        this.merchantServerIp = merchantServerIp;
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
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", isAutoSett=").append(isAutoSett);
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", riskDay=").append(riskDay);
        sb.append(", payKey=").append(payKey);
        sb.append(", fundIntoType=").append(fundIntoType);
        sb.append(", paySecret=").append(paySecret);
        sb.append(", securityRating=").append(securityRating);
        sb.append(", merchantServerIp=").append(merchantServerIp);
        sb.append("]");
        return sb.toString();
    }
}