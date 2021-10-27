package com.company;

import com.company.Dice.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DiceCup {
    ArrayList<Dice> diceInDiceCup = new ArrayList<>();

    //metode til at rulle terningerne og få brugerens tal som skal rammes.
    public void rollDice(){
        int input = 0;
        Scanner scan = new Scanner(System.in);
        int rolledValue = 1;
        int amountOfTries = 0;

       try {
           //System.out.println("Hvad vil du slå?");
           input = Integer.parseInt(userInput("Hvad vil du slå?"));
           //input = scan.nextInt();
           checkValidity(input);

       }catch (ArithmeticException e){
           System.out.println("Det faldt ud over parametrene");
           rollDice();
       }

       while(input != rolledValue){
           rolledValue = 1;

           for(Dice d : diceInDiceCup){
               rolledValue = rolledValue * d.getEyesValue();
           }
           //rolledValue = diceInDiceCup.get(0).getEyesValue() * diceInDiceCup.get(1).getEyesValue();
           System.out.println(rolledValue);
           for(Roll r : diceInDiceCup){
               r.rollDie();
           }
           amountOfTries++;
       }
        System.out.println("Så mange forsøg tog det: " + amountOfTries);
       endOfSequenceOptions();
    }

    //metode til at tjekke om det tal brugeren vil ramme er indenfor de værdier terningerne kan rulle
    private boolean checkValidity(int userInput) throws ArithmeticException{
        //ArrayList<Integer> acceptedValues = acceptedValues();
        boolean check = false;
        //check = acceptedValues.contains(userInput);
        check = acceptedValues(diceInDiceCup).contains(userInput);

        if(!check){
            throw new ArithmeticException("Din værdi faldt uden for parametrene");
        }

       return check;
    }

    //metode til at regne ud hvilke værdier er mulige med de valgte terninger og returnerer arraylisten med de værdier
    private ArrayList<Integer> acceptedValues(ArrayList<Dice> diceCupArray) {
        ArrayList<Integer> acceptedValues = new ArrayList<>();
        ArrayList<Integer> tempValueArray = new ArrayList<>();

        for(Dice d : diceCupArray){
            if(acceptedValues.size() < 1){
                for(Integer i : d.getPossibleValues()){
                    acceptedValues.add(i);
                }
            }

            else{
                for(Integer j : d.getPossibleValues()){
                    for(Integer h : acceptedValues){
                        tempValueArray.add(j * h);
                    }
                }
                for(Integer g : tempValueArray){
                    acceptedValues.add(g);
                }
                tempValueArray.clear();

            }
        }
        return acceptedValues;
    }

    //metode til at få brugerens input og add terningerne
    public void chooseDice(){
        //Scanner scan;
        String input;
        int amountOfDice;
        //Scanner scanString;

        //scan = new Scanner(System.in);
        //System.out.println("Hvor mange terninger skal bruges?");

        amountOfDice = Integer.parseInt(userInput("Hvor mange terninger skal bruges?"));

        for(int i = 0; i < amountOfDice; i++){
            //scanString = new Scanner(System.in);

            //System.out.println("Hvad skal terningen være?");
            //System.out.println("D4, D6, D8, D10, D12, D20?");
            //input = scanString.nextLine().toUpperCase(Locale.ROOT).trim();
                input = userInput("Hvad skal terningen være?"+"\n"+"D4, D6, D8, D10, D12, D20?").toUpperCase(Locale.ROOT).trim();
                addDiceToCup(input);

        }
    }

    //metode til at adde terninger til DiceCup arraylisten
       private void addDiceToCup(String userInput) {
           switch (userInput) {
               case "D4":
                   diceInDiceCup.add(new D4());
                   break;

               case "D6":
                   diceInDiceCup.add(new D6());
                   break;

               case "D8":
                   diceInDiceCup.add(new D8());
                   break;

               case "D10":
                   diceInDiceCup.add(new D10());
                   break;

               case "D12":
                   diceInDiceCup.add(new D12());
                   break;

               case "D20":
                   diceInDiceCup.add(new D20());
                   break;
           }
       }

       //efter tallet er nået, får brugeren et valg om der skal rulles igen og om det er med samme terninger
       private void endOfSequenceOptions(){
        Scanner scan;
        String userInput;

        scan = new Scanner(System.in);
        System.out.println("Vil du rulle igen:");
        System.out.println("Ja / Nej?");
        userInput = scan.nextLine().toLowerCase(Locale.ROOT).trim();

        if(userInput.equals("ja")){
            System.out.println("Skal det være samme terninger?");
            System.out.println("Ja / Nej?");
            userInput = scan.nextLine().toLowerCase(Locale.ROOT).trim();

            if(userInput.equals("ja")){
                rollDice();
            }

            else if(userInput.equals("nej")){
                diceInDiceCup.clear();
                chooseDice();
                rollDice();
            }

            else{
                System.out.println("Tak for spillet.");
            }
        }
        else {
            System.out.println("Tak for spillet.");
        }

       }

       private String userInput(String message){
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.println(message);
        input = scan.nextLine();

        return input;
       }
}
