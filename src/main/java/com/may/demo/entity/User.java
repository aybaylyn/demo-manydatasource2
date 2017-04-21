package com.may.demo.entity;

import com.may.demo.entity.base.CreateBaseDomain;

/**
 * Created by May on 3/16/17.
 */
public class User extends CreateBaseDomain {

    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
