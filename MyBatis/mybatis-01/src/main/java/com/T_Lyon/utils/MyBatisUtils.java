package com.T_Lyon.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory ==> SqlSession
//�����࣬ʵ�ִӹ����õ�SqlSession
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    //д��static�У�ʹ���ڳ�������ʱ�Ϳ�ʼ����
    static {
        try {
            String resource = "mybatis-config.xml";
//            resource������п��ܻᱨ�����԰����Ž��쳣��
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ����һ��SqlSession���󣬷����������ķ������������ݿ�ķ����������棩
     * @return
     */
    public static SqlSession get_SqlSession() {
        return sqlSessionFactory.openSession();
    }

}
