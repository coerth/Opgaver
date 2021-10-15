package com.company.model;

abstract public class Instrument {
    String name;
    //ArrayList<>

    abstract protected void play();
    abstract protected void tune();

    public void update(){
        System.out.println("connect to database");
    }


}
