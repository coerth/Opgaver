import java.util.InputMismatchException;
import java.util.Scanner;

public class Match {
    private Team[] teams = new Team[2];
    private Team winner;
    private String startTime;
    private int teamAScore;
    private int teamBScore;
    private int matchDuration;
    //private boolean fixedDuration;

    public Match(Team teamA, Team teamB) {
        this.teams[0] = teamA;
        this.teams[1] = teamB;
        this.startTime = startTime;
        this.matchDuration = matchDuration;
    }

    public Team[] getTeams() {
        return teams;
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public String getStartTime() {
        return startTime;
    }

    public int getMatchDuration() {
        return matchDuration;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    public void processMatch() {
        boolean validAScore = false;
        boolean validBScore = false;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("\n" + "The match between: " + teams[0].getName() + " and " + teams[1].getName());

        while (winner == null) {

            while (!validAScore) {
                try {
                    System.out.println("How many goals did team " + teams[0].getName() + " score?");
                    teamAScore = Integer.parseInt(scan.nextLine());
                    validAScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            while (!validBScore) {
                try {
                    System.out.println("How many goals did team " + teams[1].getName() + " score?");
                    teamBScore = Integer.parseInt(scan.nextLine());
                    validBScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            if (teamAScore != 10 && teamBScore != 10) {
                validAScore = false;
                validBScore = false;
                System.out.println("The match is won by the first team which scores 10 goals!");
            } else if (teamAScore == 10) {
                this.winner = teams[0];
            } else {
                this.winner = teams[1];
            }
        }
    }

    public void addGoalScore() {

    }

    @Override
    public String toString() {
        return teams[0].getName() + " VS " + teams[1].getName();
    }
}
