import java.util.ArrayList;

public class GroupTournament extends Tournament{
    private ArrayList<Group> groups = new ArrayList<>();

    public GroupTournament(String name, String startDate, boolean isFixedDuration) {
        super(name, startDate, isFixedDuration);
    }
}
