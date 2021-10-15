package com.company.Dice;

import java.util.Random;

public class D4 extends Terning{

    public D4() {
        super.setMaxEyesValue(4);
        rollDie();
    }

    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setEyesValue(rand.nextInt(1,5));
    }
}
