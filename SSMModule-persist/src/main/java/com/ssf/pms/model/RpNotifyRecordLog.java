package com.ssf.pms.model;

import java.io.Serializable;
import java.util.Date;

public class RpNotifyRecordLog implements Serializable {
    /**
     *  ,所属表字段为rp_notify_record_log.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_notify_record_log.version
     */
    private Integer version;

    /**
     *  修改者,所属表字段为rp_notify_record_log.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_notify_record_log.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_notify_record_log.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_notify_record_log.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_notify_record_log.notify_id
     */
    private String notifyId;

    /**
     *  ,所属表字段为rp_notify_record_log.request
     */
    private String request;

    /**
     *  ,所属表字段为rp_notify_record_log.response
     */
    private String response;

    /**
     *  ,所属表字段为rp_notify_record_log.merchant_no
     */
    private String merchantNo;

    /**
     *  商户订单号,所属表字段为rp_notify_record_log.merchant_order_no
     */
    private String merchantOrderNo;

    /**
     *  http状态,所属表字段为rp_notify_record_log.http_status
     */
    private String httpStatus;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", editor=").append(editor);
        sb.append(", creater=").append(creater);
        sb.append(", editTime=").append(editTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", notifyId=").append(notifyId);
        sb.append(", request=").append(request);
        sb.append(", response=").append(response);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", httpStatus=").append(httpStatus);
        sb.append("]");
        return sb.toString();
    }
}