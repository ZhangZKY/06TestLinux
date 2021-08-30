package com.zky.controller;

import com.zky.entity.Student;
import com.zky.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StuController {
    @Autowired
    private StudentService stuService;

    public StuController() {
    }
    public StuController(StudentService stuService) {
        this.stuService = stuService;
    }

    public StudentService getStuService() {
        return stuService;
    }
    public void setStuService(StudentService stuService) {
        this.stuService = stuService;
    }

    @RequestMapping(value = "/insertStudent")
    public ModelAndView selectAllStu(Student student){
        ModelAndView mv = new ModelAndView();

        int count = stuService.insertStu(student);

        String result = (count == 1? "学生信息注册成功！":"学生信息注册失败！");

        mv.addObject("result", result);

        mv.setViewName("/static/jsp/result.jsp");

        return mv;

    }
}
