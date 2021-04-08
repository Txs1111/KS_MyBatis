package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;

import java.util.List;

public interface UserMapper {

    //通过ID查询
    List<User> getListUserByID(int id);



}
