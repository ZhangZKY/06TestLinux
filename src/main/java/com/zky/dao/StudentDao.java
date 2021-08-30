package com.zky.dao;

import com.zky.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStu();
    int insertStu(Student stu);
}
