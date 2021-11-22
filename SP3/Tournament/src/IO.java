import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface IO {
    ArrayList<Tournament> readTournaments() throws FileNotFoundException;
    ArrayList<Team> readTeams(Tournament t) throws FileNotFoundException;
    void saveTournaments(ArrayList<Tournament> tournaments) throws IOException;
    void saveTeams(Tournament t, int placement) throws IOException;

}
