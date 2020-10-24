package com.xyxy.boot.service;

import com.xyxy.boot.model.User;

import java.util.List;

public interface UserService {

    User login(String userNum,String userPsd);


    List<User> findAll();
}
