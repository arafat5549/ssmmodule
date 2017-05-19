package com.ssf.pms.model;

import java.io.Serializable;
import java.util.Date;

public class RpUserInfo implements Serializable {
    /**
     *  ,所属表字段为rp_user_info.id
     */
    private String id;

    /**
     *  ,所属表字段为rp_user_info.create_time
     */
    private Date createTime;

    /**
     *  ,所属表字段为rp_user_info.status
     */
    private String status;

    /**
     *  ,所属表字段为rp_user_info.user_no
     */
    private String userNo;

    /**
     *  ,所属表字段为rp_user_info.user_name
     */
    private String userName;

    /**
     *  ,所属表字段为rp_user_info.account_no
     */
    private String accountNo;

    /**
     *  ,所属表字段为rp_user_info.mobile
     */
    private String mobile;

    /**
     *  ,所属表字段为rp_user_info.password
     */
    private String password;

    /**
     *  支付密码,所属表字段为rp_user_info.pay_pwd
     */
    private String payPwd;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", userNo=").append(userNo);
        sb.append(", userName=").append(userName);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", payPwd=").append(payPwd);
        sb.append("]");
        return sb.toString();
    }
}