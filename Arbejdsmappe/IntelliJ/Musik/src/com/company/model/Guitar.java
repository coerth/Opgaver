package com.company.model;

public class Guitar extends Mstring {
    @Override
    protected void play() {

    }


    @Override
    public void update(){
        super.update();
        System.out.println("Her er update-kode som er helt specielt for guitar");
    }
}
