package com.company;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static ArrayList<BankAccount> BankAccountArray = new ArrayList<BankAccount>();
    public static ArrayList<String> transactionsList = new ArrayList<String>();
    public static ArrayList<String> namesinputted = new ArrayList<String>();

    public static void main(String[] args) {
        Bank BankOperations = new Bank();

        BankOperations.bankMenu();

    }


                                                                                                                         //funktion for vores kontonavne
    public static String userInput(String msg){
        System.out.println(msg);
        Scanner scanUserInput = new Scanner(System.in);
        String input = scanUserInput.nextLine();

        return input;
    }

    public static void showMenu() {

        String choice;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Skriv Q for at afslutte.");
            System.out.println("Skriv Opret for at oprette kontoer.");
            System.out.println("Skriv Vis for at få vist en eller flere kontoer.");
            System.out.println("Skriv Slet for at slette kontoer.");
            System.out.println("Skriv Trans for at lave transaktioner.");
            System.out.println("Skriv Historik for at se transaktion historikken.");
            choice = scanner.next().toLowerCase(Locale.ROOT) ;

            if(choice.equals("Opret") || choice.equals("opret") ){
                createAccounts();
            } //if opret klemme

            if(choice.equals("Slet") || choice.equals("slet") ){
                //choice = deleteAccounts(choice);
            } // if slet klemme

            if(choice.equals("Trans") || choice.equals("trans") ) {
                float money;
                System.out.println("Skriv navnet på kontoens ejer som skal sende penge:");                              //den som skal sende pengene
                Scanner scan = new Scanner(System.in);
                namesinputted.add(scan.nextLine() );
                System.out.println("Skriv navnet på kontoens ejer som skal modtage penge:");                            //den som skal modtage pengene
                namesinputted.add(scan.nextLine() );
                System.out.println("Skriv beløbet");
                money = Float.parseFloat((scan.nextLine() ) );

                moveMoney(money, namesinputted.get(0), namesinputted.get(1));                                             //kør funktionen moveMoney, den første plads i arrayet er altid hvor pengene kommer fra og den næste er den som modtager
                namesinputted.clear();                                                                                   //clear arraylisten med søgenavne så den ikke bliver evigt større
            } // trans klemme

                                                                                                                        //if statements hvis man skriver vis, har endnu en Do-While loop så man kan skrive flere navne
            if(choice.equals("Vis") || choice.equals("vis") ) {
                do{
                    if(namesinputted.size() == 0){
                        System.out.println("Skriv navnet på kontoens ejer:");
                        Scanner scan = new Scanner(System.in);
                        namesinputted.add(scan.nextLine() );
                        System.out.println("Navnet er tilføjet til søgningen.");
                    } //if klemme
                    else{
                        System.out.println("Skriv endnu et navn eller skriv søg for at søge");
                        Scanner scan = new Scanner(System.in);
                        choice = scan.nextLine();
                        namesinputted.add(choice);
                        System.out.println("Navnet er tilføjet til søgningen.");
                    } // else klemme
                }while(!choice.equals("søg") );
                                                                                                                        // for hvert objekt i arraylisten, gør metoden searchName som kigger om det inputtet navn svarer til owner navnet
                for(String names : namesinputted){
                    searchName(names);
                }
                namesinputted.clear();                                                                                   //clear arraylisten med søgenavne så den ikke bliver evigt større
            } //if vis klemme

            if(choice.equals("Historik") || choice.equals("historik") ) {
                for(String historik : transactionsList){
                    System.out.println(historik);
                }
            }

        }while (!choice.equals("q"));
        System.out.println("Afslutter...");
    } // showMenu klemme
