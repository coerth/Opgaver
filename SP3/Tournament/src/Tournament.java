import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Tournament {
    private int id;
    private Team winner;
    private String name;
    private ArrayList<Team> teams = new ArrayList<>();
    private LocalDateTime startDate;
    private String startDateString;
    private boolean isFixedDuration;
    private static int counter = 1;

    public Tournament(String name, String startDate, boolean isFixedDuration) {
        this.id = counter;
        this.name = name;
        this.startDateString = startDate;
        String[] values = startDate.split(",");
        int[] valuesInt = new int[values.length];
        for(int i = 0; i<values.length; i++){
            valuesInt[i] = Integer.parseInt(values[i]);
        }
        this.startDate = LocalDateTime.of(valuesInt[0], valuesInt[1], valuesInt[2], valuesInt[3], valuesInt[4]);
        this.isFixedDuration = isFixedDuration;
        counter++;
    }

    public Tournament(int id, String name, String startDate, boolean isFixedDuration) {
        this.id = id;
        this.name = name;
        this.startDateString = startDate;
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

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
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

    public String getStartDateString() {
        return startDateString;
    }

    public boolean isFixedDuration() {
        return isFixedDuration;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void addTeamToArray(Team team){
        this.teams.add(team);
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public int getId() {
        return id;
    }
}
