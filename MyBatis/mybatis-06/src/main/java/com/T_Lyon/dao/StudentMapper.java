package com.T_Lyon.dao;

import com.T_Lyon.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //    ��ѯ����ѧ��
    List<Student> getStudent();

    //    ���ս����ѯѧ����ѧ������ʦ
    List<Student> getStudent_Teacher();

    //���ղ�ѯǶ�ײ�ѯ
    List<Student> getStudent_Teacher2();

    List<Student> getStudent_Teacher3();
}
