package com.zebra.shen.bowling.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
public class GameRestService {

    @Autowired
    private BowlingGameService bowlingGameService;

    @RequestMapping(value = "/helloworld")
    public String HelloWorld(){

        return "hello world!";
    }

    @RequestMapping(value = "/bowling")
    public BowlingGame createGame(){

        return bowlingGameService.createGame();
    }

    @RequestMapping(value = "/adduser/{gameID}/{bowler}")
    @ResponseBody
    public Set<Bowler> addUser(@PathVariable Long gameID, @PathVariable String bowler){

        Bowler newBowler = new Bowler();
        newBowler.setName(bowler);
        BowlingGame game = bowlingGameService.findGame(gameID);
        game.addBowler(newBowler);

        return game.getBowlers();
    }

    @RequestMapping(value = "/addframe/{gameID}/{bowler}")
    public Long addFrame(@PathVariable Long gameID, @PathVariable String bowler){

        Frame newFrame = new Frame();
        newFrame.setFrameID(System.currentTimeMillis());
        BowlingGame game = bowlingGameService.findGame(gameID);
        game.addFrame(game.findBowler(bowler), newFrame);

        return newFrame.getFrameID();


    }


}
