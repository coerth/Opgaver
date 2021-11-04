public class KnockOutTournament extends Tournament{
    private Bracket bracket;

    public KnockOutTournament(String name, String startDate, boolean isFixedDuration) {
        super(name, startDate, isFixedDuration);
    }

    public Bracket createBracket(){
        return bracket;
    }
}
