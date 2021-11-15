import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class Main {
    //static BankAccount[] accounts = new BankAccount[3];

    //static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    static ArrayList<Player> players = new ArrayList<Player>();
    static int MAX = 6;
    private static Board board;
    private static UI ui;
    private static Player currentPlayer;

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void main(String [] arg){
       ui = new UI();

        try{
         readGameData();

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            ui.createAccounts();
           // ui.manageAccount();
        }

        //byg spilleplade
        String[] fieldsDataArray = readFieldsData();
        board = new Board(fieldsDataArray);
        //todo: call gameloop(w. while)
        saveGameData();

        //tester hvad der står på samtlige konti <- Denis
        printAccounts();
        System.out.println(board.getField(40));

        runLoop();
    }



    public static void setCurrentPlayer(Player currentPlayer) {
        Main.currentPlayer = currentPlayer;
    }

    private static void runLoop(){

        //todo:while
        currentPlayer = players.get(0);
        takeTurn();
    }

    private static void takeTurn() {
        // slå med terninger (Dice)
        int diceValue = board.dice.throwDice();

        // opdatere spillers position (PLAYER)
       int position = currentPlayer.updatePosition(diceValue);

       // få fat i det felt spilleren er landet på
        Field f = board.getField(position);

        // hent besked hos det felt
        String message = f.onLand();

        // startDialog(UI) med den besked felt har returneret, returnerer det brugeren svarer
       String response = ui.startDialog(message);

       f.processResponse(response);

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

    public static String[] readFieldsData(){
        String[] fieldsArray = new String[40];
        File file = new File("src/fields.txt");
        int counter = 0;
    try {
        Scanner scan = null;
            scan = new Scanner(file);
            scan.nextLine(); //ignorer den første linje i filen

        while(scan.hasNextLine()){

            fieldsArray[counter] = scan.nextLine();
            counter++;
        }

        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return fieldsArray;
    }

    public String[] readFieldData(){
        String[] field_data = new String[40];
        Connection conn = null;
        Statement stmt = null;
        try{
            //step 1: open a connection
            conn = DriverManager.getConnection(localhost/Matador, "SQLUser", "Bananflue");

            //Step 2: Create a statement
            stmt = conn.createStatement();
            String sql  ="SELECT * FROM Field";

            //Step 3: execute a query
            ResultSet rs = stmt.executeQuery(sql);

            //Step 4: extract data from result set
            while(rs.next()){
                int id = rs.getInt("field_id");
                String label = rs.getString("field_label");

                field_data[id-1] = field_id+","+field_type+","+field_label+","+field_cost+","+field_income+","+field_seriesid
            }
        }
        catch(SQLException e){

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