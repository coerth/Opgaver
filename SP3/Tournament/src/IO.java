import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface IO {
    abstract ArrayList<Tournament> readTournaments() throws FileNotFoundException;
    abstract ArrayList<Team> readTeams(Tournament t) throws FileNotFoundException;
    abstract void saveTournaments(ArrayList<Tournament> tournaments) throws IOException;
    abstract void saveTeams(Tournament t, int placement) throws IOException;

}
