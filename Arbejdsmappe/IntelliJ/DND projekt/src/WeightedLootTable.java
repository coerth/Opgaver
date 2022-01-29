import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class WeightedLootTable extends LootTable {


    public WeightedLootTable(String lootTableName, String category) {
        super(lootTableName, category);
    }

    @Override
    public String rollOnTable() {
        //String returnString = null;
        Random rand = new Random();
        int i = rand.nextInt(1, 100 + 1);

        for (int j = 0; j < super.getTableEntries().size(); j++) {
            if (j == 0) {
                if (i <= super.getTableEntries().get(j).getRollValue()) {
                    return i + ": " + super.getTableEntries().get(j).getText();
                }

            } else {
                if (i <= super.getTableEntries().get(j).getRollValue() && i > super.getTableEntries().get(j - 1).getRollValue()) {
                    return i + ": " + super.getTableEntries().get(j).getText();

                }

            }
        }

        return "What";
    }

    @Override
    public String[] rollOnTable(int amount) {
        Random rand = new Random();
        String[] strings = new String[amount];

        for (int k = 0; k < amount; k++) {
            int i = rand.nextInt(1, 100 + 1);

            for (int j = 0; j < super.getTableEntries().size(); j++) {
                if (j == 0) {
                    if (i <= super.getTableEntries().get(j).getRollValue()) {
                        strings[k] = i + ": " + super.getTableEntries().get(j).getText();
                    }

                } else {
                    if (i <= super.getTableEntries().get(j).getRollValue() && i > super.getTableEntries().get(j - 1).getRollValue()) {
                        strings[k] = i + ": " + super.getTableEntries().get(j).getText();

                    }

                }
            }
        }

        return strings;
    }
}