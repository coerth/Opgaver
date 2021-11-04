import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    private MatchHistory matchHistory;
    private int goalScore;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGoalScore() {
        return goalScore;
    }

    public void addPlayer(){

    }

    public void removePlayer(){

    }

    public void joinTournament(){

    }

    public void forfeitTournament(){

    }

    @Override
    public String toString() {
        return "Team: " + name + '\'' + players;// skriver vores værdier i arraylisten ud
    }
}
