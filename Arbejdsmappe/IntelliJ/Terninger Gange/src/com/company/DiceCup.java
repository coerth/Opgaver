package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceCup {
    ArrayList<Terning> diceInDiceCup = new ArrayList<>();

    public void rollDice(){
        int userInput;
        Scanner scan = new Scanner(System.in);
        int rolledValue = 0;


       try {
           System.out.println("Hvad vil du slå?");
           userInput = scan.nextInt();
           checkValidity(userInput);


       }catch (ArithmeticException e){
           System.out.println();
           System.out.println("Hvad vil du slå?");
           userInput = scan.nextInt();
           checkValidity(userInput);
       }

       while(userInput != rolledValue){
           for(Roll r : diceInDiceCup){
               r.rollDie();
           }
           rolledValue = diceInDiceCup.get(0).getMaxEyesValue() * diceInDiceCup.get(1).getMaxEyesValue();
           System.out.println(rolledValue);
       }
    }

    public boolean checkValidity(int userInput) throws ArithmeticException{
        ArrayList<Integer> acceptabelValues = acceptedValues();
        boolean check = false;
        check = acceptabelValues.contains(userInput);

        if(!check){
            throw new ArithmeticException("Din værdi faldt uden for parametrene");
        }

       return check;
    }


    public  ArrayList<Integer> acceptedValues() {
        ArrayList<Integer> acceptabelValues = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                sum = i * j;
                //System.out.println(sum);
                acceptabelValues.add(sum);
            }
        }
        return acceptabelValues;
    }

    public void addDiceToCup(Terning dye){
        diceInDiceCup.add(dye);
    }
}
