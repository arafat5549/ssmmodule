package com.ssf.pms.model;

import java.io.Serializable;
import java.util.Date;

public class RpSettRecordAnnex implements Serializable {
    /**
     *  ,所属表字段为rp_sett_record_annex.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_sett_record_annex.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_sett_record_annex.edit_time
     */
    private Date editTime;

    /**
     *  ,所属表字段为rp_sett_record_annex.version
     */
    private Long version;

    /**
     *  ,所属表字段为rp_sett_record_annex.remark
     */
    private String remark;

    /**
     *  ,所属表字段为rp_sett_record_annex.is_delete
     */
    private String isDelete;

    /**
     *  ,所属表字段为rp_sett_record_annex.annex_name
     */
    private String annexName;

    /**
     *  ,所属表字段为rp_sett_record_annex.annex_address
     */
    private String annexAddress;

    /**
     *  ,所属表字段为rp_sett_record_annex.settlement_id
     */
    private String settlementId;

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

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getAnnexName() {
        return annexName;
    }

    public void setAnnexName(String annexName) {
        this.annexName = annexName;
    }

    public String getAnnexAddress() {
        return annexAddress;
    }

    public void setAnnexAddress(String annexAddress) {
        this.annexAddress = annexAddress;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
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
        sb.append(", isDelete=").append(isDelete);
        sb.append(", annexName=").append(annexName);
        sb.append(", annexAddress=").append(annexAddress);
        sb.append(", settlementId=").append(settlementId);
        sb.append("]");
        return sb.toString();
    }
}