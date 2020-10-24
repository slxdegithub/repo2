package xyxy.bootclass.mapper;


import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import xyxy.bootclass.model.Register;

import java.util.List;

@Repository
public interface RegisterMapper {

    @Insert("insert into stu_register(name,age,stu_no,hobbies,description,sex) values (#{name},#{age},#{stu_no},#{hobbies},#{description},#{sex})")
    boolean save(@Param("name") String name, @Param("age")Integer age ,@Param("stu_no") String stu_no, @Param("hobbies")String hobbies,@Param("description") String description,@Param("sex") String sex);

    @Select("select * from stu_register")
    List<Register> findAll();

    @Delete("delete from stu_register where stu_no = #{stu_no}")
    Integer delRegister(String stu_no);

    @Select("select * from stu_register where name like #{name}")
    List<Register> searchName(String name);

    @Update("update  stu_register set name = #{name},age = #{age},stu_no =#{stu_no} ,hobbies = #{hobbies} ,description = #{description} , sex = #{sex} where id = #{id}")
    Boolean updateRegister(@Param("name") String name, @Param("age")Integer age ,@Param("stu_no") String stu_no, @Param("hobbies")String hobbies,@Param("description") String description,@Param("sex") String sex ,@Param("id") Integer id);

    @Select("select * from stu_register where id = #{id}")
    Register FindById(Integer id);
}
