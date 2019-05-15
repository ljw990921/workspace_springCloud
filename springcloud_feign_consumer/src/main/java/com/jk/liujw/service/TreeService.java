package com.jk.liujw.service;

import com.jk.liujw.model.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Lenovo
 * @title: TreeService
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1322:38
 */
@FeignClient(value = "service-hi02")
public interface TreeService{

    @RequestMapping(value = "/findTree" , method = RequestMethod.POST)
    List<TreeBean> findTree();
}
