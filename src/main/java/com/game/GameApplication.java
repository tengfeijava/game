package com.game;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.game.mapper")
public class GameApplication {

    private static Logger logger = LoggerFactory.getLogger(GameApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(GameApplication.class, args);
    }
}
