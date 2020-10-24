package com.xyxy.boot.service.impl;

import com.xyxy.boot.mapper.StudentMapper;
import com.xyxy.boot.model.Student;
import com.xyxy.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: boot
 * @description: studentInfo
 * @author: 龙龙
 * @create: 2020-10-21 10:24
 **/
@Service
public class StudentServiceImpl implements StudentService {

        @Autowired
        private StudentMapper studentMapper;


    @Override
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }
}
