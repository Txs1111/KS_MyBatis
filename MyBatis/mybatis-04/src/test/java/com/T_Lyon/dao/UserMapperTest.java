package com.T_Lyon.dao;

import com.T_Lyon.pojo.User;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test//通过ID查询数据
    public void getListUserByID() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> listUserByID = mapper.getListUserByID(2);
        logger.debug("测试logger");
        for (User user : listUserByID) {
            System.out.println(listUserByID);
        }
        sqlSession.close();
    }

    @Test//通过limit分页查询
    public void getUserByLimit() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 4);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test//通过RowBounds分页查询
    public void getUserByRowBounds() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1, 2);
        //offset起始下标，limit第几个

        //通过java代码层完成分页
        List<User> userList = sqlSession.selectList("com.T_Lyon.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
