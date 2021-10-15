package com.company.Dice;

import java.util.Random;

public class D8 extends Dice {

    public D8() {
        super.setMaxEyesValue(8);
        rollDie();
    }

    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setEyesValue(rand.nextInt(1,9));
    }
}
