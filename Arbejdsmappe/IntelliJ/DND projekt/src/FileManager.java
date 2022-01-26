import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager implements IO{

    @Override
    public ArrayList<LootTable> readLootTables() throws FileNotFoundException {
        ArrayList<LootTable> list = new ArrayList<>();
        File file = new File("src/LootTables/LootTables.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
        {
            String[] values = scan.nextLine().split(",");
            list.add(importLootTable(values));
        }

        return list;
    }

    private LootTable importLootTable(String[] values) throws FileNotFoundException
    {
        LootTable lootTable = new SimpleLootTable(values[0], values[1]);
        File lootTableFile = new File("src/LootTables/"+values[0]+".txt");
        Scanner scan = new Scanner(lootTableFile);

        while(scan.hasNextLine())
        {
            ((SimpleLootTable)lootTable).insertTableEntry(scan.nextLine());
        }


        return lootTable;
    }

    @Override
    public void writeLootTable() {

    }
}
