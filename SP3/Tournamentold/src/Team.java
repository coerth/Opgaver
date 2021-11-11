import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    private MatchHistory matchHistory;
    private int goalScore;
    private int points;

    public Team(String name, String player1, String player2) {
        this.name = name;
        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
        this.players.add(p1);
        this.players.add(p2);
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
