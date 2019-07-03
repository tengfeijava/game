package com.game.scheduler;

import com.game.mapper.GameMapper;
import com.game.mapper.PastMapper;
import com.game.pojo.GameUsre;
import com.game.pojo.PastUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Scheduler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GameMapper gameMapper;
    @Autowired
    private PastMapper pastMapper;



    @Scheduled(cron="0 00 09 ? * *") //每分钟执行一次fixedRate=20000
    public void statusCheck() {
        logger.info("每天九点更新数据库。开始……");
        List<GameUsre> all = gameMapper.FindAll();
        List<PastUser> list = new ArrayList<>();
        PastUser past = new PastUser();
        for (GameUsre usre : all) {
            System.err.println(usre);

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String strdate = format.format(new Date());
        past.setUsername(usre.getUsername());
        past.setGamewechat(usre.getGamewechat());
        past.setOne(usre.getMoneyone());
        past.setTwo(usre.getMoneytwo());
        past.setThree(usre.getMoneythree());
        past.setTime(usre.getTime());
        past.setDate(strdate);
         pastMapper.SaveAll(past);
        }

        gameMapper.DeleteAll();


        //statusTask.healthCheck();
        logger.info("每天九点更新数据库。结束……");
    }

//    @Scheduled(cron="0 0/1 * * * ?")
//    public void testTasks() {
//        logger.info("每分钟更新数据库。开始……");
//        List<GameUsre> all = gameMapper.FindAll();
//        List<PastUser> list = new ArrayList<>();
//        PastUser past = new PastUser();
//        for (GameUsre usre : all) {
//            System.err.println(usre);
//
//            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String strdate = format.format(new Date());
//            past.setUsername(usre.getUsername());
//            past.setGamewechat(usre.getGamewechat());
//            past.setOne(usre.getMoneyone());
//            past.setTwo(usre.getMoneytwo());
//            past.setThree(usre.getMoneythree());
//            past.setTime(usre.getTime());
//            past.setDate(strdate);
//            pastMapper.SaveAll(past);
//        }
//
//        gameMapper.DeleteAll();
//
//
//        //statusTask.healthCheck();
//        logger.info("每分钟更新数据库。结束……");
//    }
}

