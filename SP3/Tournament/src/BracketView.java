import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class BracketView {

    private String[] preliminaryTeamNames = new String[16];
    private String[] quarterFinalTeamNames = new String[8];
    private String[] semiFinalTeamNames = new String[4];
    private String[] finalTeamNames = new String[2];
    private String tourWinner = "    TBD   ";
    private String tournamentName;
    private LocalDateTime startDate;
    private String formattedStartDate;




    public void setStartDate(LocalDateTime startDate){

        this.startDate = startDate;
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.formattedStartDate = startDate.format(myFormatObj);
    }


    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public void setTourWinner(String tourWinner) {
        try {
            this.tourWinner = tourWinner;
        }catch (NullPointerException e){
            this.tourWinner = "    TBD   ";
        }

    }



    public void loadTeamsIntoView(ArrayList<Match[]> matchArrayList){
//    ArrayList<String> teamsPreliminary = new ArrayList<>();

    loadPreliminaryTeamsIntoView(matchArrayList);
    loadQuarterFinalTeamsIntoView(matchArrayList);
    loadSemiFinalTeamsIntoView(matchArrayList);
    loadFinalTeamsIntoView(matchArrayList);

}

public void loadPreliminaryTeamsIntoView(ArrayList<Match[]> matchArrayList){

    int i = 0;
    int j = 1;

    for(Match match : matchArrayList.get(0)){
        try {
            preliminaryTeamNames[i] = match.getTeams()[0].getName();
        }
        catch(NullPointerException e){
            preliminaryTeamNames[i] = "    TBD   ";
        }

        try {
            preliminaryTeamNames[j] = match.getTeams()[1].getName();
        }
        catch(NullPointerException e){
            preliminaryTeamNames[j] = "    TBD   ";
        }

        i += 2;
        j += 2;
    }
}

public void loadQuarterFinalTeamsIntoView(ArrayList<Match[]> matchArrayList){

    int i = 0;
    int j = 1;

    for(Match match : matchArrayList.get(1)){
        try {
            quarterFinalTeamNames[i] = match.getTeams()[0].getName();
        }
        catch(NullPointerException e){
            quarterFinalTeamNames[i] = "    TBD   ";
        }

        try {
            quarterFinalTeamNames[j] = match.getTeams()[1].getName();
        }
        catch(NullPointerException e){
            quarterFinalTeamNames[j] = "    TBD   ";
        }

        i += 2;
        j += 2;
    }
}

public void loadSemiFinalTeamsIntoView(ArrayList<Match[]> matchArrayList){

    int i = 0;
    int j = 1;

    for(Match match : matchArrayList.get(2)){
        try {
            semiFinalTeamNames[i] = match.getTeams()[0].getName();
        }
        catch(NullPointerException e){
            semiFinalTeamNames[i] = "    TBD   ";
        }

        try {
            semiFinalTeamNames[j] = match.getTeams()[1].getName();
        }
        catch(NullPointerException e){
            semiFinalTeamNames[j] = "    TBD   ";
        }

        i += 2;
        j += 2;
    }
}

public void loadFinalTeamsIntoView(ArrayList<Match[]> matchArrayList){

    int i = 0;
    int j = 1;

    for(Match match : matchArrayList.get(3)){
        try {
            finalTeamNames[i] = match.getTeams()[0].getName();
        }
        catch(NullPointerException e){
            finalTeamNames[i] = "TBD   ";
        }

        try {
            finalTeamNames[j] = match.getTeams()[1].getName();
        }
        catch(NullPointerException e){
            finalTeamNames[j] = "    TBD   ";
        }

        i += 2;
        j += 2;
    }
}

public void showBracketView(){
    System.out.println("                                                                                                                     "+ tourWinner);
    System.out.println("                                                             _________________________________________________________________________________________________________________________________");
    System.out.println("                                                             |                                                                                                                               |");
    System.out.println("                                                             |                                                                                                                               |");
    System.out.println("                                                                                                    ");
    System.out.println("                                                             |                                                                                                                               |");
    System.out.println("                                                             |                                                                                                                               |");
    System.out.println("                                                        "+finalTeamNames[0] +"                                                                                                                      " +finalTeamNames[1]);
    System.out.println("                               _________________________________________________________________                                                             ___________________________________________________________________");
    System.out.println("                               |                                                               |                                                             |                                                                 |");
    System.out.println("                               |                                                               |                                                             |                                                                 |");
    System.out.println("                                                                                                  "+ tournamentName+ " takes place at CPH business at " + formattedStartDate);
    System.out.println("                               |                                                               |                                                             |                                                                 |");
    System.out.println("                               |                                                               |                                                             |                                                                 |");
    System.out.println("                          "+semiFinalTeamNames[0] +"                                                      " + semiFinalTeamNames[1] +"                                                    "+ semiFinalTeamNames[2] +"                                                        " +semiFinalTeamNames[3]);
    System.out.println("              _________________________________                               _________________________________                               _________________________________                               _________________________________");
    System.out.println("              |                               |                               |                               |                               |                               |                               |                               |");
    System.out.println("              |                               |                               |                               |                               |                               |                               |                               |");
    System.out.println("                                                                                                ");
    System.out.println("              |                               |                               |                               |                               |                               |                               |                               |");
    System.out.println("              |                               |                               |                               |                               |                               |                               |                               |");
    System.out.println("         "+ quarterFinalTeamNames[0]+"                      " +quarterFinalTeamNames[1]+"                      "+ quarterFinalTeamNames[2] +"                      "+ quarterFinalTeamNames[3] +"                      " + quarterFinalTeamNames[4] +"                      " + quarterFinalTeamNames[5] +"                      " + quarterFinalTeamNames[6]  +"                      "+ quarterFinalTeamNames[7]);
    System.out.println("     __________________              __________________              __________________              __________________              __________________              __________________              __________________              __________________");
    System.out.println("     |                |              |                |              |                |              |                |              |                |              |                |              |                |              |                |");
    System.out.println("     |                |              |                |              |                |              |                |              |                |              |                |              |                |              |                |");
    System.out.println("                                                                                            ");
    System.out.println("     |                |              |                |              |                |              |                |              |                |              |                |              |                |              |                |");
    System.out.println("     |                |              |                |              |                |              |                |              |                |              |                |              |                |              |                |");
    System.out.println(preliminaryTeamNames[0]+"       "+preliminaryTeamNames[1]+"     "+preliminaryTeamNames[2]+"       " +preliminaryTeamNames[3]+"     " +preliminaryTeamNames[4] +"       " +preliminaryTeamNames[5] +"     " + preliminaryTeamNames[6] +"       " + preliminaryTeamNames[7] +"     " +preliminaryTeamNames[8] +"       "+preliminaryTeamNames[9]+"     "  +preliminaryTeamNames[10]+"       "+preliminaryTeamNames[11]+"     " +preliminaryTeamNames[12] +"       "+ preliminaryTeamNames[13] +"     "  + preliminaryTeamNames[14]  +"       " + preliminaryTeamNames[15]);
    System.out.println("__________   -   __________     __________   -   __________     __________   -   __________     __________   -   __________     __________   -   __________     __________   -   __________     __________   -   __________     __________   -   __________");

}
}




