package com.game.pojo;



import javax.xml.crypto.Data;
import java.util.Date;


public class PastUser {

    private static final long serialVersionUID = 1L;
    private int id;
    private String gamewechat;  //微信号
    private String username; //姓名
    private String one;
    private String two;
    private String three;
    private int time;
    private String date; //时间


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGamewechat() {
        return gamewechat;
    }

    public void setGamewechat(String gamewechat) {
        this.gamewechat = gamewechat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PastUser{" +
                "id=" + id +
                ", gamewechat='" + gamewechat + '\'' +
                ", username='" + username + '\'' +
                ", one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", three='" + three + '\'' +
                ", time=" + time +
                ", date='" + date + '\'' +
                '}';
    }
}
