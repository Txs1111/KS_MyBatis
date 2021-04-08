package com.T_Lyon.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory ==> SqlSession
//工具类，实现从工厂拿到SqlSession
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    //写在static中，使其在程序运行时就开始加载
    static {
        try {
            String resource = "mybatis-config.xml";
//            resource存进流中可能会报错，所以把它放进异常中
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回一个SqlSession对象，方便调用里面的方法（操作数据库的方法都在里面）
     * @return
     */
    public static SqlSession get_SqlSession() {
        return sqlSessionFactory.openSession();
    }

}
