package com.game.pojo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


public class GameUsre implements Serializable {
    private static final long serialVersionUID = 1L;


    private String gamewechat;  //微信号
    private String username; //姓名
    private int time;  //次数
    private String moneyone;
    private String moneytwo;
    private String moneythree;


    public String getMoneyone() {
        return moneyone;
    }

    public void setMoneyone(String moneyone) {
        this.moneyone = moneyone;
    }

    public String getMoneytwo() {
        return moneytwo;
    }

    public void setMoneytwo(String moneytwo) {
        this.moneytwo = moneytwo;
    }

    public String getMoneythree() {
        return moneythree;
    }

    public void setMoneythree(String moneythree) {
        this.moneythree = moneythree;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGamewechat() {
        return gamewechat;
    }

    public void setGamewechat(String gamewechat) {
        this.gamewechat = gamewechat;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameUsre usre = (GameUsre) o;
        return Objects.equals(gamewechat, usre.gamewechat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamewechat);
    }

    @Override
    public String toString() {
        return "GameUsre{" +
                "gamewechat='" + gamewechat + '\'' +
                ", username='" + username + '\'' +
                ", time=" + time +
                ", moneyone='" + moneyone + '\'' +
                ", moneytwo='" + moneytwo + '\'' +
                ", moneythree='" + moneythree + '\'' +
                '}';
    }
}
