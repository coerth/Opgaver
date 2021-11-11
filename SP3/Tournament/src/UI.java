import java.time.LocalDateTime;
import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);
    private Scanner scan1 = new Scanner(System.in);
    private String name;
    private int num;
    private String choice;

    public void showMenu(Controller controller) {
        do {
            System.out.println("Admin Menu:");
            System.out.println();
            System.out.println("Press Q to create a tournament");
            System.out.println("Press W to create a team");
            System.out.println("Press E to create a bracket");
            System.out.println("Press R to load teams to tournament");
            System.out.println("Press T to post teams in tournament");
            System.out.println("Type run to run the tournament");
            System.out.println("Type Quit to quit");
            System.out.println("Press B to go back to main menu");
            choice = scan1.nextLine();
            if (choice.equalsIgnoreCase("q")) {
                menuTournament(controller);
            } else if (choice.equalsIgnoreCase("w")) {
                menuTeam(controller);
            } else if (choice.equalsIgnoreCase("e")) {
                menuBracket(controller);
            } else if (choice.equalsIgnoreCase("r")) {
                menuLoadTeams(controller);
            } else if (choice.equalsIgnoreCase("t")) {
                menuPostTeams(controller);
            } else if (choice.equalsIgnoreCase("run")) {
                menuRunTournament(controller);
            } else if (choice.equalsIgnoreCase("b")){
                
            } else {
                System.out.println("This menu doesn't exist, try again!");
            }
        } while (!choice.equalsIgnoreCase("quit"));
    }

    public void menuRunTournament(Controller controller){
        System.out.println("Which tournament do you wanna run?");
        for (Tournament t : controller.getTournaments()) {
            System.out.println(controller.getTournaments().indexOf(t)+1 + ". " + t.getName());
        }
        num = scan.nextInt();
        for(Tournament t : controller.getTournaments()){
            if (t instanceof KnockOutTournament) {
                System.out.println(t.getName() + " is running");
                ((KnockOutTournament) controller.getTournament(num)).runBracket();
            }

        }
    }

    public void menuPostTeams(Controller controller){
        System.out.println("Which tournament?");
        for(Tournament t : controller.getTournaments()){
            System.out.println(controller.getTournaments().indexOf(t)+1 +". "+ t.getName());
        }
        num = scan.nextInt();
        controller.postTeamsFromTournament(num);
        System.out.println("Teams posted from " + controller.getTournament(num).getName());
    }

    public void menuLoadTeams(Controller controller){
        System.out.println("Which tournament?");
        for(Tournament t : controller.getTournaments()){
            System.out.println(controller.getTournaments().indexOf(t)+1 +". "+ t.getName());
        }
        num = scan.nextInt();
        controller.loadTeamsToTournament(num);
        System.out.println("Teams loaded to " + controller.getTournament(num).getName());
    }

    public void menuBracket(Controller controller) {
        System.out.println("for what tournament?");
        for(Tournament t : controller.getTournaments()){
            System.out.println(controller.getTournaments().indexOf(t)+1 +". "+ t.getName());
        }
        num = scan.nextInt();
        if (controller.getTournament(num) instanceof KnockOutTournament) {
            ((KnockOutTournament) controller.getTournament(num)).createBracket();
            System.out.println("Bracket created for " + controller.getTournament(num).getName());
        }
    }

    public void menuTeam(Controller controller) {
        System.out.println("What tournament?");
        for(Tournament t : controller.getTournaments()){
            System.out.println(controller.getTournaments().indexOf(t)+1 +". "+ t.getName());
        }
        num = scan.nextInt();
        controller.getTournament(num).createTeam();
        System.out.println("Team added to " + controller.getTournament(num).getName());
    }

    public void menuTournament(Controller controller) {
        System.out.println("What do you call it?");
        name = scan.nextLine();
        boolean doesExist = false;
        for (Tournament t : controller.getTournaments()) {
            if (t.getName().equals(name)) {
                doesExist = true;
            }
        }
        if (doesExist) {
            System.out.println("The tournament already exists");
        } else {
            System.out.println("When does it start? (YYYY,MM,DD,HH,mm");
            String startDate = scan.nextLine();
            System.out.println("Is it fixed time?");
            boolean fixedDuration = Boolean.parseBoolean(scan.nextLine());
            controller.createTournament(name, startDate, fixedDuration);
            System.out.println("Tournament called " + name + " created!");
        }
    }
}
