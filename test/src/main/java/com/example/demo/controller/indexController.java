package com.example.demo.controller;

import com.example.demo.model.Ftp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: test
 * @description: wu
 * @author: 龙龙
 * @create: 2020-09-28 15:31
 **/
@Controller
public class indexController {

    @Autowired
    private Ftp ftp;


    @RequestMapping("/index")
    public String  index(){
        System.out.println(ftp);
        return "success";
    }



     @RequestMapping("/login")
    public ModelAndView login(){
         ModelAndView model = new ModelAndView();
         System.out.println(ftp);

         model.addObject("ftps",ftp);
         model.setViewName("success");
         return model;
    }


}
