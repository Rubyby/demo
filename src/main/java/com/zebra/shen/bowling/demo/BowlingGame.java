package com.zebra.shen.bowling.demo;


import java.util.*;

public class BowlingGame {

    private Map<Bowler, List<Frame>> bowlerFrames = new HashMap<Bowler, List<Frame>>();
    private Long gameID;

    public BowlingGame() {
        this.gameID = System.currentTimeMillis();

    }


    public void addBowler(Bowler bowler){

        bowlerFrames.put(bowler, new ArrayList<>());

    }

    public void addFrame(Bowler bowler, Frame frame){

        List<Frame> frames = bowlerFrames.get(bowler);
        frames.add(frame);

    }

    public Bowler findBowler(String bowler){
        Iterator iterator = getBowlers().iterator();
        Bowler tmpBowler = null;
        while (iterator.hasNext()){
            Bowler tmp = (Bowler) iterator.next();
            if (tmp.getName().equals(bowler)){
                tmpBowler = tmp;
            }
        }

        return tmpBowler;

    }

    public Set<Bowler> getBowlers(){
        return bowlerFrames.keySet();
    }

    public Map<Bowler, List<Frame>> getBowlerFrames() {
        return bowlerFrames;
    }

    public Long getGameID() {
        return gameID;
    }

    public void setGameID(Long gameID) {
        this.gameID = gameID;
    }

    public void setBowlerFrames(Map<Bowler, List<Frame>> bowlerFrames) {
        this.bowlerFrames = bowlerFrames;
    }


}
