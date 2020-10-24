package xyxy.bootclass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyxy.bootclass.mapper.ProjectRegMapper;
import xyxy.bootclass.model.ProjectReg;
import xyxy.bootclass.service.ProjectRegService;

import java.util.List;

/**
 * @program: Demo1
 * @description: 实验三工程注册
 * @author: 龙龙
 * @create: 2020-09-30 10:48
 **/
@Service
public class ProjectRegServiceImpl implements ProjectRegService {

    @Autowired
    private ProjectRegMapper projectRegMapper;

    @Override
    public boolean insertReg(ProjectReg projectReg) {
        return projectRegMapper.insertReg(projectReg.getProject_name(),projectReg.getSg_unit(),projectReg.getJs_unit(),projectReg.getJl_unit(),projectReg.getFile_path());
    }

    @Override
    public List<ProjectReg> findAll() {
        return projectRegMapper.findAll();
    }
}
