package com.jk.liujw.service;

import com.jk.liujw.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lenovo
 * @title: UserService
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1319:48
 */
@FeignClient(value = "service-hi02")
public interface UserService{

    @RequestMapping(value = "/queryUser",method = RequestMethod.POST)
    List<UserBean> queryUser();

    @RequestMapping(value = "/delUser",method = RequestMethod.POST)
    void delUser(@RequestParam(value = "ids") Integer ids);

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    void updateUser(@RequestBody UserBean userBean);

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    void saveUser(@RequestBody UserBean userBean);

    @RequestMapping(value = "/queryUserById",method = RequestMethod.POST)
    UserBean queryUserById(@RequestParam(value = "id") Integer id);

    /*@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hello(@RequestParam (value= "name") String name);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    UserBean helloUser();*/

}
