package xyxy.bootclass.service;

import xyxy.bootclass.model.ProjectReg;

import java.util.List;

public interface ProjectRegService {

    boolean insertReg(ProjectReg projectReg);

    List<ProjectReg> findAll();
}
