package Spillere;

public class GuessingGame {
    int number;

    public GuessingGame(int number) {
        this.number = number;
    }

    public boolean turn(Player player){
        int guessedNumber = 0;
        guessedNumber = (player.guessANumber(number + number));
        System.out.println(guessedNumber);


        if(guessedNumber == number){
            return true;
        }

        return false;
    };
}
