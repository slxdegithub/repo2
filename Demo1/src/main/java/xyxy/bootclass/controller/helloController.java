package xyxy.bootclass.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import xyxy.bootclass.model.Student;
import xyxy.bootclass.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: Demo1
 * @description: hello
 * @author: 龙龙
 * @create: 2020-09-09 11:08
 **/
@Controller
public class helloController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/helloSpringboot")
    public ModelAndView helloWord(){
        ModelAndView model = new ModelAndView();
        model.setViewName("success");
        return model;
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }


    /**
    * @Description:
    * @Author: 龙龙
    * @Date:  2020/9/14 14:25
    */
    @RequestMapping("/test")
    @ResponseBody
    public String  test(){
        return "hello SpringMvc";
    }
    

    @RequestMapping("/findAll")
    public ModelAndView findAllStudent(){
        ModelAndView model = new ModelAndView();
        List<Student> all = studentService.findAll();
        model.addObject("allStudent",all);
        model.setViewName("info");

        return model;
    }

    @RequestMapping("/selectOne")
     public ModelAndView selectOne(String  stuNumber){
        ModelAndView model = new ModelAndView();
        Student studentById = studentService.findStudentById(stuNumber);
        model.addObject("studentBySelect",studentById);
        model.setViewName("select");
        return model;
    }

  /*  @RequestMapping("/deleteStudent")
    @ResponseBody
    public ModelAndView DeleteOne(String  stuNumber){
        ModelAndView model = new ModelAndView();
        Integer integer = studentService.deleteStudent(stuNumber);
        model.addObject("status",integer);
        model.setViewName("info");
        return model;
    }*/

    @RequestMapping("/deleteStudent")
    @ResponseBody
    public void deleteDictionary( HttpServletRequest request, HttpServletResponse response) throws IOException {
        String stuNumber = request.getParameter("stuNumber");
        Integer status = studentService.deleteStudent(stuNumber);
        JSONObject json=new JSONObject();
        json.put("status",status);
        response.getWriter().write(json.toString());
    }

    @RequestMapping("/addReg")
    public ModelAndView Reg(){
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        return model;
    }



}
