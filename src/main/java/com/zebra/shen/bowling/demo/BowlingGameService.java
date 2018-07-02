package com.zebra.shen.bowling.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BowlingGameService {

    private Map<Long, BowlingGame> games = new HashMap<>();

    public BowlingGame createGame() {

        BowlingGame newGame = new BowlingGame();
        this.addGame(newGame);

        return newGame;
    }

    public void addGame(BowlingGame game){

        games.put(game.getGameID(), game);

    }

    public BowlingGame findGame(Long gameID){

        return games.get(gameID);

    }

}
