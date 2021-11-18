import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileManager implements IO {
    @Override
    public ArrayList<Tournament> readTournaments() throws FileNotFoundException {
        ArrayList<Tournament> tournaments = new ArrayList<>();
        File file = new File("src/Tournaments/Tournaments.txt");
        Scanner scan = null;
        scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] values = scan.nextLine().split(":");
            tournaments.add(new KnockOutTournament(values[0].trim(), values[1].trim(), Boolean.parseBoolean(values[2].trim())));
        }
        return tournaments;
    }

    @Override
    public ArrayList<Team> readTeams(Tournament t) throws FileNotFoundException {
        ArrayList<Team> teams = new ArrayList<>();
        File file = new File("src/Tournaments/" + t.getName() + "Teams.txt");
        Scanner scan = null;
        scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String[] values = scan.nextLine().split(":");
            teams.add(new Team(values[0].trim(), values[1].trim(), values[2].trim()));
        }
        return teams;
    }

    @Override
    public void saveTournaments(ArrayList<Tournament> tournaments) throws IOException {
        FileWriter fw = null;
        fw = new FileWriter("src/Tournaments/Tournaments.txt");
        for (Tournament t : tournaments) {
            File file = new File("src/Tournaments/" + t.getName() + "Teams.txt");
            file.createNewFile();
            fw.write(t.getName() + ": " + t.getStartDateString() + ": " + t.isFixedDuration() + "\n");
        }
        fw.close();

    }

    @Override
    public void saveTeams(Tournament t, int placement) throws IOException {
        FileWriter fw = new FileWriter("src/Tournaments/" + t.getName() + "Teams.txt");
        for (Team team : t.getTeams()) {
            fw.write(team.getName() + ": " + team.getPlayers().get(0).getName() + ": " + team.getPlayers().get(1).getName() + "\n");
        }
        fw.close();
    }
}

