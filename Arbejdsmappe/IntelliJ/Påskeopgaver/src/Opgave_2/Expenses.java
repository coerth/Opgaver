package Opgave_2;

public class Expenses {

    public void calculateExpenses(int userNumber){
        float yearlyRate = 1.07f;
        float convertedUserNumber = userNumber;
        int yearCounter = 0;
        float sum = userNumber;

        do{
           sum = sum * yearlyRate;
           yearCounter++;

            System.out.println("Sum er: " + sum + " og år er: " + yearCounter);

        }while (sum <= userNumber*2);
        System.out.println("Prisen for at leje er nu: " + sum + " og det tog: " + yearCounter + " år.");
    }
}
