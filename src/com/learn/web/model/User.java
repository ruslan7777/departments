package com.learn.web.model;

/**
 * Created by RUSLAN77 on  23.02.2018 in Ukraine
 */
public class User {
    private Integer userId;
    private String userName;

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

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
        this.userName = userName;
    }


}
