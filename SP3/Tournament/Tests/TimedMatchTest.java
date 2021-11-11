/*
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TimedMatchTest {

    Controller controller;
    Team teamA;
    Team teamB;
    Match match;


    @Before
    public void setUp() throws Exception {
        controller = new Controller();
        teamA = new Team("teamA", "Mia", "Casper");
        teamB = new Team("teamB", "Morten", "Casper");
        match = new TimedMatch(teamA, teamB);
    }

    @Test
    public void processMatchTest() {
        int goldenGoal = 0;
        boolean validGoldenGoal = false;
        boolean validAScore = false;
        boolean validBScore = false;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("\n" + "The match between: " + match.getTeams()[0].getName() + " and " + match.getTeams()[1].getName());

        while (match.getWinner() == null) {

            while (!validAScore) {
                try {
                    System.out.println("How many goals did team " + match.getTeams()[0].getName() + " score?");
                    match.setTeamAScore(7);
                    validAScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            while (!validBScore) {
                try {
                    System.out.println("How many goals did team " + match.getTeams()[1].getName() + " score?");
                    match.setTeamBScore(6);
                    validBScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            if (match.getTeamAScore() == match.getTeamBScore()) {
                System.out.println("Golden goal! Next goal is the winning team" + "\n" + "Which team scored the last goal?");
                while (!validGoldenGoal) {
                    try {
                        System.out.println("Press 1 for: " + match.getTeams()[0].getName() + " or " + "Press 2 for: " + match.getTeams()[1].getName());
                        goldenGoal = 2;
                        if (goldenGoal == 1) {
                            validGoldenGoal = true;
                        } else if (goldenGoal == 2) {
                            validGoldenGoal = true;
                        }

                    } catch (Exception e) {
                        System.out.println("Your input was not a number, please try again");
                    }
                }

            }
            if (goldenGoal == 1) {
                match.setTeamAScore(match.getTeamAScore()+1);
            } else if (goldenGoal == 2) {
                match.setTeamBScore(match.getTeamBScore()+1);
            }

            if (match.getTeamAScore() > match.getTeamBScore()) {
                match.setWinner(match.getTeams()[0]);
            } else {
                match.setWinner(match.getTeams()[1]);
            }

        }

        assertEquals(teamA, match.getWinner());
    }


    @Test
    public void goldenGoalTest(){
        int goldenGoal = 0;
        boolean validGoldenGoal = false;
        boolean validAScore = false;
        boolean validBScore = false;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("\n" + "The match between: " + match.getTeams()[0].getName() + " and " + match.getTeams()[1].getName());

        while (match.getWinner() == null) {

            while (!validAScore) {
                try {
                    System.out.println("How many goals did team " + match.getTeams()[0].getName() + " score?");
                    match.setTeamAScore(6);
                    validAScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            while (!validBScore) {
                try {
                    System.out.println("How many goals did team " + match.getTeams()[1].getName() + " score?");
                    match.setTeamBScore(6);
                    validBScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            if (match.getTeamAScore() == match.getTeamBScore()) {
                System.out.println("Golden goal! Next goal is the winning team" + "\n" + "Which team scored the last goal?");
                while (!validGoldenGoal) {
                    try {
                        System.out.println("Press 1 for: " + match.getTeams()[0].getName() + " or " + "Press 2 for: " + match.getTeams()[1].getName());
                        goldenGoal = 2;
                        if (goldenGoal == 1) {
                            validGoldenGoal = true;
                        } else if (goldenGoal == 2) {
                            validGoldenGoal = true;
                        }

                    } catch (Exception e) {
                        System.out.println("Your input was not a number, please try again");
                    }
                }

            }
            if (goldenGoal == 1) {
                match.setTeamAScore(match.getTeamAScore()+1);
            } else if (goldenGoal == 2) {
                match.setTeamBScore(match.getTeamBScore()+1);
            }

            if (match.getTeamAScore() > match.getTeamBScore()) {
                match.setWinner(match.getTeams()[0]);
            } else {
                match.setWinner(match.getTeams()[1]);
            }

        }

        assertEquals(teamB, match.getWinner());
    }
}*/
