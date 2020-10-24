package com.xyxy.boot.controller;

import com.xyxy.boot.model.Student;
import com.xyxy.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: boot
 * @description: student
 * @author: 龙龙
 * @create: 2020-10-21 10:26
 **/
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView model = new ModelAndView();
        List<Student> studentList = studentService.findAll();
        System.out.println(studentList);
        model.addObject("studentList",studentList);
        model.setViewName("result");
        return model;
    }

    @RequestMapping("/insert")
    public ModelAndView insert(Student student){
        ModelAndView model = new ModelAndView();

        System.out.println(student);
        int insert = studentService.insert(student);
        if (insert == 1){
         model=   this.findAll();
        }else {
            model.setViewName("index");
        }
        return model;
    }
}
