import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static Controller controller = new Controller();
    public static void main(String[] args) {
        controller.setConnection();
        UI ui = new UI();
        try {
            controller.loadTournaments();
        } catch (FileNotFoundException e) {
            System.out.println("No tournaments, please create one.");
            ui.menuTournament(controller);
        }

        ui.showMenu(controller);

    }
}
