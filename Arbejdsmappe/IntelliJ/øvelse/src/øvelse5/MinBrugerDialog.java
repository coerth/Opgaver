package øvelse5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MinBrugerDialog {

    public void menuValg(ArrayList<String> menu)
    {
        int counter = 1;

        System.out.println("Dagens Menu");
        for(String menuemne : menu)
    {
        System.out.println(counter+": "+menuemne+".\n");
        counter++;
    }
        processUserChoice(menu);
    }

    private void processUserChoice(ArrayList<String> menu)
    {
        int userInput;
        boolean matchFound = false;

            while(!matchFound) {
                System.out.println("Hvad kunne du tænke dig?");
                userInput = brugerValg();

                for (int i = 0; i < menu.size(); i++) {
                    if (userInput - 1 == i) {
                        matchFound = true;
                        break;
                    }
                }
                if (matchFound) {
                    System.out.println("Du har valgt: " + menu.get(userInput - 1) + "\n Bon appetit.");
                    //break;
                } else {
                    System.out.println("Dit valg var ikke på menuen, Prøv igen");
                    //processUserChoice(menu);
                }
            }
    }

    private int brugerValg()
    {
        Scanner scan = new Scanner(System.in);
        int userInput;

        try{
            userInput = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Du skrev ikke et tal, prøv igen");
            userInput = brugerValg();
        }

          return userInput;
    }
}
