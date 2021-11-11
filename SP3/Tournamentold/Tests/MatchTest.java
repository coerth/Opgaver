import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MatchTest {

    Controller controller;
    Team teamA;
    Team teamB;
    Match match;
    Match match2;
    Match match3;
    ArrayList<Match> matchArrayList;

    @Before
    public void setUp() throws Exception {

        controller = new Controller();
        teamA = new Team("teamA", "Mia", "Casper");
        teamB = new Team("teamB", "Morten", "Casper");
        match = new Match(teamA, teamB);

        matchArrayList.add(new Match(teamA, teamB));
        matchArrayList.add(new TimedMatch(teamA, teamB));

    }


    @Test
    public void processMatchTest() {
        boolean validAScore = false;
        boolean validBScore = false;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("\n" + "The match between: " + match.getTeams()[0].getName() + " and " + match.getTeams()[1].getName());

        while (match.getWinner() == null) {

            while (!validAScore) {
                try {
                    System.out.println("How many goals did team " + match.getTeams()[0].getName() + " score?");
                    match.setTeamAScore(2);
                    validAScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            while (!validBScore) {
                try {
                    System.out.println("How many goals did team " + match.getTeams()[1].getName() + " score?");
                    match.setTeamBScore(10);
                    validBScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            if (match.getTeamAScore() != 10 && match.getTeamBScore() != 10) {
                validAScore = false;
                validBScore = false;
                System.out.println("The match is won by the first team which scores 10 goals!");
            } else if (match.getTeamAScore() == 10) {
                match.setWinner(match.getTeams()[0]);
            } else {
                match.setWinner(match.getTeams()[1]);
            }
        }

        assertEquals(teamB, match.getWinner());
    }
    @Test
    public void moreMatchesTest(){
        for(Match m : matchArrayList){
            m.processMatch();
        }
    }
}