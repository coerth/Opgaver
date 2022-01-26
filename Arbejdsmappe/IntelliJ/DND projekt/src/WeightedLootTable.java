import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class WeightedLootTable extends LootTable {

    private ArrayList<TableEntry> tableEntries = new ArrayList<>();

    public WeightedLootTable(String lootTableName, String category) {
        super(lootTableName, category);
    }


    public void insertTableEntry(int rollValue, String s) {

        tableEntries.add(new TableEntry(rollValue, s));

    }

    @Override
    public String rollOnTable() {
        String returnString = null;
        Random rand = new Random();
        Integer i = rand.nextInt(1, 100 + 1);

        for (int j = 0; j < tableEntries.size(); j++) {

            if (j == 0 && i <= tableEntries.get(j).getRollValue()) {
                returnString = tableEntries.get(j).getText();
            } else {
                if (i <= tableEntries.get(j).getRollValue() && i > tableEntries.get(j - 1).getRollValue()) {
                    returnString = tableEntries.get(j).getText();
                }
            }

        }

        return returnString;
    }
}