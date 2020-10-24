package com.xyxy.ll.conrtoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: ll
 * @description: test
 * @author: 龙龙
 * @create: 2020-10-14 11:33
 **/
@Controller
public class helloController {

    @RequestMapping("/hello")
    public String hello(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return "index";
    }
}
