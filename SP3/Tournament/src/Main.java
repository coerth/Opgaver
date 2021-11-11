import java.io.FileNotFoundException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static Controller controller = new Controller();
    public static void main(String[] args) {
        LocalDateTime matchStartTime;

        matchStartTime = LocalDateTime.of(2022, 01, 05, 13, 30);
        String p = String.valueOf(matchStartTime);
        System.out.println(p);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = matchStartTime.format(myFormatObj);


        System.out.println(formattedDate);
        try {
            controller.loadTournaments();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i = 1; i <= controller.getTournaments().size(); i++){
            controller.loadTeamsToTournament(i);
        }
        /*controller.createTournament("WorldCupFuusball", "01/01/2022", false);
        controller.loadTeamsToTournament("WorldCupFuusball");
        controller.postTeamsFromTournament("WorldCupFuusball");
        //controller.getTournament("WorldCupFuusball").createTeam();
        KnockOutTournament KO = (KnockOutTournament) controller.getTournament("WorldCupFuusball");
        KO.createBracket();
        KO.runBracket();

        for(Tournament t : controller.getTournaments()){
            if(t instanceof KnockOutTournament){
                ((KnockOutTournament) t).runBracket();
            }
        }*/
        UI ui = new UI();
        ui.showMenu(controller);
    }

}
