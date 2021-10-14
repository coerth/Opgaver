package com.company;

import com.company.Dice.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DiceCup {
    Terning[] diceInDiceCup = new Terning[2];

    public void rollDice(){
        int userInput = 1;
        Scanner scan = new Scanner(System.in);
        int rolledValue = 0;
        int amountOfTries = 0;

       try {
           System.out.println("Hvad vil du slå?");
           userInput = scan.nextInt();
           checkValidity(userInput);

       }catch (ArithmeticException e){
           System.out.println("Det faldt ud over parametrene");
           rollDice();
       }

       while(userInput != rolledValue){

           rolledValue = diceInDiceCup[0].getEyesValue() * diceInDiceCup[1].getEyesValue();
           System.out.println(rolledValue);
           for(Roll r : diceInDiceCup){
               r.rollDie();
           }
           amountOfTries++;
       }
        System.out.println("Så mange forsøg tog det: " + amountOfTries);
    }

    public boolean checkValidity(int userInput) throws ArithmeticException{
        //ArrayList<Integer> acceptedValues = acceptedValues();
        boolean check = false;
        //check = acceptedValues.contains(userInput);
        check = acceptedValues(diceInDiceCup).contains(userInput);

        if(!check){
            throw new ArithmeticException("Din værdi faldt uden for parametrene");
        }

       return check;
    }

    public  ArrayList<Integer> acceptedValues(Terning[] diceInDiceCup) {
        ArrayList<Integer> acceptabelValues = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < diceInDiceCup[0].getMaxEyesValue()+1; i++) {
            for (int j = 1; j < diceInDiceCup[1].getMaxEyesValue()+1; j++) {
                sum = i * j;
                //System.out.println(sum);
                acceptabelValues.add(sum);
            }
        }
        return acceptabelValues;
    }

    public void chooseDice(){
       Scanner scan;
       String userInput;

       scan = new Scanner(System.in);
        System.out.println("Du skal vælge to terninger, hvilken terning skal den første være?");
        System.out.println("D4, D6, D8, D12, D20?");
       userInput = scan.nextLine().toUpperCase(Locale.ROOT).trim();
        addDiceToCup(userInput,0);

        System.out.println("Hvilken terning skal den anden være?");
        System.out.println("D4, D6, D8, D12, D20?");
        userInput = scan.nextLine().toUpperCase(Locale.ROOT).trim();

        addDiceToCup(userInput,1);

       }

       private void addDiceToCup(String userInput, int arrayElement) {
           switch (userInput) {
               case "D4":
                   diceInDiceCup[arrayElement] = new D4();
                   break;

               case "D6":
                   diceInDiceCup[arrayElement] = new D6();
                   break;

               case "D8":
                   diceInDiceCup[arrayElement] = new D8();
                   break;

               case "D12":
                   diceInDiceCup[arrayElement] = new D12();
                   break;

               case "D20":
                   diceInDiceCup[arrayElement] = new D20();
                   break;
           }
       }
}
