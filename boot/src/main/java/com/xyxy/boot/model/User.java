package com.xyxy.boot.model;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: boot
 * @description: userInfo
 * @author: 龙龙
 * @create: 2020-10-14 20:29
 **/
@Table(name = "user")
public class User implements Serializable {

    private String userName;
    private String userNum;
    private String userPsd;
    private String userPhone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
