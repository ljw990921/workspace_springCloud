package com.jk.liujw.model;

import java.io.Serializable;

/**
 * @author Lenovo
 * @title: UserBean
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/158:48
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = 7319573826710939120L;

    private Integer userId;

    private String userName;

    private String userPwd;

    private String createTime;

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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
