package Opgave_1;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public void runLottery(){
       String result = compareNumbers(playerGuess());

        System.out.println(result);
    }

    public String generateLotteryNumber(){
        int lotteryNumber;
        Random rand = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        lotteryNumber = rand.nextInt(1,100);

        return decimalFormat.format(lotteryNumber);
    }

    public int playerGuess(){
        boolean validNumber = false;
        int userNumber;

        do {
           userNumber = getUserInput("Indtast dit tal mellem 01 og 99");
            if(userNumber > 100 || userNumber < 0){
                System.out.println("Det tal var ikke gyldigt." + "\n" + "Prøv igen");
            }
            else{
                validNumber = true;
            }
        }while(!validNumber);

        return userNumber;
    }

    public int getUserInput(String message){
        int userInput;
        Scanner scan = new Scanner(System.in);

        System.out.println(message);

        userInput = scan.nextInt();

        return userInput;
    }

    public String compareNumbers(int userNumber) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String userNumberCompare;
        String lotteryNumberCompare;

        String result;

        userNumberCompare = decimalFormat.format(userNumber);
        lotteryNumberCompare = generateLotteryNumber();

        if (userNumberCompare.equals(lotteryNumberCompare)) {
            result = "Du ramte helt rigtigt med " + userNumberCompare + " og du vinder derfor 10.000kr!";
        } else if (lotteryNumberCompare.substring(0,1).equals(userNumberCompare.substring(1)) && lotteryNumberCompare.substring(1).equals(userNumberCompare.substring(0,1)) ) {
            result = "Tallet var: " + lotteryNumberCompare + " og du skrev: " + userNumberCompare + " Derfor vinder du 3.000kr";
        } else if (lotteryNumberCompare.contains(userNumberCompare.substring(0, 1)) && !lotteryNumberCompare.contains(userNumberCompare.substring(1,2))) {
            result = "Tallet var: " + lotteryNumberCompare + " og du skrev: " + userNumberCompare + " Derfor vinder du 1.000kr";
        } else if (lotteryNumberCompare.contains(userNumberCompare.substring(1,2)) && !lotteryNumberCompare.contains(userNumberCompare.substring(0, 1))) {
            result = "Tallet var: " + lotteryNumberCompare + " og du skrev: " + userNumberCompare + " Derfor vinder du 1.000kr";
        } else {
            result = "Tallet var: " + lotteryNumberCompare + " og du skrev: " + userNumberCompare + " Du vandt desværre ikke noget";
        }

        return result;
    }
}
