package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: test
 * @description: null
 * @author: 龙龙
 * @create: 2020-10-14 10:19
 **/
@Component
@ConfigurationProperties(prefix = "system-params")
public class Ftp {


    private String url;

    private  String file_path;

    private String ftp_server;

    private String ftp_port;

    private String ftp_user;

    private String ftp_password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFtp_server() {
        return ftp_server;
    }

    public void setFtp_server(String ftp_server) {
        this.ftp_server = ftp_server;
    }

    public String getFtp_port() {
        return ftp_port;
    }

    public void setFtp_port(String ftp_port) {
        this.ftp_port = ftp_port;
    }

    public String getFtp_user() {
        return ftp_user;
    }

    public void setFtp_user(String ftp_user) {
        this.ftp_user = ftp_user;
    }

    public String getFtp_password() {
        return ftp_password;
    }

    public void setFtp_password(String ftp_password) {
        this.ftp_password = ftp_password;
    }

    @Override
    public String toString() {
        return "Ftp{" +
                "url='" + url + '\'' +
                ", file_path='" + file_path + '\'' +
                ", ftp_server='" + ftp_server + '\'' +
                ", ftp_port='" + ftp_port + '\'' +
                ", ftp_user='" + ftp_user + '\'' +
                ", ftp_password='" + ftp_password + '\'' +
                '}';
    }
}
