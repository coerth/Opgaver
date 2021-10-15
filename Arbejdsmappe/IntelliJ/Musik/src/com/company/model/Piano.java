package com.company.model;

public class Piano extends Mstring{
    @Override
    protected void play() {
    }

    @Override
    public void update(){
        super.update();
        System.out.println("Her er update-kode som er helt specielt for piano");
    }

    public String holdTone(){

        return "Holding the tune";
    }
}
