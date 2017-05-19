package com.ssf.pms.model;

import java.io.Serializable;
import java.util.Date;

public class RpPayProduct implements Serializable {
    /**
     *  ,所属表字段为rp_pay_product.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_pay_product.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_pay_product.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_pay_product.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_pay_product.status
     */
    private String status;

    /**
     *  支付产品编号,所属表字段为rp_pay_product.product_code
     */
    private String productCode;

    /**
     *  支付产品名称,所属表字段为rp_pay_product.product_name
     */
    private String productName;

    /**
     *  ,所属表字段为rp_pay_product.audit_status
     */
    private String auditStatus;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
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
        sb.append(", status=").append(status);
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append("]");
        return sb.toString();
    }
}