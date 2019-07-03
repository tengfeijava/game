package com.game.mapper;


import com.game.pojo.PastUser;
import org.springframework.stereotype.Repository;

@Repository
public interface PastMapper {

    void SaveAll(PastUser pastuser);
}
