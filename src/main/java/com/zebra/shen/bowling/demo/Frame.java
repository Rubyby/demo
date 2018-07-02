package com.zebra.shen.bowling.demo;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private List<Integer> rolls = new ArrayList<>();
    private Long frameID;

    public Long getFrameID() {
        return frameID;
    }

    public void setFrameID(Long frameID) {
        this.frameID = frameID;
    }

    public List<Integer> addRoll(int roll){

        rolls.add(roll);
        return rolls;

    }

    public List<Integer> getRolls() {
        return rolls;
    }

    public void setRolls(List<Integer> rolls) {
        this.rolls = rolls;
    }

}
