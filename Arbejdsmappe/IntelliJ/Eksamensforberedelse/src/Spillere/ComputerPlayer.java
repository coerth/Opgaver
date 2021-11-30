package Spillere;

import java.util.Random;

public class ComputerPlayer implements Player {
    @Override
    public int guessANumber(int max) {
        int guessedInt = 0;
        Random rand = new Random();

        guessedInt = rand.nextInt(max);

        return guessedInt;
    }
}
