package com.ssf.sys.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RpSettDailyCollect implements Serializable {
    /**
     *  id,所属表字段为rp_sett_daily_collect.id
     */
    private String id;

    /**
     *  版本号,所属表字段为rp_sett_daily_collect.version
     */
    private Integer version;

    /**
     *  创建时间,所属表字段为rp_sett_daily_collect.create_time
     */
    private Date createTime;

    /**
     *  修改时间,所属表字段为rp_sett_daily_collect.edit_time
     */
    private Date editTime;

    /**
     *  账户编号,所属表字段为rp_sett_daily_collect.account_no
     */
    private String accountNo;

    /**
     *  用户姓名,所属表字段为rp_sett_daily_collect.user_name
     */
    private String userName;

    /**
     *  汇总日期,所属表字段为rp_sett_daily_collect.collect_date
     */
    private Date collectDate;

    /**
     *  汇总类型(参考枚举:settdailycollecttypeenum),所属表字段为rp_sett_daily_collect.collect_type
     */
    private String collectType;

    /**
     *  交易总金额,所属表字段为rp_sett_daily_collect.total_amount
     */
    private BigDecimal totalAmount;

    /**
     *  交易总笔数,所属表字段为rp_sett_daily_collect.total_count
     */
    private Integer totalCount;

    /**
     *  结算状态(参考枚举:settdailycollectstatusenum),所属表字段为rp_sett_daily_collect.sett_status
     */
    private String settStatus;

    /**
     *  备注,所属表字段为rp_sett_daily_collect.remark
     */
    private String remark;

    /**
     *  风险预存期天数,所属表字段为rp_sett_daily_collect.risk_day
     */
    private Integer riskDay;

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

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public String getCollectType() {
        return collectType;
    }

    public void setCollectType(String collectType) {
        this.collectType = collectType;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getRiskDay() {
        return riskDay;
    }

    public void setRiskDay(Integer riskDay) {
        this.riskDay = riskDay;
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
        sb.append(", accountNo=").append(accountNo);
        sb.append(", userName=").append(userName);
        sb.append(", collectDate=").append(collectDate);
        sb.append(", collectType=").append(collectType);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", settStatus=").append(settStatus);
        sb.append(", remark=").append(remark);
        sb.append(", riskDay=").append(riskDay);
        sb.append("]");
        return sb.toString();
    }
}