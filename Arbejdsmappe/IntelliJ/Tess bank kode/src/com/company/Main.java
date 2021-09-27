package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // String input = getUserInput("Skriv navn: ");

        String choice;
        Scanner scan = new Scanner(System.in);
        BankAccount [] accounts = new BankAccount[3];
        int i= 0;
        do{
            System.out.println("Press Q for quit");
            System.out.println("Press A for creating a new bankaccount");
            System.out.println("Press B for go to sektion B");
            choice = scan.nextLine();

            if(choice.equals("A")){
                accounts[i] = new BankAccount(getUserInput("Skriv navn:"));
                i++;
            }

        }while(!choice.equals("Q"));

        accounts[0].doTransaction(Float.parseFloat(getUserInput("Skriv beløb")));


        System.out.println(accounts[0]);
        System.out.println(accounts[1]);
        System.out.println(accounts[2]);


    }

    private static String getUserInput(String msg) {
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
