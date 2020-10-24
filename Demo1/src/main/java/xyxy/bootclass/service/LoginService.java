package xyxy.bootclass.service;

import xyxy.bootclass.model.User;

public interface LoginService {


    User findByUserNumber(String userNumber);
}
