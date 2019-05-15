package com.jk.liujw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lenovo
 * @title: PageController
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1322:32
 */
@RequestMapping("page")
@Controller
public class PageController {

    @RequestMapping("toEditUser")
    public String toEditUser(){
        return "view/edit";
    }

    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "view/add";
    }

    @RequestMapping("toMain")
    public String toMain(){
        return "view/main";
    }

    @RequestMapping("toList")
    public String toList(){
        return "view/list";
    }
}
