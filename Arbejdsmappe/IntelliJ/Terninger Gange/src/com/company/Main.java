package com.company;

import com.company.Dice.Dice;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DiceCup diceCup = new DiceCup();

        diceCup.chooseDice();
        diceCup.rollDice();
    }


}
