package com.T_Lyon.dao;

import com.T_Lyon.pojo.Teacher;
import com.T_Lyon.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestGetTeacher {
    @Test
    public void getTeacher() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherByID = mapper.getTeacherByID(1);
        for (Teacher teacher : teacherByID) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void getTeacher2() {
        SqlSession sqlSession = MyBatisUtils.get_sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherByID = mapper.getTeacherByID2(1);
        for (Teacher teacher : teacherByID) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
}
