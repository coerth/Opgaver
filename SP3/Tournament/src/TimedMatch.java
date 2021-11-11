import java.util.Scanner;

public class TimedMatch extends Match{
    private int matchDuration;

    public TimedMatch(Team teamA, Team teamB) {
        super(teamA, teamB);
    }

    @Override
    public void processMatch() {
        int goldenGoal = 0;
        boolean validGoldenGoal = false;
        boolean validAScore = false;
        boolean validBScore = false;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("\n" + "The match between: " + super.getTeams()[0].getName() + " and " + super.getTeams()[1].getName());

        while (super.getWinner() == null) {

            while (!validAScore) {
                try {
                    System.out.println("How many goals did team " + super.getTeams()[0].getName() + " score?");
                    super.setTeamAScore(Integer.parseInt(scan.nextLine()));
                    validAScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            while (!validBScore) {
                try {
                    System.out.println("How many goals did team " + super.getTeams()[1].getName() + " score?");
                    super.setTeamBScore(Integer.parseInt(scan.nextLine()));
                    validBScore = true;
                } catch (Exception e) {
                    System.out.println("Your input was not a number, please try again");
                }
            }

            if (super.getTeamAScore() == super.getTeamBScore()) {
                System.out.println("Golden goal! Next goal is the winning team" + "\n" + "Which team scored the last goal?");
                while (!validGoldenGoal) {
                    try {
                        System.out.println("Press 1 for: " + super.getTeams()[0].getName() + " or " + "Press 2 for: " + super.getTeams()[1].getName());
                        goldenGoal = Integer.parseInt(scan.nextLine());
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
                super.setTeamAScore(super.getTeamAScore()+1);
            } else if (goldenGoal == 2) {
                super.setTeamBScore(super.getTeamBScore()+1);
            }

            if (super.getTeamAScore() > super.getTeamBScore()) {
                super.setWinner(super.getTeams()[0]);
            } else {
                super.setWinner(super.getTeams()[1]);
            }

        }

    }
}

