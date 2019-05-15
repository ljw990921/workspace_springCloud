package com.jk.liujw.mapper;

import com.jk.liujw.model.UserBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lenovo
 * @title: UserMapper
 * @projectName workspace_springCloud
 * @description: TODO
 * @date 2019/5/1321:57
 */
public interface UserMapper {
    @Select("select " +
            "userId," +
            "userName," +
            "userPwd," +
            "userRole," +
            "createTime," +
            "status from t_user")
    List<UserBean> queryUser();

    @Delete("delete from t_user where userId = #{value}")
    void delUser(@RequestParam(value = "ids") Integer ids);

    @Insert("insert into t_user(userName,userPwd,createTime)" +
            "values(#{userName},#{userPwd},#{createTime})")
    void saveUser(UserBean userBean);

    @Select("select * from t_user where userId = #{value}")
    UserBean queryUserById(@RequestParam(value="id") Integer id);

    @Update("update t_user set " +
            "userName = #{userName}," +
            "userPwd = #{userPwd}," +
            "createTime = #{createTime} " +
            "where userId = #{userId}")
    void updateUser(UserBean userBean);
}
