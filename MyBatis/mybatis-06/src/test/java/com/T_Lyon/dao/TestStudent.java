package com.T_Lyon.dao;

import com.T_Lyon.pojo.Student;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudent {

    @Test
    public void getStudent_Teacher2() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student_teacher = mapper.getStudent_Teacher2();
        for (Student student : student_teacher) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent_Teacher() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student_teacher = mapper.getStudent_Teacher();
        for (Student student : student_teacher) {
            System.out.println(student);
        }
        sqlSession.close();
    }


    @Test
    public void getStudent_Teacher3() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student_teacher = mapper.getStudent_Teacher3();
        for (Student student : student_teacher) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
