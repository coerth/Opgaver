package com.company;

import java.util.Random;

public class Dice {
    private int eyeValue;

    public Dice() {
        kast();
    }

    public void kast(){
        Random rand = new Random();
        this.eyeValue = rand.nextInt(1,7);
    }

    public int getEyeValue() {
        return eyeValue;
    }
}
