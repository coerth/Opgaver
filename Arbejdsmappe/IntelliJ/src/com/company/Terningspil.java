package com.company;

import java.util.Scanner;

public class Terningspil {
    private int rolledResult;
    Dice die1 = new Dice();
    Dice die2 = new Dice();
    int userInput;
    int tryCounter;

    public Terningspil(){
    }

    public void terningProdukt(){
        System.out.println("Hvilket produkt vil du have?");

            Scanner scan = new Scanner(System.in);
            userInput = scan.nextInt();
            if(userInput > 36){
                throw new ArithmeticException("Produktet er desværre over 36 som er maks");
            }
            else {

                rolledResult = die1.getEyeValue() * die2.getEyeValue();
                System.out.println(die1.getEyeValue() + " og " + die2.getEyeValue() + " = " + rolledResult);
                tryCounter++;

                while (rolledResult != userInput) {
                    die1.kast();
                    die2.kast();
                    rolledResult = die1.getEyeValue() * die2.getEyeValue();
                    System.out.println(die1.getEyeValue() + " og " + die2.getEyeValue() + " = " + rolledResult);
                    tryCounter++;
                }
                System.out.println("Så lykkedes det sgu efter " + tryCounter + " forsøg!");
            }
    }
}
