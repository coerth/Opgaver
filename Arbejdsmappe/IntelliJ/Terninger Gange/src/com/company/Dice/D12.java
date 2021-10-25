package com.company.Dice;

import java.util.Random;

public class D12 extends Dice {

    public D12() {
        super.setMaxEyesValue(12);
        super.calculateValue();
        rollDie();
    }

/*    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setEyesValue(rand.nextInt(1,13));
    }*/
}
