import java.time.LocalDateTime;
import java.util.ArrayList;

public class KnockOutTournament extends Tournament {
    private Bracket bracket;

    public KnockOutTournament(String name, String startDate, boolean isFixedDuration) {
        super(name, startDate, isFixedDuration);
        bracket = new Bracket(isFixedDuration ? true : false);
    }

    public KnockOutTournament(int id, String name, String startDate, boolean isFixedDuration) {
        super(id, name, startDate, isFixedDuration);
        bracket = new Bracket(isFixedDuration ? true : false);
    }

    public Bracket getBracket() {
        return bracket;
    }

    public void createBracket() {


        bracket.getBracketView().setTournamentName(super.getName());
        bracket.getBracketView().setStartDate(super.getStartDate());
        bracket.createPreliminaryFinal(super.getTeams());

    }

    public void runBracket() {
        super.setWinner(bracket.processBracket());
        bracket.getBracketView().setTourWinner(super.getWinner().getName());
        System.out.println("The winner of "+super.getName()+" is " + super.getWinner().getName());

    }


}
