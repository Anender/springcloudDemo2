package org.ender.springcloudDemo2.service1.client.dto;

import java.io.Serializable;

/**
 * @Author: ENDER
 * @Date: 2021/1/17 15:10
 * @Description: 用户表
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    //用户id
    private Long id;
    //用户登录名
    private String userName;
    //用户密码
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
