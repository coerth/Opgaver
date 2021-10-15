package com.company.model;

public class Drum extends Percussion {


    @Override
    public void play() {
    }

    @Override
    public void update(){
        super.update();
        System.out.println("Her er update-kode som er helt specielt for trommer");
    }

    public void changeStick(){

        System.out.println("changing the sticks!");
    }
}
