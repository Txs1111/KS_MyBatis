package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void Test() {
//        调用方法拿到SqlSession
        SqlSession sqlSession = MyBatisUtils.get_SqlSession();
//        查找运行sql语句，使用mybatis推荐的方法getMapper（）。
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
