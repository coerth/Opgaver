import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UI {

    public void displayText(String s)
    {
        System.out.println(s);
    }

    public String userInput()
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim().toLowerCase(Locale.ROOT);

        return s;
    }

    public LootTable displayLootTables(ArrayList<LootTable> lootTableArrayList)
    {
        int i = 1;
        int userChoice = 0;

        displayText("Please choose the preferred loottable \n");

        for(LootTable lt : lootTableArrayList)
        {
            displayText(i + ": " + lt.getName() + ".");
            i++;
        }

        try
        {
            userChoice = Integer.parseInt(userInput());
        }
        catch (InputMismatchException e)
        {
            displayText("The input was not possible, please choose again.");
            displayLootTables(lootTableArrayList);
        }

        if(userChoice > lootTableArrayList.size() || userChoice <= 0)
        {
            displayText("The number inputted could not be matched, please choose again");
            displayLootTables(lootTableArrayList);
        }

        return lootTableArrayList.get(userChoice-1);

    }

    public void displayLootTable(LootTable lootTable)
    {
        int j = 1;
        int minValue = 1;


            for(int i = 0 ; i < lootTable.getTableEntries().size(); i++)
            {


                if(lootTable.getTableEntries().get(i) == null)
                {
                    continue;
                }
                if(lootTable instanceof WeightedLootTable)
                {
                    if(i == 0)
                    {
                        displayText(minValue +"-"+ lootTable.getTableEntries().get(i).getRollValue()+": "+ lootTable.getTableEntries().get(i).getText());
                        minValue = lootTable.getTableEntries().get(i).getRollValue();
                    }
                    else
                    {
                        displayText(minValue+1 +"-"+ lootTable.getTableEntries().get(i).getRollValue()+": "+ lootTable.getTableEntries().get(i).getText());
                        minValue = lootTable.getTableEntries().get(i).getRollValue();
                    }
                }
                else
                {
                    displayText(j+": "+lootTable.getTableEntries().get(i).getText());
                    j++;
                }
            }


    }

    public int userInputYesNoOption(String s)
    {
        int userChoice = -1;
        String userInput = null;

        displayText("\n"+s);
        displayText("\nYes / No ? \n");

        while (userChoice == -1)
        {
            userInput = userInput().toLowerCase(Locale.ROOT).trim();

            if(userInput.equals("yes") || userInput.equals("y"))
            {
                userChoice = 1;
            }
            else if(userInput.equals("no") || userInput.equals("n"))
            {
                userChoice = 0;
            }

            if(userChoice != -1)
            {
                break;
            }

            displayText("Please enter a valid option.");
        }


        return userChoice;
    }
}
