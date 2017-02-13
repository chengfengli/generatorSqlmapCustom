package com.entity;

public class Users {
    private Integer userId;

    private String userName;

    private String userAccount;

    private String userPassword;

    private Integer rememberPassword;

    private String loginpcIp;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getRememberPassword() {
        return rememberPassword;
    }

    public void setRememberPassword(Integer rememberPassword) {
        this.rememberPassword = rememberPassword;
    }

    public String getLoginpcIp() {
        return loginpcIp;
    }

    public void setLoginpcIp(String loginpcIp) {
        this.loginpcIp = loginpcIp == null ? null : loginpcIp.trim();
    }
}