package com.xyxy.boot.service.impl;

import com.xyxy.boot.mapper.UserMapper;
import com.xyxy.boot.model.User;
import com.xyxy.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.index.PathBasedRedisIndexDefinition;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: boot
 * @description: user
 * @author: 龙龙
 * @create: 2020-10-14 20:38
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userNum, String userPsd) {
        return userMapper.findByLogin(userNum,userPsd);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }


}
