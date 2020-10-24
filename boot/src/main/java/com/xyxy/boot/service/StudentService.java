package com.xyxy.boot.service;

import com.xyxy.boot.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    int insert(Student student);
}
