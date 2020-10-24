package com.xyxy.boot.controller;

import com.xyxy.boot.model.Ftp;
import com.xyxy.boot.model.User;
import com.xyxy.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program: boot
 * @description: null
 * @author: 龙龙
 * @create: 2020-10-14 19:48
 **/

@Controller
public class helloController {

    @Autowired
    private Ftp ftp;

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public ModelAndView test(){
        ModelAndView model = new ModelAndView();
        System.out.println(ftp);
        model.addObject("ftps",ftp);
        model.setViewName("detail");
        return model;
    }
    @RequestMapping("/login")
    public ModelAndView login(String userNum,String userPsd){
        ModelAndView model = new ModelAndView();
        User user = userService.login(userNum, userPsd);

        if (user != null){
            model.addObject("user",user);
            model.setViewName("detail");
        }else {
            model.addObject("errorInfo","用户名或者密码错误");
            model.setViewName("index");
        }
        return model;
    }

    @RequestMapping("/test")
    public ModelAndView testDatabase(){
        ModelAndView model = new ModelAndView();
        List<User> all = userService.findAll();
        System.out.println(all.get(0));
        model.addObject("hello","hello");
        model.setViewName("index");
        return model;
    }




}
