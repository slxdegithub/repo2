package xyxy.bootclass.service;

import xyxy.bootclass.model.Register;

import java.util.List;

public interface RegisterService {

    List<Register> findAll();
    Boolean save(Register register);
    Boolean updateRegister(Register register);
    Integer delRegister(String stu_no);
    List<Register> searchName(String name);
    Register FindById(Integer id);

}
