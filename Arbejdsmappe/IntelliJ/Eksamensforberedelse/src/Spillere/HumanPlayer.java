package Spillere;

import java.util.Scanner;

public class HumanPlayer implements Player {
    @Override
    public int guessANumber(int max) {
        int guessedInt = 0;
        Scanner scan = new Scanner(System.in);


        guessedInt = Integer.parseInt(scan.nextLine());
        return guessedInt;

    }
}
