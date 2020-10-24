package xyxy.bootclass.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.commons.logging.LogFactory;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xyxy.bootclass.model.Register;
import xyxy.bootclass.model.Student;
import xyxy.bootclass.service.RegisterService;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * @program: Demo1
 * @description: 注册controller
 * @author: 龙龙
 * @create: 2020-09-23 10:41
 **/
@Controller
public class RegisgerController {

    @Autowired
    private RegisterService registerService;

    /**
    * @Description: 查询所有学生注册信息
    * @Author: 龙龙
    * @Date:  2020/9/24 20:00
    */
    @RequestMapping("/allRegister")
    public ModelAndView findAll(){
        ModelAndView model = new ModelAndView();
        List<Register> registerList = registerService.findAll();
        System.out.println(registerList.get(0).toString());
        model.addObject("registerList",registerList);
        model.setViewName("list");
        return model;

    }

    /**
    * @Description: 添加一个
    * @Author: 龙龙
    * @Date:  2020/9/24 20:00
    */
    @RequestMapping("/addRegister")
    public String input(Register register){
        Boolean save = registerService.save(register);
        if (save){
            return "redirect:/allRegister";
        }else {
            return "/addRegister";
        }
    }

    /**
    * @Description: 跳转到添加
    * @Author: 龙龙
    * @Date:  2020/9/24 20:00
    */
    @RequestMapping("/add")
    public ModelAndView add(){
        ModelAndView model = new ModelAndView();

        model.setViewName("addRegister");
        return model;
    }

    /**
    * @Description: 删除
    * @Author: 龙龙
    * @Date:  2020/9/24 20:00
    */
    @RequestMapping("/delRegister")
    @ResponseBody
    public void deleteDictionary(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String stu_no = request.getParameter("stu_no");
        Integer status = registerService.delRegister(stu_no);
        JSONObject json=new JSONObject();
        json.put("status",status);
        response.getWriter().write(json.toString());
    }

    /**
     * 根据名称模糊查询
     */
    @RequestMapping("/searchName")
    public ModelAndView searchName(String name){
        ModelAndView model = new ModelAndView();

        List<Register> registers = registerService.searchName(name);
        model.addObject("registerList",registers);
        model.addObject("searchName",name);
        System.out.println(name);
        model.setViewName("list");
        return model;
    }

    /**
    * @Description: 更新
    * @Author: 龙龙
    * @Date:  2020/9/24 20:32
    */

    @RequestMapping("/updateRegister")
    public ModelAndView UpdateRegister(Register register){
        ModelAndView model = new ModelAndView();

//        Register register = registerService.FindById(id);
        Boolean aBoolean = registerService.updateRegister(register);
        if (aBoolean){
            model.setViewName("list");
        }else {
            model.setViewName("update");
        }
        return model;
    }


    @RequestMapping("/findUpdateRegister")
    public ModelAndView findUpdateRegister(Integer id){
    ModelAndView model = new ModelAndView();
        Register register = registerService.FindById(id);
        model.addObject("register",register);

        model.setViewName("update");
        return model;
    }





}
