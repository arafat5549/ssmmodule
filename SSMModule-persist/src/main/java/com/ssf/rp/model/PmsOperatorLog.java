package com.ssf.rp.model;

import java.io.Serializable;
import java.util.Date;

public class PmsOperatorLog implements Serializable {
    /**
     *  主键,所属表字段为pms_operator_log.id
     */
    private Long id;

    /**
     *  ,所属表字段为pms_operator_log.version
     */
    private Long version;

    /**
     *  创建人,所属表字段为pms_operator_log.creater
     */
    private String creater;

    /**
     *  创建时间,所属表字段为pms_operator_log.create_time
     */
    private Date createTime;

    /**
     *  修改人,所属表字段为pms_operator_log.editor
     */
    private String editor;

    /**
     *  修改时间,所属表字段为pms_operator_log.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为pms_operator_log.status
     */
    private String status;

    /**
     *  ,所属表字段为pms_operator_log.remark
     */
    private String remark;

    /**
     *  ,所属表字段为pms_operator_log.operator_id
     */
    private Long operatorId;

    /**
     *  ,所属表字段为pms_operator_log.operator_name
     */
    private String operatorName;

    /**
     *  操作类型（1:增加，2:修改，3:删除，4:查询）,所属表字段为pms_operator_log.operate_type
     */
    private String operateType;

    /**
     *  ,所属表字段为pms_operator_log.ip
     */
    private String ip;

    /**
     *  ,所属表字段为pms_operator_log.content
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
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

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", editor=").append(editor);
        sb.append(", editTime=").append(editTime);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", operateType=").append(operateType);
        sb.append(", ip=").append(ip);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}