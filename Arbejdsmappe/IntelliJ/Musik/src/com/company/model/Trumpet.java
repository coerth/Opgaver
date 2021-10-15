package com.company.model;

public class Trumpet extends Wind{
    @Override
    protected void play() {

    }


    @Override
    public void update(){
        super.update();
        System.out.println("Her er update-kode som er helt specielt for trumpeter");
    }
}
