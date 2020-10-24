package xyxy.bootclass.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import xyxy.bootclass.model.ProjectReg;
import xyxy.bootclass.model.Register;

import java.util.List;

@Repository
public interface ProjectRegMapper{

    @Insert("insert into project(project_name,sg_unit,js_unit,jl_unit,file_path) values (#{project_name},#{sg_unit},#{js_unit},#{jl_unit},#{file_path})")
    boolean insertReg(@Param("project_name") String project_name, @Param("sg_unit")String sg_unit, @Param("js_unit")String js_unit, @Param("jl_unit")String jl_unit, @Param("file_path")String file_path);

    @Select("select * from project")
    List<ProjectReg> findAll();
}
