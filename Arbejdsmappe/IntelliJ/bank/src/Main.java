import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //static BankAccount[] accounts = new BankAccount[3];

    //static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    static ArrayList<Player> players = new ArrayList<Player>();
    static int MAX = 6;

    public static void main(String [] arg){
        UI ui = new UI();

        try{
         readGameData();

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            ui.createAccounts();
           // ui.manageAccount();

        }

        Board board = new Board();
        //todo: call gameloop(w. while)
        saveGameData();

        //tester hvad der står på samtlige konti <- Denis
        printAccounts();


        }





    private static void readGameData() throws FileNotFoundException {
        File file = new File("src/data.txt");
        Scanner scan = null;

            scan = new Scanner(file);


        while(scan.hasNextLine()){
           String[] values =  scan.nextLine().split(":");
           int converted_int  = Integer.parseInt(values[1]);
           Player p = new Player(values[0],converted_int);
         //  BankAccount account = new BankAccount(values[0],converted_float);
           players.add(p);




    }
    }

    public static void printAccounts() {
        for(Player a : Main.players){
            System.out.println(a);
        }
    }
/*
    private static void showMenu() {
        System.out.println("Press Q to quit");
        System.out.println("Press C to create Bank Account");
        System.out.println("Press T to do transaction");
    }

 */
    public static void saveGameData(){
        String gameData = "";
        try {
            FileWriter writer = new FileWriter(("src/data.txt"));
            for (Player a : players) {
                gameData += a;
            }
            writer.write(gameData);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}