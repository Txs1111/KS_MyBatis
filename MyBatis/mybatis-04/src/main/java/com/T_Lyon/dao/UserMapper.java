package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //通过ID查询
    List<User> getListUserByID(int id);

    //分页查询(Limit)
    List<User> getUserByLimit(Map<String,Integer> map);


    //分页查询2(RowBounds)
    List<User> getUserByRowBounds();


}
