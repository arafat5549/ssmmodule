package com.ssf.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpRefundRecord implements Serializable {
    /**
     *  id,所属表字段为rp_refund_record.id
     */
    private String id;

    /**
     *  版本号,所属表字段为rp_refund_record.version
     */
    private Integer version;

    /**
     *  创建时间,所属表字段为rp_refund_record.create_time
     */
    private Date createTime;

    /**
     *  修改者,所属表字段为rp_refund_record.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_refund_record.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_refund_record.edit_time
     */
    private Date editTime;

    /**
     *  原商户订单号,所属表字段为rp_refund_record.org_merchant_order_no
     */
    private String orgMerchantOrderNo;

    /**
     *  原支付流水号,所属表字段为rp_refund_record.org_trx_no
     */
    private String orgTrxNo;

    /**
     *  原银行订单号,所属表字段为rp_refund_record.org_bank_order_no
     */
    private String orgBankOrderNo;

    /**
     *  原银行流水号,所属表字段为rp_refund_record.org_bank_trx_no
     */
    private String orgBankTrxNo;

    /**
     *  商家名称,所属表字段为rp_refund_record.merchant_name
     */
    private String merchantName;

    /**
     *  商家编号,所属表字段为rp_refund_record.merchant_no
     */
    private String merchantNo;

    /**
     *  原商品名称,所属表字段为rp_refund_record.org_product_name
     */
    private String orgProductName;

    /**
     *  原业务类型,所属表字段为rp_refund_record.org_biz_type
     */
    private String orgBizType;

    /**
     *  原支付方式类型,所属表字段为rp_refund_record.org_payment_type
     */
    private String orgPaymentType;

    /**
     *  订单退款金额,所属表字段为rp_refund_record.refund_amount
     */
    private BigDecimal refundAmount;

    /**
     *  退款流水号,所属表字段为rp_refund_record.refund_trx_no
     */
    private String refundTrxNo;

    /**
     *  退款订单号,所属表字段为rp_refund_record.refund_order_no
     */
    private String refundOrderNo;

    /**
     *  银行退款订单号,所属表字段为rp_refund_record.bank_refund_order_no
     */
    private String bankRefundOrderNo;

    /**
     *  银行退款流水号,所属表字段为rp_refund_record.bank_refund_trx_no
     */
    private String bankRefundTrxNo;

    /**
     *  退款结果通知url,所属表字段为rp_refund_record.result_notify_url
     */
    private String resultNotifyUrl;

    /**
     *  退款状态,所属表字段为rp_refund_record.refund_status
     */
    private String refundStatus;

    /**
     *  退款来源（分发平台）,所属表字段为rp_refund_record.refund_from
     */
    private String refundFrom;

    /**
     *  退款方式,所属表字段为rp_refund_record.refund_way
     */
    private String refundWay;

    /**
     *  退款请求时间,所属表字段为rp_refund_record.refund_request_time
     */
    private Date refundRequestTime;

    /**
     *   退款成功时间,所属表字段为rp_refund_record.refund_success_time
     */
    private Date refundSuccessTime;

    /**
     *  退款完成时间,所属表字段为rp_refund_record.refund_complete_time
     */
    private Date refundCompleteTime;

    /**
     *  退款请求,申请人登录名,所属表字段为rp_refund_record.request_apply_user_id
     */
    private String requestApplyUserId;

    /**
     *  退款请求,申请人姓名,所属表字段为rp_refund_record.request_apply_user_name
     */
    private String requestApplyUserName;

    /**
     *  退款原因,所属表字段为rp_refund_record.refund_reason
     */
    private String refundReason;

    /**
     *  备注,所属表字段为rp_refund_record.remark
     */
    private String remark;

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

    public String getOrgMerchantOrderNo() {
        return orgMerchantOrderNo;
    }

    public void setOrgMerchantOrderNo(String orgMerchantOrderNo) {
        this.orgMerchantOrderNo = orgMerchantOrderNo;
    }

    public String getOrgTrxNo() {
        return orgTrxNo;
    }

    public void setOrgTrxNo(String orgTrxNo) {
        this.orgTrxNo = orgTrxNo;
    }

    public String getOrgBankOrderNo() {
        return orgBankOrderNo;
    }

    public void setOrgBankOrderNo(String orgBankOrderNo) {
        this.orgBankOrderNo = orgBankOrderNo;
    }

    public String getOrgBankTrxNo() {
        return orgBankTrxNo;
    }

    public void setOrgBankTrxNo(String orgBankTrxNo) {
        this.orgBankTrxNo = orgBankTrxNo;
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

    public String getOrgProductName() {
        return orgProductName;
    }

    public void setOrgProductName(String orgProductName) {
        this.orgProductName = orgProductName;
    }

    public String getOrgBizType() {
        return orgBizType;
    }

    public void setOrgBizType(String orgBizType) {
        this.orgBizType = orgBizType;
    }

    public String getOrgPaymentType() {
        return orgPaymentType;
    }

    public void setOrgPaymentType(String orgPaymentType) {
        this.orgPaymentType = orgPaymentType;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundTrxNo() {
        return refundTrxNo;
    }

    public void setRefundTrxNo(String refundTrxNo) {
        this.refundTrxNo = refundTrxNo;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getBankRefundOrderNo() {
        return bankRefundOrderNo;
    }

    public void setBankRefundOrderNo(String bankRefundOrderNo) {
        this.bankRefundOrderNo = bankRefundOrderNo;
    }

    public String getBankRefundTrxNo() {
        return bankRefundTrxNo;
    }

    public void setBankRefundTrxNo(String bankRefundTrxNo) {
        this.bankRefundTrxNo = bankRefundTrxNo;
    }

    public String getResultNotifyUrl() {
        return resultNotifyUrl;
    }

    public void setResultNotifyUrl(String resultNotifyUrl) {
        this.resultNotifyUrl = resultNotifyUrl;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundFrom() {
        return refundFrom;
    }

    public void setRefundFrom(String refundFrom) {
        this.refundFrom = refundFrom;
    }

    public String getRefundWay() {
        return refundWay;
    }

    public void setRefundWay(String refundWay) {
        this.refundWay = refundWay;
    }

    public Date getRefundRequestTime() {
        return refundRequestTime;
    }

    public void setRefundRequestTime(Date refundRequestTime) {
        this.refundRequestTime = refundRequestTime;
    }

    public Date getRefundSuccessTime() {
        return refundSuccessTime;
    }

    public void setRefundSuccessTime(Date refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }

    public Date getRefundCompleteTime() {
        return refundCompleteTime;
    }

    public void setRefundCompleteTime(Date refundCompleteTime) {
        this.refundCompleteTime = refundCompleteTime;
    }

    public String getRequestApplyUserId() {
        return requestApplyUserId;
    }

    public void setRequestApplyUserId(String requestApplyUserId) {
        this.requestApplyUserId = requestApplyUserId;
    }

    public String getRequestApplyUserName() {
        return requestApplyUserName;
    }

    public void setRequestApplyUserName(String requestApplyUserName) {
        this.requestApplyUserName = requestApplyUserName;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        sb.append(", orgMerchantOrderNo=").append(orgMerchantOrderNo);
        sb.append(", orgTrxNo=").append(orgTrxNo);
        sb.append(", orgBankOrderNo=").append(orgBankOrderNo);
        sb.append(", orgBankTrxNo=").append(orgBankTrxNo);
        sb.append(", merchantName=").append(merchantName);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", orgProductName=").append(orgProductName);
        sb.append(", orgBizType=").append(orgBizType);
        sb.append(", orgPaymentType=").append(orgPaymentType);
        sb.append(", refundAmount=").append(refundAmount);
        sb.append(", refundTrxNo=").append(refundTrxNo);
        sb.append(", refundOrderNo=").append(refundOrderNo);
        sb.append(", bankRefundOrderNo=").append(bankRefundOrderNo);
        sb.append(", bankRefundTrxNo=").append(bankRefundTrxNo);
        sb.append(", resultNotifyUrl=").append(resultNotifyUrl);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", refundFrom=").append(refundFrom);
        sb.append(", refundWay=").append(refundWay);
        sb.append(", refundRequestTime=").append(refundRequestTime);
        sb.append(", refundSuccessTime=").append(refundSuccessTime);
        sb.append(", refundCompleteTime=").append(refundCompleteTime);
        sb.append(", requestApplyUserId=").append(requestApplyUserId);
        sb.append(", requestApplyUserName=").append(requestApplyUserName);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}