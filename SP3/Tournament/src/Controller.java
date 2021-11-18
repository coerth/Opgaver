import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private IO connector;
    private ArrayList<Tournament> tournaments = new ArrayList<>();

    public void setConnection(){
        while(connector == null) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("How do you want to read data?");
                System.out.println("Press 1 for DB. Press 2 for Files");
                int choice = Integer.parseInt(scan.nextLine());

                if (choice == 1) {
                    connector = new DBConnector();
                } else if (choice == 2) {
                    connector = new FileManager();
                }
            }catch (Exception e){
                System.out.println("Your input was not a number, please try again.");
            }
        }
    }

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }


    public void createTournament(String tournamentName, String startDate, boolean fixedDuration) {
        int idCounter = tournaments.size()+1;
        if(connector instanceof DBConnector){
            tournaments.add(new KnockOutTournament(idCounter, tournamentName, startDate, fixedDuration));
        }
        else{
            tournaments.add(new KnockOutTournament(tournamentName, startDate, fixedDuration));
        }

    }

    public void saveTournament() throws IOException {
        connector.saveTournaments(tournaments);
        for(Tournament t : tournaments){
            connector.saveTeams(t, tournaments.indexOf(t) + 1);
        }

    }

    public IO getFileManager() {
        return connector;
    }

    public void createTeam(Tournament t){
        Scanner keyboard = new Scanner(System.in);
        int idcounter = 0;
        for(Tournament tour : tournaments){
            idcounter += tour.getTeams().size();
        }
        idcounter += 1;
         
        if (t.getTeams().size() < 16) {
            System.out.println("What is your team name?");
            String teamName = keyboard.nextLine();
            System.out.println("Player1 name?");
            String name1 = keyboard.nextLine();
            System.out.println("Player2 name?");
            String name2 = keyboard.nextLine();
            if(connector instanceof DBConnector){
                t.addTeamToArray(new Team(idcounter, teamName, name1, name2));
            }else{
                t.addTeamToArray(new Team(teamName, name1, name2));
            }
        } else {
            System.out.println("Registration is closed!");
        }
    }


    public void deleteTournament() {

    }

    public Tournament getTournament(int tournamentPlace) {
        Tournament tourn = null;
        for (Tournament t : tournaments) {
            if (tournaments.indexOf(t) == tournamentPlace - 1) {
                tourn = t;
            }
        }
        return tourn;
    }

    public void loadTeamsToTournament(int tournamentPlace) {
        for (Tournament t : tournaments) {
            if (tournaments.indexOf(t) == tournamentPlace - 1) {
                try {
                    t.setTeams(connector.readTeams(t));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

        }

    }


    public void loadTournaments() throws FileNotFoundException {
        this.tournaments = connector.readTournaments();
    }

    public void postTeamsFromTournament(int tournamentPlace) {
        for (Tournament t : tournaments) {
            if (tournaments.indexOf(t) == tournamentPlace - 1) {
                System.out.println(t.getTeams());
            }
        }
    }
}
