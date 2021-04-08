package com.T_Lyon.dao;

import com.T_Lyon.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //    增加数据
    int addBook(Blog blog);

    //    查询数据
    List<Blog> getBook(Map map);

    //    使用chose，when，otherwise查询数据
    List<Blog> getBookByChose(Map map);

    //    更新数据（set标签）
    void updataBlog(Map map);

    //    查询1,2,3号博客
    List<Blog> getBlog(Map map);
}
