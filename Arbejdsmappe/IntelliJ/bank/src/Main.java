import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //static BankAccount[] accounts = new BankAccount[3];

    static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    static int MAX = 6;

    public static void main(String [] arg){
        try{
         readGameData();

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            UI ui = new UI();
            ui.createAccounts();
           // ui.manageAccount();

        }
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
           float converted_float  = Float.parseFloat(values[1]) ;
           BankAccount account = new BankAccount(values[0],converted_float);
           accounts.add(account);




    }
    }

    public static void printAccounts() {
        for(BankAccount a : Main.accounts){
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
            for (BankAccount a : accounts) {
                gameData += a;
            }
            writer.write(gameData);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}