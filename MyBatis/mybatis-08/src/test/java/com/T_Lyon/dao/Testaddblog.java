package com.T_Lyon.dao;

import com.T_Lyon.pojo.Blog;
import com.T_Lyon.utils.MyBatisUtils;
import com.T_Lyon.utils.IDutils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class Testaddblog {
    @Test
    public void addBook() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getID());
        blog.setTitle("MyBatis如此简单");
        blog.setAuthor("狂胜说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        blog.setId(IDutils.getID());
        blog.setTitle("Java如此简单");
        mapper.addBook(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("Spring如此简单");
        mapper.addBook(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("微服务如此简单");
        mapper.addBook(blog);

        sqlSession.commit();
        sqlSession.close();
    }


}












