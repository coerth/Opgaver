package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> BankAccountArray = new ArrayList<BankAccount>();

    //for user inputs with messages
    private String userInputWithMsg(String msg) {
        System.out.println(msg);
        Scanner scanUserInput = new Scanner(System.in);
        String input = scanUserInput.nextLine().toLowerCase(Locale.ROOT);

        return input;
    }

    //for user inputs without messages
    private String userInput() {
        Scanner scanUserInput = new Scanner(System.in);
        String input = scanUserInput.nextLine().toLowerCase(Locale.ROOT);

        return input;
    }

    //the main bankmenu of options
    public void bankMenu() {
        String userChoice;

        do {
           userChoice = userInputWithMsg("Skriv Q for at afslutte." + "\n" +
                    "Skriv Opret for at oprette kontoer." + "\n" +
                    "Skriv Vis for at få vist en eller flere kontoer." + "\n" +
                    "Skriv Slet for at slette kontoer." + "\n" +
                    "Skriv Trans for at lave transaktioner." + "\n" +
                    "Skriv Historik for at se transaktion historikken." + "\n");

            if (userChoice.equals("opret")) {
                System.out.println("du har valgt opret");
                createAccounts();
            }
            else if (userChoice.equals("vis")) {
                System.out.println("Du har valgt vis");
                searchAccounts();
            }

        } while (!userChoice.equals("q"));
        System.out.println("Du har forladt banken.");
    }

    private void createAccounts() {
        int amountOfAccounts = Integer.parseInt(userInputWithMsg("Hvor mange kontoer skal oprettes?"));
        //indtil i når til antal input, gør følgende
        for (int i = 0; i < amountOfAccounts; i++) {
            BankAccountArray.add(new BankAccount(userInputWithMsg("Skriv dit navn:"),
                    userInputWithMsg("Navn på kontoen"),
                    Float.parseFloat(userInputWithMsg("Skriv dit kontobeløb:"))));
        } //bank oprettelse klemme
        //for hvert objekt i arrayet, print følgende ud
        for (BankAccount BA : BankAccountArray) {
            System.out.println(BA);
        } //bank print klemme
        if (amountOfAccounts > 1) {
            System.out.println("Der er oprettet " + amountOfAccounts + " kontoer." + "\n");
        }//if klemme
        else {
            System.out.println("Der er oprettet " + amountOfAccounts + " konto." + "\n");
        } //else klemme
    }

    private void searchAccounts() {
        String name;
        ArrayList<String> namesInputtedArray = new ArrayList<>();
        do {
            if (namesInputtedArray.size() == 0) {
                name = userInputWithMsg("Skriv navnet på kontoens ejer:");
                namesInputtedArray.add(name);
                System.out.println("Navnet er tilføjet til søgningen.");
            } //if klemme
            else {
                name = userInputWithMsg("Skriv endnu et navn eller skriv søg for at søge");
                if(!name.equals("søg")) {
                    namesInputtedArray.add(name);
                    System.out.println("Navnet er tilføjet til søgningen.");
                }
            } // else klemme
        } while (!name.equals("søg"));
        // for hvert objekt i arraylisten, gør metoden searchName som kigger om det inputtet navn svarer til owner navnet
        for (String names : namesInputtedArray) {
            searchBankArrayForName(names);
        }
        //namesInputtedArray.clear();                                                                                      //clear arraylisten med søgenavne så den ikke bliver evigt større
    }

    private void searchBankArrayForName(String name) {
        int foundCounter = 0;                                                                                               //funktion for at lede BankAccountArray igennem for navne
        for (BankAccount BA : BankAccountArray) {
            if (BA.getOwner().equals(name)) {
                System.out.println("vi har fundet følgende konto" + "\n" + BA);
                foundCounter++;
            }
            else if(foundCounter == 0){
                System.out.println("Der kunne ikke findes nogle kontoejere som svarer til søgenavnene");
            }
        }
    }
}