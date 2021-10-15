package com.company.Dice;

public class Dice implements Roll {
    private int maxEyesValue;
    private int eyesValue;

//    public Terning() {
//    }

    @Override
    public void rollDie() {
    }

    public int getMaxEyesValue() {
        return maxEyesValue;
    }

    public int getEyesValue() {
        return eyesValue;
    }

    public void setMaxEyesValue(int maxEyesValue) {
        this.maxEyesValue = maxEyesValue;
    }

    public void setEyesValue(int eyesValue) {
        this.eyesValue = eyesValue;
    }
}
