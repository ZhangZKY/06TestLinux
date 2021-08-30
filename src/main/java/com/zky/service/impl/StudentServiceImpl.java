package com.zky.service.impl;

import com.zky.dao.StudentDao;
import com.zky.entity.Student;
import com.zky.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public StudentServiceImpl() {
    }
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public String toString() {
        return "StudentServiceImpl{" +
                "studentDao=" + studentDao +
                '}';
    }

    @Override
    public List<Student> selectAllStu() {
        List<Student> stuList = studentDao.selectAllStu();
        return stuList;
    }

    @Override
    public int insertStu(Student stu) {
        int result = studentDao.insertStu(stu);
        return result;
    }
}
