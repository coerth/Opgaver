package Spillere;

public class Main {
    public static void main(String[] args) {
        Player human = new HumanPlayer();
        Player computer = new ComputerPlayer();

        GuessingGame gg = new GuessingGame(20);


        while (true) {
            if(gg.turn(computer)){
                break;
            }
        }
    }
}