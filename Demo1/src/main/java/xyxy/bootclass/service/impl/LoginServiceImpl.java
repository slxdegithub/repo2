package xyxy.bootclass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyxy.bootclass.mapper.LoginMapper;
import xyxy.bootclass.model.User;
import xyxy.bootclass.service.LoginService;

/**
 * @program: Demo1
 * @description: 登录
 * @author: 龙龙
 * @create: 2020-09-21 23:04
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User findByUserNumber(String userNumber) {
        return loginMapper.findByUserNumber(userNumber);
    }
}
