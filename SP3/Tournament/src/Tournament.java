import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Tournament {
    private Team winner;
    private String name;
    private ArrayList<Team> teams = new ArrayList<>();
    private LocalDateTime startDate;
    private boolean isFixedDuration;

    public Tournament(String name, String startDate, boolean isFixedDuration) {
        this.name = name;
        String[] values = startDate.split(",");
        int[] valuesInt = new int[values.length];
        for(int i = 0; i<values.length; i++){
            valuesInt[i] = Integer.parseInt(values[i]);
        }
        this.startDate = LocalDateTime.of(valuesInt[0], valuesInt[1], valuesInt[2], valuesInt[3], valuesInt[4]);
        this.isFixedDuration = isFixedDuration;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public Team getWinner() {
        return winner;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public boolean isFixedDuration() {
        return isFixedDuration;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }


    public void readTeamsFromFile() throws FileNotFoundException {
        File file = new File("src/Tournaments/"+name+"Teams.txt");
        Scanner scan = null;
        scan = new Scanner(file);

        while(scan.hasNextLine()) {
            String[] values = scan.nextLine().split(":");
            teams.add(new Team(values[0].trim(),values[1].trim(),values[2].trim()));
        }

    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public void createTeam(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your team name?");
        String teamName = keyboard.nextLine();
        int lineCounter = 0;
        try {
            FileWriter fw = new FileWriter("src/Tournaments/"+this.name+"Teams.txt", true);
            File file = new File("src/Tournaments/"+this.name+"Teams.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String[] values = scan.nextLine().split(":");
                if(teamName.equals(values[0])){
                    System.out.println("Team name already exists");
                    teamName = keyboard.nextLine();
                }
                lineCounter++;
            }

            if(lineCounter < 16){
                System.out.println("Player1 name?");
                String name1 = keyboard.nextLine();
                System.out.println("Player2 name?");
                String name2 = keyboard.nextLine();
                String fullTeam = teamName +": "+ name1 +": " +name2;
                fw.write(fullTeam + '\n');
                fw.close();
            }
            else{
                System.out.println("Registration is closed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
