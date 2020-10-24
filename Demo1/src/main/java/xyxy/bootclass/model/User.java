package xyxy.bootclass.model;

/**
 * @program: Demo1
 * @description: 用户登入
 * @author: 龙龙
 * @create: 2020-09-21 22:53
 **/
public class User {

    private String userNumber;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}
