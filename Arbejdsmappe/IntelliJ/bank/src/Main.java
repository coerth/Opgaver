import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //static BankAccount[] accounts = new BankAccount[3];

    static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public static void main(String [] arg){
        readGameData();

        /*
        UI ui = new UI();
        ui.createAccounts();
        ui.manageAccount();


         */
        //tester hvad der står på egons konto
        for(BankAccount konto : accounts){
            System.out.println(konto);
        }
    }

    private static void readGameData() {
        File file = new File("src/data.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNextLine()){
           String[] values =  scan.nextLine().split(":");
           float converted_float  = Float.parseFloat(values[1]) ;
           BankAccount account = new BankAccount(values[0],converted_float);
           accounts.add(account);




    }
    }
/*
    private static void showMenu() {
        System.out.println("Press Q to quit");
        System.out.println("Press C to create Bank Account");
        System.out.println("Press T to do transaction");
    }

 */

}