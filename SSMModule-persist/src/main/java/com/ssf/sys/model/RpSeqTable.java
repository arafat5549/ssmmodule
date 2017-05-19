package com.ssf.sys.model;

import java.io.Serializable;

public class RpSeqTable implements Serializable {
    /**
     *  ,所属表字段为rp_seq_table.SEQ_NAME
     */
    private String seqName;

    /**
     *  ,所属表字段为rp_seq_table.CURRENT_VALUE
     */
    private Long currentValue;

    /**
     *  ,所属表字段为rp_seq_table.INCREMENT
     */
    private Short increment;

    /**
     *  ,所属表字段为rp_seq_table.REMARK
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public Long getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
    }

    public Short getIncrement() {
        return increment;
    }

    public void setIncrement(Short increment) {
        this.increment = increment;
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
        sb.append(", seqName=").append(seqName);
        sb.append(", currentValue=").append(currentValue);
        sb.append(", increment=").append(increment);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}