package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
       // System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        //System.out.println(printLongestWord());
        //printFirstHalfOfEachWord();
        printMostFrequentLetter();
        printLessFrequentLetter();


    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    //Task 1 funktion
    private static String printLongestWord()
    {
        int lengthCounter = 0;
        int index;
        String longestWord = "";


        for (String s : text)
        {       //hvis ordets længde er større end længdecounteren, så gør følgende:
                if(s.length() > lengthCounter){
                     longestWord = s;
                    lengthCounter = longestWord.length();

                    //hvis longestWord indeholder et . så gør følgende:
                    if (longestWord.contains(".")){
                        index = longestWord.indexOf(".");
                        longestWord = longestWord.substring(0, index );
                        lengthCounter = longestWord.length();
                    }

                    //eller hvis longestWord indeholder et , så gør følgende:
                    else if (longestWord.contains(",")){
                        index = longestWord.indexOf(",");
                        longestWord = longestWord.substring(0, index );
                        lengthCounter = longestWord.length();
                    }
        }
            }
        return longestWord;
        }

        //Task 2
    public static void printFirstHalfOfEachWord() {
        for (String s : text) {
            System.out.println(s.substring(0, s.length() / 2));
            //printer også hele ordet for at se om den tog mellemrum eller det var tomme værdier i arrayet
            System.out.println(s);
        }
        System.out.println("\n");
    }

    //Task 3
    public static void printMostFrequentLetter(){
        ArrayList<Letteroccurence> letterArray = new ArrayList<>(); //array til at sortere en top 10
        int charCounter = 0; // counter brugt for hvert bogstav
        String checkText = ""; //nem løsning for at tjekke hele string arrayet
        int sortCounter = 0; // for at kunne bruges i en if betingelse til printningen af vores top 10

        //for hvert ord i String arrayet, læg det ord til vores checkText string
        for (String s : text) {
            checkText += s.toLowerCase(Locale.ROOT); // Gør alle bogstaver til lowercase
        }
            //For loop som kører igennem hvert bogstav i alfabetet og kører endnu en for loop som tjekker vores checkText
            // for det bogstav vi er nået til og adder til counteren når vi når dertil. Den tager ikke æ ø og å,
            // men har lavet en føler på at det ikke er en af de bogstaver der forekommer hyppigst.
        for(int i = 0; i < checkText.length(); i++){
            charCounter = 0; // start med at sæt charCounter til 0

            /*
            if(letterArray.size() == 0){ // hvis der ikke er nogle objekter i arrayet, så start med at indsætte det første objekt ind
                letterArray.add(new Letteroccurence(checkText.charAt(i),1));
            }
             */
            
            //for hvert objekt i arrayet, hvis der er et objekt som har samme bogstav, så forøg hyppigheden og forøg charCounter
            for(Letteroccurence eachLetter : letterArray){
                if (checkText.charAt(i) == eachLetter.getTheCharacter()){
                    eachLetter.setNumberOfOccurences(eachLetter.getNumberOfOccurences()+1);
                    charCounter++;
                }
            }
            //hvis charCounter er 0 så indsæt et objekt med det bogstav
            if(charCounter == 0){
                letterArray.add(new Letteroccurence(checkText.charAt(i),1));
            }
            //når tjekket efter et specifikt bogstav er færdigt og der er fundet værdi på counteren over 0,
            // print bogstavet + counter ud

            sortCounter++; // når vi er færdige med hvert bogstav så går sortCounter en op.
            if(sortCounter == checkText.length()){ //når vi er nået til det 26. bogstav så gør følgende:
                Collections.sort(letterArray); //sorter vores array, den mindste værdi er den første i arrayet
                System.out.println("Top 10 for mest hyppighed.");


                // Da den største værdi er den sidste så start fra slutningen af arrayet og bevæg dig tilbage
                for(int j = letterArray.size()-1; j > letterArray.size()-11 ; j--){
                    System.out.println(letterArray.get(j).getTheCharacter() + " = " + letterArray.get(j).getNumberOfOccurences());
                }
            }
            }
        System.out.println("\n");
    }

    //Task 4
    public static void printLessFrequentLetter(){
        ArrayList<Letteroccurence> letterArrayLess = new ArrayList<>(); //array til top 10 af de færreste, behøves ikke at lave navnet om men det blev gjort
        int charCounter = 0; // counter brugt for hvert bogstav
        String checkText = ""; //nem løsning for at tjekke hele string arrayet
        int sortCounter = 0; // for at kunne bruges i en if betingelse til printningen af vores top 10
        //for hvert ord i String arrayet, læg det ord til vores checkText string
        for (String s : text) {
            checkText += s.toLowerCase(Locale.ROOT); // Gør alle bogstaver til lowercase
        }
        //for loop som kører igennem hvert bogstav i alfabetet og kører endnu en for loop som tjekker vores checkText
        // for det bogstav vi er nået til og adder til counteren når vi når dertil.
        // men har lavet en føler på at det ikke er en af de bogstaver der forekommer hyppigst.
            for(int i = 0; i < checkText.length(); i++){
                charCounter = 0; // start med at sæt charCounter til 0

                /*
                if(letterArrayLess.size() == 0){ // hvis der ikke er nogle objekter i arrayet, så start med at indsætte det første objekt ind
                    letterArrayLess.add(new Letteroccurence(checkText.charAt(i),1));
                }
                 */

                //for hvert objekt i arrayet, hvis der er et objekt som har samme bogstav, så forøg hyppigheden og forøg charCounter
                for(Letteroccurence eachLetter : letterArrayLess){
                    if (checkText.charAt(i) == eachLetter.getTheCharacter()){
                        eachLetter.setNumberOfOccurences(eachLetter.getNumberOfOccurences()+1);
                        charCounter++;
                }
                    }
                //hvis charCounter er 0 så indsæt et objekt med det bogstav
                if(charCounter == 0){
                    letterArrayLess.add(new Letteroccurence(checkText.charAt(i),1));
            }
            //når tjekket efter et specifikt bogstav er færdigt og der er fundet værdi på counteren over 0,
            // print bogstavet + counter ud

            sortCounter++; // når vi er færdige med hvert bogstav så går sortCounter en op.
            if(sortCounter == checkText.length()){ //når vi er nået til det 26. bogstav så gør følgende:
                Collections.sort(letterArrayLess); //sorter vores array, den mindste værdi er den første i arrayet
                System.out.println("Top 10 for mindst hyppighed.");

                // Da den mindste værdi er den første så start fra starten af arrayet og bevæg dig frem
                for(Letteroccurence each : letterArrayLess){
                    System.out.println(each.getTheCharacter() + " = " + each.getNumberOfOccurences());
                }
            }
        }
        System.out.println("\n");
    }
}





