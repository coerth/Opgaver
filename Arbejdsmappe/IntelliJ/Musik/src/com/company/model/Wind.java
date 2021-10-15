package com.company.model;

import com.company.model.Instrument;

abstract public class Wind extends Instrument {

    @Override
    public void update(){
        super.update();
        System.out.println("view all wind updates");
    }

    //abstract public void play();

    @Override
    public void tune() {
    }
}
