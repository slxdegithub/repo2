package xyxy.bootclass.service.impl;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyxy.bootclass.mapper.RegisterMapper;
import xyxy.bootclass.model.Register;
import xyxy.bootclass.service.RegisterService;

import java.util.List;

/**
 * @program: Demo1
 * @description: aa
 * @author: 龙龙
 * @create: 2020-09-23 10:49
 **/
@Service
public class RegisterImpl implements RegisterService {

    @Autowired
     private  RegisterMapper registerMapper;

    @Override
    public List<Register> findAll() {
        return registerMapper.findAll();
    }

    @Override
    public Boolean save(Register register) {


        return registerMapper.save(register.getName(),register.getAge(),register.getStu_no(),register.getHobbies(),register.getDescription(),register.getSex());
    }

    @Override
    public Boolean updateRegister(Register register) {
        return registerMapper.updateRegister(register.getName(),register.getAge(),register.getStu_no(),register.getHobbies(),register.getDescription(),register.getSex(),register.getId());
    }

    @Override
    public Integer delRegister(String stu_no) {
        return registerMapper.delRegister(stu_no);
    }

    @Override
    public List<Register> searchName(String name) {
        name = "%" + name + "%" ;
        return registerMapper.searchName(name);
    }

    @Override
    public Register FindById(Integer id) {
        return registerMapper.FindById(id);
    }
}
