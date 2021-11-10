import java.time.LocalDateTime;
import java.util.ArrayList;

public class KnockOutTournament extends Tournament {
    private Bracket bracket;

    public KnockOutTournament(String name, String startDate, boolean isFixedDuration) {
        super(name, startDate, isFixedDuration);
        bracket = new Bracket(isFixedDuration ? true : false);
    }

    public Bracket getBracket() {
        return bracket;
    }

    public void createBracket() {
        /*int teamExcess;
        teamExcess = super.getTeams().size() % 16;
        if(teamExcess > 0)
            excessBracket();
*/

        bracket.getBracketView().setTournamentName(super.getName());
        bracket.getBracketView().setStartDate(super.getStartDate());
        bracket.createPreliminaryFinal(super.getTeams());

    }

    public void runBracket() {
        super.setWinner(bracket.processBracket());
        bracket.getBracketView().setTourWinner(super.getWinner().getName());

    }

    public void exportBracketToView() {
        bracket.exportBracketToView();
    }

    /*public Team excessBracket(){
        Team sixteenthTeam = null;
        ArrayList<Team> teamArrayList = new ArrayList<>();
        Bracket excessBracket = new Bracket();
        Team excessBracketWinner = null;
        Match matchFor16th;

        for(int i = 16; i < super.getTeams().size(); i++){
            teamArrayList.add(super.getTeams().get(i) );
            super.getTeams().remove(i);
        }

        if(teamArrayList.size() % 2 == 1){

        }

        if(teamArrayList.size() < 3){
            excessBracket.createFinal(teamArrayList.get(0), teamArrayList.get(1));
        }

        excessBracketWinner = excessBracket.getFinals()[0].getWinner();
        matchFor16th = new Match(sixteenthTeam, excessBracketWinner);

        return excessBracketWinner;
    }*/
}
