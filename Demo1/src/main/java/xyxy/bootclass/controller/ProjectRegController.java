package xyxy.bootclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import xyxy.bootclass.model.ProjectReg;
import xyxy.bootclass.service.ProjectRegService;

import java.io.File;
import java.util.List;

/**
 * @program: Demo1
 * @description: 实验三工程注册文件上传
 * @author: 龙龙
 * @create: 2020-09-30 10:50
 **/
@Controller
public class ProjectRegController {

    @Autowired
    private ProjectRegService projectRegService;

    /**
     * @Description: 实验三的工程注册
     * @Author: 龙龙
     * @Date:  2020/9/30 10:36
     */
    @RequestMapping("/submitRegister")
    public ModelAndView subReg(@ModelAttribute ProjectReg projectReg){
        ModelAndView model = new ModelAndView();
        String realpath="d:\\uploadfiles";
        File targetDir=new File(realpath);
        if(!targetDir.exists()){        //创建文件夹
            targetDir.mkdirs();
        }
//        System.out.println(projectReg);
//        MultipartFile file=projectReg.getProjectFile();
//        String fileName=file.getOriginalFilename();
//        File targetFile=new File(realpath,fileName);
//        try{
//            file.transferTo(targetFile);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        projectReg.setFile_path(realpath+projectReg.getFile_path());
        boolean inserts = projectRegService.insertReg(projectReg);
        if (inserts){
             model = this.allReg();
            return model;
        }else {
            model.setViewName("register");
            return model;

        }
    }

    @RequestMapping("/allReg")
    public ModelAndView allReg(){
        ModelAndView model = new ModelAndView();
        List<ProjectReg> all = projectRegService.findAll();
        model.addObject("allReg",all);
        model.setViewName("allReg");
        return model;
    }

    @RequestMapping("toAddReg")
    public String toAddReg(){
        return "register";
    }
}
