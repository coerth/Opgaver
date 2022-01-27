import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class LootTable implements LootTableInterface {

    private final String name;
    private ArrayList<TableEntry> tableEntries = new ArrayList<>();
    private final String category;


    public LootTable(String lootTableName, String category) {
        this.name = lootTableName;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<TableEntry> getTableEntries() {
        return tableEntries;
    }

    public void addTableEntry (int rollValue, String text)
    {
        tableEntries.add(new TableEntry(rollValue,text));
    }
}
