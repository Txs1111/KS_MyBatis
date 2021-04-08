package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void Test() {
//        ���÷����õ�SqlSession
        SqlSession sqlSession = MyBatisUtils.get_SqlSession();
//        ��������sql��䣬ʹ��mybatis�Ƽ��ķ���getMapper������
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
