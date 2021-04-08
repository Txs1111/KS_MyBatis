package com.T_Lyon.dao;

import com.T_Lyon.pojo.Blog;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Testblog2 {
    @Test
    public void getBook() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "Java如此简单");

        List<Blog> book = mapper.getBook(map);
        for (Blog blog : book) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void getBookByChose() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        List<Blog> bookByChose = mapper.getBookByChose(map);
        for (Blog blog : bookByChose) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title", "Java如此简单1");
        map.put("id", "a1630ab87d1c4d72b8ba452551317094");

        mapper.updataBlog(map);
        sqlSession.close();
    }

    @Test
    public void getBlog() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("1c4b58fbeadc4365913f95907200c93a");
        strings.add("74928bcd8dcf4dbda32ace95f4599e8e");
        map.put("ids", strings);

        List<Blog> blog = mapper.getBlog(map);
        for (Blog blog1 : blog) {
            System.out.println(blog1);
        }
        sqlSession.close();
    }
}








