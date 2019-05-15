package com.jk.liujw.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Lenovo
 * @title: TreeBean
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/158:46
 */
public class TreeBean implements Serializable {

    private static final long serialVersionUID = 259384834843867019L;
    private Integer id;

    private String text;

    private Integer pid;

    private String url;

    private List<TreeBean> nodes;

    private Boolean selectable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }
}
