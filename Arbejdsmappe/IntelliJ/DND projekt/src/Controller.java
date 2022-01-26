import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {

    private ArrayList<LootTable> list = new ArrayList<>();
    private FileManager fileManager = new FileManager();
    private UI ui = new UI();



    public Controller()
    {

        try
        {
            this.list = fileManager.readLootTables();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public void addLootTableToList(LootTable lootTable)
    {
        list.add(lootTable);
    }

    public LootTable getLootTable(String s)
    {
        for(LootTable lootTable : list)
        {
            if (lootTable.getName().equals(s))
            {
                return lootTable;
            }
        }

        return null;
    }

    public void startOptions()
    {
       int userChoice = -1;

        LootTable lootTable = ui.displayLootTables(list);
        ui.displayLootTable(lootTable);

        userChoice = ui.userInputYesNoOption("Would you like to roll on the table?");

        if(userChoice == 1)
        {
            ui.displayText(lootTable.rollOnTable());
        }
        else
        {
           userChoice = ui.userInputYesNoOption("Would you like to return to the main list?");

           if(userChoice == 1)
           {
               startOptions();
           }

        }

    }

    public ArrayList<LootTable> getList() {
        return list;
    }

}
