import java.util.ArrayList;

public class Bracket {
    private BracketView bracketView = new BracketView();
    private Match[] finals = new Match[1];
    private Match[] semiFinal = new Match[2];
    private Match[] quarterFinal = new Match[4];
    private Match[] preliminaryFinal = new Match[8];
    private boolean isFixedDuration;

    public Bracket(boolean isFixedDuration){
        this.isFixedDuration = isFixedDuration;
    }

    public Team processBracket() {
        processPreliminaryFinal();
        processQuarterFinal();
        processSemiFinal();

       return processFinal();
    }

    public BracketView getBracketView() {
        return bracketView;
    }

    public void createFinal(Team[] teams) {

        if(isFixedDuration){
            finals[0] = new TimedMatch(teams[0], teams[1]);
        }
        else {
            finals[0] = new Match(teams[0], teams[1]);
        }
    }

    public Team processFinal() {
        Team tournamentWinner;
        finals[0].processMatch();
        tournamentWinner = finals[0].getWinner();
        bracketView.setTourWinner(tournamentWinner.getName());

        displayBracket();
        return tournamentWinner;
    }

    public void createSemiFinal(Team[] teams) {
        int i = 0;
        int j = 1;

        if(isFixedDuration){
            for (int k = 0; k < semiFinal.length; k++) {
                semiFinal[k] = new TimedMatch(teams[i], teams[j]);
                i += 2;
                j += 2;
            }
        } else {
            for (int k = 0; k < semiFinal.length; k++) {
                semiFinal[k] = new Match(teams[i], teams[j]);
                i += 2;
                j += 2;
            }
        }
    }

    public void processSemiFinal() {
        Team[] teams = new Team[2];
        int i = 0;

        for (Match match : semiFinal) {
            match.processMatch();
            teams[i] = match.getWinner();
            i++;
        }

        createFinal(teams);
        announceBracket(finals);
        displayBracket();
    }

    public void createQuarterFinal(Team[] teams) {
        int i = 0;
        int j = 1;

        if (isFixedDuration) {
            for (int k = 0; k < quarterFinal.length; k++) {
                quarterFinal[k] = new TimedMatch(teams[i], teams[j]);
                i += 2;
                j += 2;
            }
        } else {
            for (int k = 0; k < quarterFinal.length; k++) {
                quarterFinal[k] = new Match(teams[i], teams[j]);
                i += 2;
                j += 2;
            }
        }
    }

    public void processQuarterFinal() {
        Team[] teams = new Team[4];
        int i = 0;

        for (Match match : quarterFinal) {
            match.processMatch();
            teams[i] = match.getWinner();
            i++;
        }

        createSemiFinal(teams);
        announceBracket(semiFinal);
        displayBracket();

    }

    public void createPreliminaryFinal(ArrayList<Team> teams) {
        int i = 0;
        int j = 1;

        if(isFixedDuration){
            for (int k = 0; k < preliminaryFinal.length; k++) {
                preliminaryFinal[k] = new TimedMatch(teams.get(i), teams.get(j));
                i += 2;
                j += 2;
            }
        }
        else {
            for (int k = 0; k < preliminaryFinal.length; k++) {
                preliminaryFinal[k] = new Match(teams.get(i), teams.get(j));
                i += 2;
                j += 2;
            }
        }

        announceBracket(preliminaryFinal);
        displayBracket();
    }
    public void processPreliminaryFinal() {
        Team[] teams = new Team[8];
        int i = 0;

        displayBracket();

        for (Match match : preliminaryFinal) {
            match.processMatch();
            teams[i] = match.getWinner();
            i++;
        }

        createQuarterFinal(teams);
        announceBracket(quarterFinal);
        displayBracket();
    }

    public Match[] getFinals() {
        return finals;
    }

    public Match[] getSemiFinal() {
        return semiFinal;
    }

    public Match[] getQuarterFinal() {
        return quarterFinal;
    }

    public Match[] getPreliminaryFinal() {
        return preliminaryFinal;
    }


    public void announceMatches(Match[] matchArray) {
        for (Match match : matchArray) {
            System.out.println(match);
        }
    }

    public void announceMessage(String announcement) {

        System.out.println(announcement);
    }


    public void announceBracket(Match[] matchArray) {
        if (matchArray.length == 8) {
            announceMessage("This is the Prelinimaryfinals" +"\n"+ "Following teams should get ready. . . ");
            announceMatches(matchArray);
        } else if (matchArray.length == 4) {
            announceMessage("This is the Quarterfinals" +"\n"+ "Following teams should get ready. . .");
            announceMatches(matchArray);

        } else if (matchArray.length == 2) {
            announceMessage("This is the Semifinals" +"\n"+ "Following teams should get ready. . .");
            announceMatches(matchArray);
        } else {
            announceMessage("This is the FINALS" +"\n"+ "Following teams should get ready. . . READY SET GO");
           announceMatches(matchArray);
        }
    }

    public ArrayList<Match[]> exportBracketToView(){
        ArrayList<Match[]> bracketArrayList = new ArrayList<>();
        bracketArrayList.add(preliminaryFinal);
        bracketArrayList.add(quarterFinal);
        bracketArrayList.add(semiFinal);
        bracketArrayList.add(finals);



        return bracketArrayList;
    }

    public void displayBracket(){
        bracketView.loadTeamsIntoView(exportBracketToView());
        bracketView.showBracketView();
    }

}


