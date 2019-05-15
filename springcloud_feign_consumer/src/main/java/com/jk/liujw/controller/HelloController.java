package com.jk.liujw.controller;

import com.jk.liujw.model.UserBean;
import com.jk.liujw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lenovo
 * @title: HelloController
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1319:47
 */
@RestController
public class HelloController {
    @Autowired
    UserService userService;

    /*@GetMapping(value = "/hi")
    public UserBean sayHi(@RequestParam String name) {
        return helloService.helloUser();
    }*/

    @PostMapping(value = "/queryUser")
    public List<UserBean> queryUser(){
        return userService.queryUser();
    }

    @PostMapping(value="/delUser")
    public void delUser(@RequestParam(value="ids") Integer ids){
        userService.delUser(ids);
    }

    @PostMapping(value = "/saveUser")
    public void saveUser(UserBean userBean){
        if(userBean.getUserId()!=null){
            userService.updateUser(userBean);
        }else{
            userService.saveUser(userBean);
        }
    }

    @PostMapping(value = "/queryUserById")
    public UserBean queryUserById(@RequestParam(value = "id") Integer id){
        return userService.queryUserById(id);
    }
}
