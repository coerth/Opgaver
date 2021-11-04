import java.util.ArrayList;

public class Group {
    private String name;
    private int amountOfMatches;
    private ArrayList<Team> teams = new ArrayList<>();
    private Team[] ranking = new Team[teams.size()];
    private Match[] matches = new Match[amountOfMatches];

    public Group(String name, int amountOfMatches) {
        this.name = name;
        this.amountOfMatches = amountOfMatches;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfMatches() {
        return amountOfMatches;
    }

    public Team[] getRanking() {
        return ranking;
    }

    public Match[] getMatches() {
        return matches;
    }

    public void setTeams(Team team) {
        teams.add(team);
    }
}
