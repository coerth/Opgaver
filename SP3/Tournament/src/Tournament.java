import java.util.ArrayList;

public abstract class Tournament {
    private Team winner;
    private String name;
    private ArrayList<Team> teams;
    private String startDate;
    private boolean isFixedDuration;

    public Tournament(String name, String startDate, boolean isFixedDuration) {
        this.name = name;
        this.startDate = startDate;
        this.isFixedDuration = isFixedDuration;
    }

    public Team getWinner() {
        return winner;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public boolean isFixedDuration() {
        return isFixedDuration;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void readTeamsFromFile(){

    }

    public void saveTeamsToFile(){

    }
}
