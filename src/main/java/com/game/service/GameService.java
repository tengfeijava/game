package com.game.service;

import com.game.mapper.GameMapper;


import com.game.pojo.GameUsre;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class GameService {




    @Resource
    private GameMapper gameMapper;



    public GameUsre NameWechat(GameUsre gameUsre) {
        String  byGamewechat = gameMapper.Gamewechat(gameUsre.getGamewechat());
        if (byGamewechat==null){
            gameUsre.setTime(0);
            gameMapper.NameWechat(gameUsre.getGamewechat(),gameUsre.getTime(),gameUsre.getUsername());
        }
        return gameMapper.FindaMewechat(gameUsre.getGamewechat());
    }

    public GameUsre save(GameUsre gameUsre) {
       // String gamewechat = gameUsre.getGamewechat();
        GameUsre byGamewechat = gameMapper.FindaMewechat(gameUsre.getGamewechat());
        System.out.println(byGamewechat);
        System.out.println();
        if (byGamewechat.getGamewechat() != null && byGamewechat.getMoneyone() == null){
            gameUsre.setTime(1);
              gameMapper.save(gameUsre.getTime(),gameUsre.getMoneyone(),gameUsre.getGamewechat());
              return  gameMapper.FindaMewechat(gameUsre.getGamewechat());
        }else
            if (byGamewechat.getTime() == 1){
            gameUsre.setTime(2);
            gameUsre.setMoneytwo(gameUsre.getMoneyone());
                gameMapper.Moneytwo(gameUsre.getTime(),gameUsre.getMoneytwo(),byGamewechat.getGamewechat());
        }else
            if (byGamewechat.getTime() == 2){
            gameUsre.setTime(3);
            gameUsre.setMoneythree(gameUsre.getMoneyone());
                gameMapper.Moneythree(gameUsre.getTime(),gameUsre.getMoneythree(),byGamewechat.getGamewechat());
        }else if (byGamewechat.getTime() <= 3){
            return null;
        }
        return byGamewechat;
    }



    public GameUsre search(String gamewechat) {
        return gameMapper.FindaMewechat(gamewechat);
    }


    public List<GameUsre> FindAll() {
       return gameMapper.FindAll();
    }



}


