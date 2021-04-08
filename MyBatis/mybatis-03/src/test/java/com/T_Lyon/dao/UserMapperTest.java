package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {


    @Test//通过ID查询数据
    public void getListUserByID() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> listUserByID = mapper.getListUserByID(2);

        for (User user : listUserByID) {
            System.out.println(listUserByID);
        }

    }


}
