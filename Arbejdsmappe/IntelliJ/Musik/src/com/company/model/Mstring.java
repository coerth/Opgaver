package com.company.model;

import com.company.model.Instrument;

abstract public class Mstring extends Instrument {

    @Override
    public void update(){
        super.update();
        System.out.println("view all string updates");
    }

    @Override
    public void tune() {
    }
}
