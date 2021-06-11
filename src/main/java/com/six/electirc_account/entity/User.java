package com.six.electirc_account.entity;

import java.util.Date;

/**
 * @Description: 用户实体类
 * @Author: stugxr
 * @Date: 2021/6/11 3:38 下午
 * @Version: 1.0
 */
public class User {
    private int id;
    private String uname;
    private int loginStatus;
    private Date lastLogTime;

    public User() {
    }

    public User(int id, String uname, int loginStatus, Date lastLogTime) {
        this.id = id;
        this.uname = uname;
        this.loginStatus = loginStatus;
        this.lastLogTime = lastLogTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getLastLogTime() {
        return lastLogTime;
    }

    public void setLastLogTime(Date lastLogTime) {
        this.lastLogTime = lastLogTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", loginStatus=" + loginStatus +
                ", lastLogTime=" + lastLogTime +
                '}';
    }
}
