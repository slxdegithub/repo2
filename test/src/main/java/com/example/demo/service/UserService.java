package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    Integer save(User user);
    Integer delete(User user);
    Integer update(User user);
    Integer insertList(List<User> userList);
}
