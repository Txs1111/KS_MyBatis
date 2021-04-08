package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {


    @Test//查询所有数据
    public void gettableUser() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> listUser = mapper.getListUser();
        for (User user : listUser) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test//通过ID查询数据
    public void getListUserbyID() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> listUserbyID = mapper.getListUserbyID(2);

        for (User user : listUserbyID) {
            System.out.println(user);
        }

    }

    @Test//Map，通过Map多限制条件查询
    public void getListUserbyID2() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();

        stringObjectHashMap.put("mapid", 1);

        stringObjectHashMap.put("mapname", "刘一");

        List<User> userById2 = mapper.getUserById2(stringObjectHashMap);

        for (User user : userById2) {
            System.out.println(userById2);
        }
    }

    @Test//模糊查询
    public void getListUserMohu() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> liu = mapper.getUserMohu("刘");
        List<User> liu = mapper.getUserMohu("%刘%");
        for (User user : liu) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test//插入数据
    public void insertUser() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(4, "李四", "lisi"));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test//删除数据
    public void delectbyid() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.delectUserbyid(4);

        sqlSession.commit();

        sqlSession.close();

    }

    @Test//添加数据
    public void addUser() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(2, "二", "er"));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test//Map，通过Map添加数据的部分字段
    public void addUserbufen() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();

        stringObjectHashMap.put("bufenid", 6);

        stringObjectHashMap.put("bufenname", "六子");


        mapper.addUser2(stringObjectHashMap);

        sqlSession.commit();

        sqlSession.close();
    }
}
