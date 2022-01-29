import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private ArrayList<LootTable> list = new ArrayList<>();
    private FileManager fileManager = new FileManager();
    private DBConnector dbConnector = new DBConnector();
    private UI ui = new UI();



    public Controller()
    {

        try
        {
            this.list = dbConnector.readLootTables();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public void convertTextFilestoSQLFiles() throws IOException {
        fileManager.convertLootTableListToSQL(list.size()+1);
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
       int userChoice;

        LootTable lootTable = ui.displayLootTables(list);
        ui.displayLootTable(lootTable);

        userChoice = ui.userInputYesNoMultipleOptions("Would you like to roll on the table?");

        while(userChoice != 0)
        {
            if(userChoice > 1)
            {
                ui.displayText(lootTable.rollOnTable(userChoice));
            }
            else
            {
                ui.displayText(lootTable.rollOnTable());
            }

            userChoice = ui.userInputYesNoMultipleOptions("Would you like to roll again on the table?");
        }

        userChoice = ui.userInputYesNoOption("Would you like to return to the main list?");

        if(userChoice == 1)
        {
            startOptions();
        }


    }

    public ArrayList<LootTable> getList() {
        return list;
    }

    public FileManager getFileManager() {
        return fileManager;
    }
}
