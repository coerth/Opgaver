package com.company.Dice;

import java.util.Random;

public class D10 extends Dice {

    public D10() {
        super.setMaxEyesValue(10);
        rollDie();
    }

    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setEyesValue(rand.nextInt(1,11));
    }

}
