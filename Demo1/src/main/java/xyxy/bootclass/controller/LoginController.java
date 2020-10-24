package xyxy.bootclass.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;
import xyxy.bootclass.model.User;
import xyxy.bootclass.service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: Demo1
 * @description: 登入的Controller
 * @author: 龙龙
 * @create: 2020-09-21 23:05
 **/

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/loginUser")
    public ModelAndView Login(String userNumber, String password){
        ModelAndView model = new ModelAndView();
//        System.out.println(userNumber);
//        System.out.println(password);
        User user = loginService.findByUserNumber(userNumber);
        if (user != null){
            if (password.equals(user.getPassword() )){
                model.addObject("user",user);
                model.setViewName("success");
                return model;
            }else {
                model.setViewName("loginfail");
                return model;
            }
        }else {
            model.setViewName("loginfail");
            return model;
        }

    }


    @RequestMapping("/loginJson")
    @ResponseBody
    public void LoginJson(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userNumber = request.getParameter("userNumber");
        String password = request.getParameter("password");

        JSONObject json = new JSONObject();
        if (userNumber != null && password != null){

            json.put("status",1);
            json.put("userNumber",userNumber);
            json.put("password",password);
        }else {
            json.put("status",0);
        }
        response.getWriter().write(json.toString());
    }


}
