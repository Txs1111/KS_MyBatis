package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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

}
