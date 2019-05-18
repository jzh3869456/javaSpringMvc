package com.jzh.kaoshi.entity;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class UserInfo {

    private String id;
    private String name;
    private String password;
    private int age;
    private int sex;
    private String creaDate;

    public UserInfo() {
    }

    public UserInfo(String id, String name, String password, int age, int sex, String creaDate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.creaDate = creaDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCreaDate() {
        return creaDate;
    }

    public void setCreaDate(Timestamp creaDate) {
        String str = "";
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        str = sdf.format(creaDate);
        this.creaDate = str;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", creaDate='" + creaDate + '\'' +
                '}';
    }
}
