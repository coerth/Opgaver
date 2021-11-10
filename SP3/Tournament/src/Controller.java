import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    private ArrayList<Tournament> tournaments = new ArrayList<>();


    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }


    public void createTournament(String tournamentName, String startDate, boolean fixedDuration) {
        tournaments.add(new KnockOutTournament(tournamentName, startDate, fixedDuration));
        try {
            FileWriter fw = new FileWriter("src/Tournaments/Tournaments.txt", true);
            fw.write(tournamentName + ": " + startDate + ": " + fixedDuration + "\n");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        for (Tournament t : tournaments) {
            File file = new File("src/Tournaments/" + t.getName() + "Teams.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                continue;
            }
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
                    t.readTeamsFromFile();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

        }

    }

   /* public void saveMatch(){
        File file = new File("src/Tournaments/Matches.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
        }
        for(Tournament t : tournaments){
            if(t instanceof KnockOutTournament){
                for (Match[] mArray : ((KnockOutTournament) t).getBracket().exportBracketToView()){
                    for(Match m : mArray){
                        if (m == null){
                            continue;
                        }else{
                            if (m.getWinner() == null){
                                continue;
                            }
                            try {
                                FileWriter fw = new FileWriter("src/Tournaments/Matches.txt", true);
                                fw.write(((KnockOutTournament) t).getBracket().exportBracketToView().indexOf(mArray) + ", " + m.getTeams()[0].getName() + ", " + m.getTeams()[1].getName() + ", " + m.getWinner().getName()+'\n');
                                fw.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }

        }
    }*/

    public void saveMatch(Match match, Match[] matches) {
        File file = new File("src/Tournaments/Matches.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
        }
        try {
            FileWriter fw = new FileWriter("src/Tournaments/Matches.txt", true);
            fw.write(matches + ": " + match.getTeams()[0].getName() + ": " + match.getTeams()[1].getName() + ": " + match.getWinner().getName() + '\n');
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadTournaments() throws FileNotFoundException {
        File file = new File("src/Tournaments/Tournaments.txt");
        Scanner scan = null;
        scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] values = scan.nextLine().split(":");
            tournaments.add(new KnockOutTournament(values[0].trim(), values[1].trim(), Boolean.parseBoolean(values[2].trim())));
        }
    }

    public void postTeamsFromTournament(int tournamentPlace) {
        for (Tournament t : tournaments) {
            if (tournaments.indexOf(t) == tournamentPlace - 1) {
                System.out.println(t.getTeams());
            }
        }
    }
}
