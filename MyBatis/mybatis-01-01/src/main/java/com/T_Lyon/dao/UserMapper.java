package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有数据
    List<User> getListUser();

    //通过ID查询
    List<User> getListUserbyID(int id);

    //万能的Map，通过Map限制条件查数据
    List<User> getUserById2(Map<String, Object> map);

    //模糊查询数据
    List<User> getUserMohu(String value);

    //添加数据
    int addUser(User user);

    //万能的Map，通过Map添加部分数据
    int addUser2(Map<String, Object> map);

    //更新数据
    int updateUser(User user);

    //删除数据
    int delectUserbyid(int id);

}
