package com.ssf.rp.model;

import java.io.Serializable;
import java.util.Date;

public class RpUserPayInfo implements Serializable {
    /**
     *  ,所属表字段为rp_user_pay_info.id_
     */
    private String id;

    /**
     *  ,所属表字段为rp_user_pay_info.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_user_pay_info.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_user_pay_info.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_user_pay_info.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_user_pay_info.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_user_pay_info.app_id
     */
    private String appId;

    /**
     *  ,所属表字段为rp_user_pay_info.app_sectet
     */
    private String appSectet;

    /**
     *  ,所属表字段为rp_user_pay_info.merchant_id
     */
    private String merchantId;

    /**
     *  ,所属表字段为rp_user_pay_info.app_type
     */
    private String appType;

    /**
     *  ,所属表字段为rp_user_pay_info.user_no
     */
    private String userNo;

    /**
     *  ,所属表字段为rp_user_pay_info.user_name
     */
    private String userName;

    /**
     *  ,所属表字段为rp_user_pay_info.partner_key
     */
    private String partnerKey;

    /**
     *  支付方式编号,所属表字段为rp_user_pay_info.pay_way_code
     */
    private String payWayCode;

    /**
     *  支付方式名称,所属表字段为rp_user_pay_info.pay_way_name
     */
    private String payWayName;

    /**
     *  ,所属表字段为rp_user_pay_info.offline_app_id
     */
    private String offlineAppId;

    /**
     *  ,所属表字段为rp_user_pay_info.rsa_private_key
     */
    private String rsaPrivateKey;

    /**
     *  ,所属表字段为rp_user_pay_info.rsa_public_key
     */
    private String rsaPublicKey;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSectet() {
        return appSectet;
    }

    public void setAppSectet(String appSectet) {
        this.appSectet = appSectet;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
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

    public String getPartnerKey() {
        return partnerKey;
    }

    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
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

    public String getOfflineAppId() {
        return offlineAppId;
    }

    public void setOfflineAppId(String offlineAppId) {
        this.offlineAppId = offlineAppId;
    }

    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
    }

    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
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
        sb.append(", appId=").append(appId);
        sb.append(", appSectet=").append(appSectet);
        sb.append(", merchantId=").append(merchantId);
        sb.append(", appType=").append(appType);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", partnerKey=").append(partnerKey);
        sb.append(", payWayCode=").append(payWayCode);
        sb.append(", payWayName=").append(payWayName);
        sb.append(", offlineAppId=").append(offlineAppId);
        sb.append(", rsaPrivateKey=").append(rsaPrivateKey);
        sb.append(", rsaPublicKey=").append(rsaPublicKey);
        sb.append("]");
        return sb.toString();
    }
}