package xyxy.bootclass.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import xyxy.bootclass.model.User;

@Repository
public interface LoginMapper {

    @Select("select * from user where userNumber = #{userNumber}")
    User findByUserNumber(String userNumber);
}
