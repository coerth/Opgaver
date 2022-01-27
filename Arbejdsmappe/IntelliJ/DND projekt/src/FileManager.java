import java.io.*;
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

    @Override
    public LootTable readLootTableContents(String name, String category, boolean isWeighted, int id) throws FileNotFoundException {
        return null;
    }



    private LootTable importLootTable(String[] values) throws FileNotFoundException
    {
        LootTable lootTable = new SimpleLootTable(values[0], values[1]);
        File lootTableFile = new File("src/LootTables/"+values[0]+".txt");
        Scanner scan = new Scanner(lootTableFile);

        while(scan.hasNextLine())
        {
           // lootTable.addTableEntry(values[0], values[1]);
        }


        return lootTable;
    }

    public void convertLootTableListToSQL(int startingID) throws IOException {
        File file = new File("src/LootTables/LootTables.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
        {
            String[] values = scan.nextLine().trim().split(",");
            writeLootTable(values[0], Boolean.parseBoolean(values[1]), Integer.parseInt(values[2]), startingID);
            startingID++;
        }
    }


    public void writeLootTable(String name, boolean isweighted, int category, int lootTableID) throws IOException {
        FileWriter writer = new FileWriter("src/loottables/convertedsqltables/"+name+".txt");
        File file = new File("src/loottables/"+name+".txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner scan = new Scanner(file);

        buffer.write(sqlLootTableWrapper("\""+name+"\"",isweighted,category)+";");
        buffer.newLine();
        buffer.newLine();
        while(scan.hasNextLine())
        {

            if(isweighted)
            {
                String[] valueArray = scan.nextLine().trim().split(",");
                buffer.write(sqlEntryWrapper(Integer.parseInt(valueArray[0]), "\""+valueArray[1].trim()+"\"", lootTableID)+";");
                buffer.newLine();
            }
            else
            {
                buffer.write(sqlEntryWrapper("\""+scan.nextLine().trim()+"\"", lootTableID)+";");
                buffer.newLine();
            }
        }
        buffer.close();
        System.out.println("Success");
    }

    private String sqlLootTableWrapper(String name, boolean isweighted, int category)
    {
        return "INSERT INTO loottable(loottable_name, loottable_weighted, category_id) VALUES("+name+", "+isweighted+", "+category+")";
    }

    private String sqlEntryWrapper(int rollValue, String s, int lootTableID)
    {
        return "INSERT INTO entrytable(entrytable_text, entrytable_rollvalue, loottable_id) VALUES("+s+", "+rollValue+", "+lootTableID+")";
    }

    private String sqlEntryWrapper(String s, int lootTableID)
    {
        return "INSERT INTO entrytable(entrytable_text, loottable_id) VALUES("+s+", "+lootTableID+")";
    }
}
