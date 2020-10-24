package xyxy.bootclass.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import xyxy.bootclass.model.Student;

import java.util.List;

@Repository
public interface StudentMapper {

    @Select("select * from stu_info")
     List<Student> findAll();

    @Select("select * from stu_info where stu_no = #{stuNumber}")
    Student findStudentById(String  stuNumber);

    @Insert("insert into stu_info(age,name) values(#{age},#{name)")
    Integer insertStudent(@Param("stu_no")String stu_no,@Param("age") Integer age,@Param("name") String name);


    @Delete("delete from stu_info where stu_no = #{stuNumber}")
    Integer deleteStudent(String stuNumber);

    @Update("update ")
    Integer updateStudent(@Param("stu_no")String stu_no,@Param("age") Integer age,@Param("name") String name);
}
