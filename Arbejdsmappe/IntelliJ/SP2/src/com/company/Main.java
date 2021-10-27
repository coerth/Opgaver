package com.company;

public class Main {

    public static void main(String[] args) {

        Bil bil = new BenzinBil("An28225", "VW", "UP", 2014, 4,95,22);
        Bil bil2 = new ElBil("gh23643","Tesla", "S", 2020, 4,100,600,200);
        Bil bil3 = new DieselBil("SD23456", "Peugeot", "3008", 1996,5, false,12);
        Garage garage = new Garage("BilPark");

        garage.setBilArrayList(bil);
        garage.setBilArrayList(bil2);
        garage.setBilArrayList(bil3);

        System.out.println(garage.beregnGrønAfgiftForBilPark());

        System.out.println(garage);

        for(Bil b : garage.getBilArrayList()){
            System.out.println(b);
        }

//        System.out.println(bil.beregnGrønEjerAfgift());
//        System.out.println(bil2.beregnGrønEjerAfgift());
//        System.out.println(bil3.beregnGrønEjerAfgift());
    }
}
