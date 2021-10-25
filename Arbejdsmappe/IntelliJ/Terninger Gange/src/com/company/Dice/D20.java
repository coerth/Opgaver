package com.company.Dice;

import java.util.Random;

public class D20 extends Dice {
    public D20() {
        super.setMaxEyesValue(20);
        super.calculateValue();
        rollDie();
    }

/*    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setEyesValue(rand.nextInt(1,21));
    }*/
}
