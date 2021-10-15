package com.company.Dice;

import java.util.Random;

public class D6 extends Dice {

    public D6() {
        super.setMaxEyesValue(6);
        rollDie();
    }

    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setEyesValue(rand.nextInt(1,7));
    }
}
