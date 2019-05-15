package com.jk.liujw.mapper;

import com.jk.liujw.model.TreeBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Lenovo
 * @title: TreeMapper
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1322:41
 */
public interface TreeMapper {
    @Select("select * from t_tree where pid = #{value}")
    List<TreeBean> findTreeList(int i);
}
