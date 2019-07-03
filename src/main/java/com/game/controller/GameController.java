package com.game.controller;

import com.game.pojo.GameUsre;

import com.game.service.GameService;
import com.game.utils.Result;
import com.game.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/gameuser")
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/nw",method = RequestMethod.POST)
    public Result namewechat(@RequestBody GameUsre gameUsre){
       gameService.NameWechat(gameUsre);
            return new  Result(true,StatusCode.OK,"登录成功");

    }


    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody GameUsre gameUsre){
        GameUsre save = gameService.save(gameUsre);
        if (save != null){
            return new Result(true,StatusCode.OK,"保存成功");
        }
        return new Result(false,StatusCode.ERROR,"失败");
    }



     @RequestMapping(value = "/search/{gamewechat}",method = RequestMethod.GET)
    public Result search(@PathVariable String gamewechat){
        GameUsre search = gameService.search(gamewechat);
        if (search != null){
            return new Result(true,StatusCode.OK,"查询成功",search);
        }
        return new Result(false,StatusCode.ERROR,"查询失败");
     }

    @RequestMapping(value = "/findall",method = RequestMethod.GET)
    public Result FinfAll(){
       List<GameUsre> list = gameService.FindAll();
       if (list != null){
           return new Result(true,StatusCode.OK,"成功",list);
       }
        return new Result(false,StatusCode.ERROR,"失败");
    }

}
