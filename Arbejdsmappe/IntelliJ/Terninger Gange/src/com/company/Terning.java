package com.company;

import java.util.Random;

public class Terning implements Roll {
    private int maxEyesValue;

    public Terning(int maxEyesValue) {
        this.maxEyesValue = maxEyesValue;
    }

    @Override
    public void rollDie() {
    }

    public int getMaxEyesValue() {
        return maxEyesValue;
    }

    public void setMaxEyesValue(int maxEyesValue) {
        this.maxEyesValue = maxEyesValue;
    }
}
