package xyxy.bootclass.model;


/**
 * @Author: *****
 * @Date: 2020/9/23 9:27
 */
public class Register {
    private int id;
    private String name;
    private String sex;
    private String stu_no;
    private String description;
    private String hobbies;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStu_no() {
        return stu_no;
    }

    public void setStu_no(String stu_no) {
        this.stu_no = stu_no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", stuNo='" + stu_no + '\'' +
                ", description='" + description + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", age=" + age +
                '}';
    }
}
