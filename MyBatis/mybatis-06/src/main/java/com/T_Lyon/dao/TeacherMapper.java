package com.T_Lyon.dao;

import com.T_Lyon.pojo.Teacher;

public interface TeacherMapper {
    //    获取所有老师
    Teacher getTeacher();

    //    通过ID找到老师
    Teacher getTeacher2(int id);
}