/*
    private static void deleteAccounts() {
        do{
            if(namesinputted.size() == 0){
                System.out.println("Skriv navnet på kontoens ejer:");
                Scanner scan = new Scanner(System.in);
                namesinputted.add(scan.nextLine() );
                System.out.println("Navnet er tilføjet til sletningen.");
            } //if klemme
            else{
                System.out.println("Skriv endnu et navn eller skriv bekræft sletning for at slette");
                Scanner scan = new Scanner(System.in);
                choice = scan.nextLine();
                namesinputted.add(choice);
                System.out.println("Navnet er tilføjet til sletningen.");
            } // else klemme
        }while(!choice.equals("bekræft sletning") );
        for(String names : namesinputted){
            confirmedDeleteAccount(names);
        } //for klemme
        namesinputted.clear();
        return choice;
    }

 */

    private static void createAccounts() {
        System.out.println("Hvor mange kontoer skal oprettes?");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        //indtil i når til antal input, gør følgende
        for (int i = 0; i < input; i++ ){
            BankAccountArray.add(new BankAccount(userInput("Skriv dit navn:"), userInput("Navn på kontoen"),
                    Float.parseFloat(userInput("Skriv dit kontobeløb:") ) ) );
        } //bank oprettelse klemme
        //for hvert objekt i arrayet, print følgende ud
        for (BankAccount BA : BankAccountArray){
            System.out.println(BA);
        } //bank print klemme
        if(input > 1) {
            System.out.println("Der er oprettet " + input + " kontoer."+"\n");
        }//if klemme
        else{
            System.out.println("Der er oprettet " + input + " konto."+"\n");
        } //else klemme
    }


    //funktion for vores kontonavne
    public static String accountName(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String inputName = scan.nextLine();

        return inputName;
    }

    private static void searchName(String owner){                                                                         //funktion for at lede BankAccountArray igennem for navne
        for(BankAccount BA : BankAccountArray){
            if(BA.getOwner().equals(owner)){
                System.out.println("vi har fundet følgende konto" + "\n" + BA);
            }
        }

    } //searchName klemme

    private static void confirmedDeleteAccount(String owner){                                                                     //funktion for at lede BankAccountArray igennem og slette det objekt som har samme navn som owner
       //int accountsDeleted = 0;
        for(int i = 0 ; i < BankAccountArray.size(); i++){
            if(BankAccountArray.get(i).getOwner().equals(owner)){
                BankAccountArray.remove(i);
                //accountsDeleted++;
                System.out.println("Vi har slettet " + owner + "s Konto"+"\n");
            }
        }
        //System.out.println("vi har slettet "+accountsDeleted+" kontoer");
    } //deleteAccount klemme

    private static void moveMoney(float money, String fromAccount, String toAccount){
        for(BankAccount BA : BankAccountArray) {
            if (BA.getOwner().equals(fromAccount)) {
                BA.doTransaction(-money);
            }
            if (BA.getOwner().equals(toAccount)) {
                BA.doTransaction(money);
            }

        }

        System.out.println(money + "kr. er flyttet fra " + fromAccount + "s konto til "
                                                            + toAccount + "s konto."+"\n");
        transactionsList.add(new String (money+"kr. er flyttet fra " + fromAccount + "s konto til "
                + toAccount + "s konto."+"\n"));

    } //moveMoney klemme

                                                                                                                        //funktion for vores kontobeløb

} //main klemme







    /*

public static float accountBalance(String msg){
        System.out.println(msg);
        Scanner scan1 = new Scanner(System.in);
        //float inputBalance = scan1.nextFloat();   //giver fejl selvom det er float
        String inputBalance = scan1.nextLine();

        //return inputBalance;                      //giver fejl selvom det er float
        return Float.parseFloat(inputBalance);      //skal parse til float før at det virker
    }

/*


        /*
        String choice;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Press Q for Quit");
            System.out.println("Press A for creating a new bankaccount");
            choice = scanner.next();

            if(choice.equals("A")) {

            }


        }while (!choice.equals("Q"));
        System.out.println("Quitting...");

         */

    //Lav 3 BankAccount objekter
	//BankAccount a1 = new BankAccount(accountName(), accountBalance() );
   //BankAccount a2 = new BankAccount("Kjeld");
   // BankAccount a3 = new BankAccount("Egon");

    //indsæt penge på Bennys konto
    //a1.doTransaction(3400.41f);

    //prøv den "nye" toString funktion
    //System.out.println(a1);

    //brug getBalance funktionen tjekke kontoen
    //System.out.println(a1.getBalance() );
    //System.out.println(a2.getBalance() );
   // System.out.println(a3.getBalance() );

    //tjek Kjelds konto endnu en gang
   // a2.getBalance();

    //tjek Egons konto to ekstra gange
   // a3.getBalance();
   // a3.getBalance();

    //print via toString metoden igen for at tjekke stalkingCounter.
    //System.out.println(a1);
    //System.out.println(a2);
   // System.out.println(a3);


    //start med at skrive hvad brugeren skal gøre
/*
        System.out.println("Skriv dit navn");

    //sådan skal en ny scanner laves
    Scanner scan = new Scanner(System.in);

    //laves et String variable der hedder input som svarer til scannerens scan.nextLine()
    String input = scan.nextLine();

    //print input ud så vi kan se det.
    System.out.println("Hej "+input);

     */




    /*
    //kan skrive random og så alt + enter for at importere det
    public static void guessNumber(){
        Random random = new Random();
        int magicNumber = random.nextInt(100);

        System.out.println("Gæt hvad jeg tænker på");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input == magicNumber){
            System.out.println("Spot on");
        }
        else{
            System.out.println("Wrong");
        }

     */
