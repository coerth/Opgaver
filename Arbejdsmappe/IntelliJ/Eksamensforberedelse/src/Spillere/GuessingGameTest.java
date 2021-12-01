package Spillere;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {
    Player human;
    Player computer;
    GuessingGame gg;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Player human = new HumanPlayer();
        Player computer = new ComputerPlayer();
        GuessingGame gg = new GuessingGame(20);
    }

    @org.junit.jupiter.api.Test
    void turn() {
        gg.turn(human);
    }
}