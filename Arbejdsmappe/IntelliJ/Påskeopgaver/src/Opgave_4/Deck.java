package Opgave_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    private int[] deck = new int[52];
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private String[] ranks = {"Ace","2", "3", "4", "5", "6", "7" , "8", "9", "10", "Jack", "Queen", "King"};



    public Deck() {
        importDeck();
    }


    public String[] getSuits() {
        return suits;
    }

    public String[] getRanks() {
        return ranks;
    }

    private void importDeck(){
        File file = new File("src/Opgave_4/deck.txt");
        int counter = 0;

        try{
            Scanner scan = null;
            scan = new Scanner(file);

            while(scan.hasNextInt()) {
                this.deck[counter] = (scan.nextInt());
                counter++;
            }

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }

    public void getRandomCard(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int amountOfCards;
        String suit;
        String rank;


        System.out.println("Hvor mange kort skal trækkes?");
        amountOfCards = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < amountOfCards; i++){
            int pulledCard = (rand.nextInt(0,52));
            suit = suits[pulledCard / 13];
            rank = ranks[pulledCard % 13];

            System.out.println("Kortnummer: " + (pulledCard+1) + ": " + suit + " " + rank);

        }

    }


}
