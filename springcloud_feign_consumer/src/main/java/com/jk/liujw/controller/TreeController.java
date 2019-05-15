package com.jk.liujw.controller;

import com.jk.liujw.model.TreeBean;
import com.jk.liujw.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lenovo
 * @title: TreeController
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1322:37
 */
@RestController
public class TreeController {

    @Autowired
    TreeService treeService;

    @PostMapping(value = "findTree")
    public List<TreeBean> findTree(){
        return treeService.findTree();
    }
}
