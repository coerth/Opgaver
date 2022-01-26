import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SimpleLootTable extends LootTable {

    private ArrayList<TableEntry> tableEntries = new ArrayList<>();

    public SimpleLootTable(String lootTableName, String category) {
        super(lootTableName, category);
    }

    public void insertTableEntry(String s)
    {
        tableEntries.add(new TableEntry(s));
    }

    public String rollOnTable()
    {
        Random rand = new Random();
        int i = rand.nextInt(1, tableEntries.size()+1);


        return tableEntries.get(i).getText();
    }

    public ArrayList<TableEntry> getTableEntries() {
        return tableEntries;
    }

}
