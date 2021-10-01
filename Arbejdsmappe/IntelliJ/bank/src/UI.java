import java.util.Scanner;

public class UI {
    static int MAX = 6;
   public void createAccounts(){

       String choice;
       int i = 0;

       while(i < MAX ){
           String input = getUserInput("Hvilken konto? :");
           Main.accounts.add(new BankAccount(input, 30000 ) );
           i++;
       }

   }

    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public void manageAccount() {
        String input = getUserInput("Hvilken konto? :");
        int input_number = Integer.parseInt(input);

        BankAccount account = Main.accounts.get(input_number);
        //BankAccount account = accounts[Integer.parseInt(input)];

        input = getUserInput("Beløb? :");
        try{
            float converted_input = Float.parseFloat(input);
            account.doTransaction(converted_input);
        }catch(NumberFormatException e){
            System.out.println("Det var ikke et tal");
        }
    }

}
