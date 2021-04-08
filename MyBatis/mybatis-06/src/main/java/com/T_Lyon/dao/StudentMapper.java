package com.T_Lyon.dao;

import com.T_Lyon.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //    查询所有学生
    List<Student> getStudent();

    //    按照结果查询学生与学生的老师
    List<Student> getStudent_Teacher();

    //按照查询嵌套查询
    List<Student> getStudent_Teacher2();

    List<Student> getStudent_Teacher3();
}
