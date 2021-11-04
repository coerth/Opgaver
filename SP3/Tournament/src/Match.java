public class Match {
    private Team[] teams = new Team[2];
    private Team winner;
    private String startTime;
    private int TeamAScore;
    private int TeamBScore;
    private int matchDuration;

    public Match(Team[] teams, String startTime, int matchDuration) {
        this.teams = teams;
        this.startTime = startTime;
        this.matchDuration = matchDuration;
    }

    public int getTeamAScore() {
        return TeamAScore;
    }

    public int getTeamBScore() {
        return TeamBScore;
    }

    public String getStartTime() {
        return startTime;
    }

    public int getMatchDuration() {
        return matchDuration;
    }

    public Team processMatch(){
        return winner;
    }

    public void addGoalScore(){

    }

    @Override
    public String toString() {
        return "Match{" +
                "startTime='" + startTime + '\'' +
                ", TeamAScore=" + TeamAScore +
                ", TeamBScore=" + TeamBScore +
                ", matchDuration=" + matchDuration +
                '}';
    }
}
