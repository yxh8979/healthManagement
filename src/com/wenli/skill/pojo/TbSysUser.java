package com.wenli.skill.pojo;

import java.util.Date;

public class TbSysUser {
    private String username;

    private String sex;

    private String age;

    private String height;

    private String weight;

    private String frequency;

    private String BMI;

    private String tzl;

    private String BMR;

    private String des;

    private Date createtime;

    private Date updatetime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getBMI() {
        return BMI;
    }

    public void setBMI(String BMI) {
        this.BMI = BMI == null ? null : BMI.trim();
    }

    public String getTzl() {
        return tzl;
    }

    public void setTzl(String tzl) {
        this.tzl = tzl == null ? null : tzl.trim();
    }

    public String getBMR() {
        return BMR;
    }

    public void setBMR(String BMR) {
        this.BMR = BMR == null ? null : BMR.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}