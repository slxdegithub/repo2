package com.xyxy.boot.model;

import javax.persistence.Table;

/**
 * @program: boot
 * @description: studentInfo
 * @author: 龙龙
 * @create: 2020-10-21 10:19
 **/
@Table(name = "stu_info")
public class Student {

        private String stuNumber;
        private String stuName;
        private Integer stuSex;
        private Integer stuAge;
        private Integer stuEduyear;
        private String  stuMajor;
        private String stuClass;

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuEduyear() {
        return stuEduyear;
    }

    public void setStuEduyear(Integer stuEduyear) {
        this.stuEduyear = stuEduyear;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNumber='" + stuNumber + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex=" + stuSex +
                ", stuAge=" + stuAge +
                ", stuEduyear=" + stuEduyear +
                ", stuMajor='" + stuMajor + '\'' +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }
}
