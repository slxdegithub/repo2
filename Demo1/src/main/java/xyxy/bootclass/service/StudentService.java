package xyxy.bootclass.service;

import org.apache.ibatis.annotations.Param;
import xyxy.bootclass.model.Student;

import java.util.List;

/**
 * @program: Demo1
 * @description: null
 * @author: 龙龙
 * @create: 2020-09-16 10:16
 **/
public interface StudentService {

    List<Student> findAll();

    Student findStudentById(String stuNumber);

    Integer insertStudent(String stu_no,  Integer age, String name);


    Integer deleteStudent(String stuNumber);

    Integer updateStudent(String stu_no, Integer age,String name);
}
