import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    private MatchHistory matchHistory;
    private int goalScore;
    private int points;
    private int id;
    private static int counter = 1;

    public Team(String name, String player1, String player2) {
        this.name = name;
        this.id = counter;
        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
        this.players.add(p1);
        this.players.add(p2);
        counter++;
    }

    public Team(int id, String name, String player1, String player2) {
        this.name = name;
        this.id = id;
        Player p1 = new Player(player1);
        Player p2 = new Player(player2);
        this.players.add(p1);
        this.players.add(p2);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public int getGoalScore() {
        return goalScore;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Team: "+ id + " " + name + '\'' + players;// skriver vores værdier i arraylisten ud
    }
}
