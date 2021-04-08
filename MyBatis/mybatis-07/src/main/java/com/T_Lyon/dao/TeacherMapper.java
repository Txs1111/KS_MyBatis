package com.T_Lyon.dao;

import com.T_Lyon.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacherByID(@Param("tid") int id);

    List<Teacher> getTeacherByID2(@Param("tid") int id);
}
