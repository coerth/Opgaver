package com.company;

import java.util.Locale;
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

        opgave8();
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

            System.out.println("Navn " + nameCounter + ": ?");
            userInput = scan.nextLine();

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
}
