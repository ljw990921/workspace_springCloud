package com.jk.liujw.controller;

import com.jk.liujw.mapper.UserMapper;
import com.jk.liujw.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lenovo
 * @title: UserController
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1321:06
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping(value = "/updateUser")
    public void  updateUser(@RequestBody UserBean userBean){
        userMapper.updateUser(userBean);
    }


    @PostMapping(value = "/queryUserById")
    public UserBean queryUserById(@RequestParam(value="id") Integer id){
        return userMapper.queryUserById(id);
    }

    @PostMapping(value = "/queryUser")
    public List<UserBean> queryUser(){
        return userMapper.queryUser();
    }

    @PostMapping(value = "/delUser")
    public void delUser(@RequestParam(value="ids") Integer ids){
        userMapper.delUser(ids);
    }

    @PostMapping(value = "/saveUser")
    public void saveUser(@RequestBody UserBean userBean){
        userMapper.saveUser(userBean);
    }

    /*@PostMapping(value = "/hello")
    public UserBean helloUser(){
        UserBean u = new UserBean();
        u.setId(2);
        u.setStatus(1);
        u.setCreateTime("1999-09-21");
        u.setUserName("老刘");
        u.setUserPwd("123");
        u.setUserRole("111");
        return u;
    }*/
}
