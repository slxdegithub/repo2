package xyxy.bootclass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyxy.bootclass.mapper.StudentMapper;
import xyxy.bootclass.model.Student;
import xyxy.bootclass.service.StudentService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

/**
 * @program: Demo1
 * @description: null
 * @author: 龙龙
 * @create: 2020-09-16 10:16
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findStudentById(String  stuNumber) {
        return studentMapper.findStudentById(stuNumber);
    }

    @Override
    public Integer insertStudent(String stu_no, Integer age, String name) {
        return studentMapper.insertStudent(stu_no,age,name);
    }

    @Override
    public Integer deleteStudent(String stuNumber) {
        return studentMapper.deleteStudent(stuNumber);
    }

    @Override
    public Integer updateStudent(String stu_no, Integer age, String name) {
        return studentMapper.updateStudent(stu_no,age,name);
    }


}
