package com.game.mapper;


import com.game.pojo.GameUsre;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GameMapper {

    String Gamewechat(String gamewechat);

    void NameWechat(String gamewechat,int time, String username);


    void save(int time, String moneyone, String gamewechat);

    void Moneytwo(int time,String moneytwo,String gamewechat);

    void Moneythree(int time,String moneythree,String gamewechat);

    GameUsre FindaMewechat(String gamewechat);

    //void save(GameUsre gameUsre);

    List<GameUsre> FindAll();

    void DeleteAll();


}
