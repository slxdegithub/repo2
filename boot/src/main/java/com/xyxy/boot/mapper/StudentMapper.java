package com.xyxy.boot.mapper;

import com.xyxy.boot.model.Student;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface StudentMapper extends Mapper<Student> {
}
