package com.six.electirc_account.entity;


import javax.persistence.Transient;

/**
 * @Description: 用户实体类
 * @Author: stugxr
 * @Date: 2021/6/11 3:38 下午
 * @Version: 1.0
 */
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private String userIDCard;
    private String telNo;
    private int userLevel;
    @Transient
    private boolean authorizeStatus;

    public boolean isAuthorizeStatus() {
        return authorizeStatus;
    }

    public void setAuthorizeStatus(boolean authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public User() {
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserIDCard() {
        return userIDCard;
    }

    public void setUserIDCard(String userIDCard) {
        this.userIDCard = userIDCard;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userIDCard='" + userIDCard + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }
}
