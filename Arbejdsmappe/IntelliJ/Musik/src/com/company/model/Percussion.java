package com.company.model;

import com.company.model.Instrument;

abstract public class Percussion extends Instrument {

    //abstract public void play();

    @Override
    public void tune() {
    }

    @Override
    public void update(){
        super.update();
        System.out.println("view all percussion updates");
    }

}
