package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有数据
    List<User> getListUser();

    //通过ID查询
    List<User> getListUserbyID(int id);

    //添加数据
    int addUser(User user);

    //更新数据
    int updateUser(User user);

    //删除数据
    int delectUserbyid(int id);

}
