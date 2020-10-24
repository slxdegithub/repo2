package com.example.demo.mapper;

import com.example.demo.model.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface UserMapper extends Mapper<User>, InsertListMapper<User> {
}
