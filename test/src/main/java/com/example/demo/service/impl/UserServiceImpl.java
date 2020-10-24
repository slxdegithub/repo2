package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: test
 * @description: w
 * @author: 龙龙
 * @create: 2020-09-28 15:37
 **/
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public Integer save(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Integer delete(User user) {
        return userMapper.delete(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public Integer insertList(List<User> userList) {
        return userMapper.insertList(userList);
    }
}
