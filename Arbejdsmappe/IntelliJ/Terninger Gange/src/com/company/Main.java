package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DiceCup diceCup = new DiceCup();
        diceCup.addDiceToCup(new D6(6));
        diceCup.addDiceToCup(new D6(6));


        diceCup.rollDice();


        //System.out.println(diceCup.checkValidity(37));


    }


}
