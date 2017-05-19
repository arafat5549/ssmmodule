package com.ssf.rp.model;

import java.io.Serializable;
import java.util.Date;

public class RpNotifyRecord implements Serializable {
    /**
     *  ,所属表字段为rp_notify_record.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_notify_record.version
     */
    private Integer version;

    /**
     *  ,所属表字段为rp_notify_record.create_time
     */
    private Date createTime;

    /**
     *  修改者,所属表字段为rp_notify_record.editor
     */
    private String editor;

    /**
     *  创建者,所属表字段为rp_notify_record.creater
     */
    private String creater;

    /**
     *  最后修改时间,所属表字段为rp_notify_record.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_notify_record.notify_times
     */
    private Integer notifyTimes;

    /**
     *  ,所属表字段为rp_notify_record.limit_notify_times
     */
    private Integer limitNotifyTimes;

    /**
     *  ,所属表字段为rp_notify_record.url
     */
    private String url;

    /**
     *  ,所属表字段为rp_notify_record.merchant_order_no
     */
    private String merchantOrderNo;

    /**
     *  ,所属表字段为rp_notify_record.merchant_no
     */
    private String merchantNo;

    /**
     *  100:成功 101:失败,所属表字段为rp_notify_record.status
     */
    private String status;

    /**
     *  通知类型,所属表字段为rp_notify_record.notify_type
     */
    private String notifyType;

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

    public Integer getNotifyTimes() {
        return notifyTimes;
    }

    public void setNotifyTimes(Integer notifyTimes) {
        this.notifyTimes = notifyTimes;
    }

    public Integer getLimitNotifyTimes() {
        return limitNotifyTimes;
    }

    public void setLimitNotifyTimes(Integer limitNotifyTimes) {
        this.limitNotifyTimes = limitNotifyTimes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
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
        sb.append(", notifyTimes=").append(notifyTimes);
        sb.append(", limitNotifyTimes=").append(limitNotifyTimes);
        sb.append(", url=").append(url);
        sb.append(", merchantOrderNo=").append(merchantOrderNo);
        sb.append(", merchantNo=").append(merchantNo);
        sb.append(", status=").append(status);
        sb.append(", notifyType=").append(notifyType);
        sb.append("]");
        return sb.toString();
    }
}