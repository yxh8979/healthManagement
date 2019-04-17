package com.wenli.skill.pojo;

public class TbSysSleep {
    private Integer sleepid;

    private String username;

    private String starttime;

    private String endtime;

    private String quality;

    private String des;

    private String daycount;

    public Integer getSleepid() {
        return sleepid;
    }

    public void setSleepid(Integer sleepid) {
        this.sleepid = sleepid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getDaycount() {
        return daycount;
    }

    public void setDaycount(String daycount) {
        this.daycount = daycount == null ? null : daycount.trim();
    }
}