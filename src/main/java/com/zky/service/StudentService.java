package com.zky.service;

import com.zky.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectAllStu();
    int insertStu(Student stu);
}
