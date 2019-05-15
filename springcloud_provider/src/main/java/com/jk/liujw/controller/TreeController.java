package com.jk.liujw.controller;

import com.jk.liujw.mapper.TreeMapper;
import com.jk.liujw.model.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lenovo
 * @title: TreeController
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1322:39
 */
@RestController
public class TreeController {

    @Autowired
    TreeMapper treeMapper;

    @PostMapping(value = "/findTree")
    public List<TreeBean> findTree(){
        return findTreeList(0);
    }

    private List<TreeBean> findTreeList(int i) {
        List<TreeBean> list = treeMapper.findTreeList(i);
        for (TreeBean treeBean:list) {
            Integer id = treeBean.getId();
            List<TreeBean> treeList = findTreeList(id);
            if (treeList!=null&&treeList.size()>0){
                treeBean.setNodes(treeList);
            }else{
                treeBean.setSelectable(true);
            }

        }
        return list;
    }
}
