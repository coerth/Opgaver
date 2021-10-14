package com.company;

import java.util.Random;

public class D6 extends Terning{

    public D6(int maxEyesValue) {
        super(maxEyesValue);
    }

    @Override
    public void rollDie() {
        Random rand = new Random();
        super.setMaxEyesValue(rand.nextInt(1,7));
    }
}
