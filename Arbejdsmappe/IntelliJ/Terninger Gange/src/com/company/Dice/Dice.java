package com.company.Dice;

import java.util.ArrayList;

public class Dice implements Roll {
    private int maxEyesValue;
    private int eyesValue;
    private ArrayList<Integer> possibleValues = new ArrayList<>();

//    public Terning() {
//    }

    @Override
    public void rollDie() {
    }

    public void calculateValue(){
        int value = 1;
        for(int i = 0; i < maxEyesValue; i++){
            setPossibleValues(value+i);
        }
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

    public ArrayList<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(int values) {
        this.possibleValues.add(values);
    }
}
