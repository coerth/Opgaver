package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        System.out.println(opgave1(5, 4, 10));
//        opgave2(20);


//        System.out.println(opgave3(1,9,-11)+"\n");

//        System.out.println(opgave4(11));

//        opgave5("pølsefest");

//        System.out.println(opgave6());

//        System.out.println(opgave7("Pølse"));

//        opgave8();

//        opgave9();

//        opgave10();

//        opgave11(13);

//        int[] intArray = {5,12,54,57,64};
//        int[] intArray2 = {6,13,55,58,65};
//
//       System.out.println(opgave12(intArray));
//
//        System.out.println(opgave13(intArray2, intArray));



    }


    static int opgave1(int input1, int input2, int input3){
        int tal1 = input1;
        int tal2 = input2;
        int tal3 = input3;

        int forsteCheck = Math.min(tal1, tal2);
        int andetCheck = Math.min(forsteCheck, tal3);

    return andetCheck;
    }

    static void opgave2(int input){
        int tal = 1;
        for(int i = 0; i < input; i++){
            if(tal % 2 == 0){
                System.out.print("{"+tal+"}");
            }
            tal++;
        }
        System.out.println("\n");
    }

    static int opgave3(int input1, int input2, int input3){
        int tal1 = Math.abs(input1);
        int tal2 = Math.abs(input2);
        int tal3 = Math.abs(input3);

        int forsteCheck = Math.min(tal1, tal2);
        int andetCheck = Math.min(forsteCheck, tal3);

        return andetCheck;
    }

    //ikke færdig
    static int opgave4(int input){
        String converted_input = "";
        converted_input += Integer.toString((Math.abs(input)));
        int sum = 0;
        for(int i = 0; i < converted_input.length()-1; i++ ){
            sum += converted_input.charAt(i);
            System.out.println(sum);
        }
        //System.out.println(converted_input);
        System.out.println(converted_input.length());
        return sum;
    }

    static void opgave5(String input){
        for(int i = input.length()-1; i > -1 ; i--){
            System.out.println(input.charAt(i));
        }
    }

    static String opgave6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv dit fulde navn:");
        String userInput = scan.nextLine();

        return userInput.toUpperCase(Locale.ROOT);
    }

    static String opgave7(String input){
        int wordLength = input.length();
        String repeatedWord = "";
        for(int i = 0; i < wordLength; i++){
            repeatedWord += input;
        }
        return repeatedWord;
    }

    static void opgave8(){
        String shortestName = "";
        int nameCounter = 1;
        int amountOfNames;
        String userInput;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hvor mange navne skal inputtes?");
        amountOfNames = scan.nextInt();

        for(int i = 0; i < amountOfNames; i++){
            Scanner scanName = new Scanner(System.in);

            System.out.println("Navn " + nameCounter + ": ?");
            userInput = scanName.nextLine();

            if(shortestName.equals("")){
                shortestName = userInput;
            }
            else if(userInput.length() < shortestName.length()){
                shortestName = userInput;
            }
            nameCounter++;
        }
        System.out.println(shortestName + " er det korteste navn");
    }

    static void opgave9(){
        int randomNumber;
        int roundsCounter = 0;
        Random rand = new Random();

        do {
            randomNumber = rand.nextInt(1000);
            System.out.println(randomNumber);
            roundsCounter++;

        }while(randomNumber < 900);
        System.out.println("Så mange runder krævede det: " + roundsCounter);
    }

    static void opgave10(){
        int userInput = 0;
        int maxInput = 0;
        int minInput = 999;

        while(userInput != -1){
            Scanner scan = new Scanner(System.in);
            System.out.println("Skriv et tal eller tast -1 for at afslutte");
            userInput = scan.nextInt();
            System.out.println(userInput);

            if(userInput > maxInput){
                maxInput = userInput;
            }
            if(userInput < minInput && userInput != -1){
                minInput = userInput;
            }
        }
        System.out.println("Dit største tal var: " + maxInput + "." + "\n" + "Dit mindste tal var: " + minInput + ".");
    }

    static void opgave11(int input){
        int multiplier = 1;

        for(int i = 0; i < 10; i++){
            int multipliedInput = 0;
            multipliedInput = input * multiplier;
            multiplier++;

            if(multiplier < 11){
                System.out.print(multipliedInput + " og ");
            }
            else{
                System.out.print(multipliedInput);
            }
        }
    }

    static int opgave12(int[] inputArray){
        int maxInput = 0;

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] > maxInput){
                maxInput = inputArray[i];
            }
        }

        return maxInput;
    }

    static boolean opgave13(int[] intArray1, int[] intArray2){
        boolean valid = false;
        if(intArray1.length == intArray2.length){
            for(int i = 0; i < intArray1.length-1; i++){
                if(intArray1[i] > intArray2[i]){
                    if(i < intArray1.length-1){
                        valid = true;
                    }
                }

            }

        }
        else{
            valid = false;        }
        return valid;
    }
}
