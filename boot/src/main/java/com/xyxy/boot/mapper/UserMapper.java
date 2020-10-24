package com.xyxy.boot.mapper;


import com.xyxy.boot.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<User> {

    @Select("select * from user")
    List<User> selectAll();

    @Select(("select * from user where userNum = #{userNum} and userPsd = #{userPsd}"))
    User findByLogin(@Param("userNum") String userNum , @Param("userPsd") String  userPsd);

}
