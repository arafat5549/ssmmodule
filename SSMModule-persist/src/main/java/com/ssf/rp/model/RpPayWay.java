package com.ssf.rp.model;

import java.io.Serializable;
import java.util.Date;

public class RpPayWay implements Serializable {
    /**
     *  id,所属表字段为rp_pay_way.id
     */
    private String id;

    /**
     *  version,所属表字段为rp_pay_way.version
     */
    private Long version;

    /**
     *  创建时间,所属表字段为rp_pay_way.create_time
     */
    private Date createTime;

    /**
     *  修改时间,所属表字段为rp_pay_way.edit_time
     */
    private Date editTime;

    /**
     *  支付方式编号,所属表字段为rp_pay_way.pay_way_code
     */
    private String payWayCode;

    /**
     *  支付方式名称,所属表字段为rp_pay_way.pay_way_name
     */
    private String payWayName;

    /**
     *  支付类型编号,所属表字段为rp_pay_way.pay_type_code
     */
    private String payTypeCode;

    /**
     *  支付类型名称,所属表字段为rp_pay_way.pay_type_name
     */
    private String payTypeName;

    /**
     *  支付产品编号,所属表字段为rp_pay_way.pay_product_code
     */
    private String payProductCode;

    /**
     *  状态(100:正常状态,101非正常状态),所属表字段为rp_pay_way.status
     */
    private String status;

    /**
     *  排序(倒序排序,默认值1000),所属表字段为rp_pay_way.sorts
     */
    private Integer sorts;

    /**
     *  商户支付费率,所属表字段为rp_pay_way.pay_rate
     */
    private Double payRate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
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

    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public String getPayProductCode() {
        return payProductCode;
    }

    public void setPayProductCode(String payProductCode) {
        this.payProductCode = payProductCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
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
        sb.append(", payWayCode=").append(payWayCode);
        sb.append(", payWayName=").append(payWayName);
        sb.append(", payTypeCode=").append(payTypeCode);
        sb.append(", payTypeName=").append(payTypeName);
        sb.append(", payProductCode=").append(payProductCode);
        sb.append(", status=").append(status);
        sb.append(", sorts=").append(sorts);
        sb.append(", payRate=").append(payRate);
        sb.append("]");
        return sb.toString();
    }
}