import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class SimpleLootTable extends LootTable {



    public SimpleLootTable(String lootTableName, String category) {
        super(lootTableName, category);
    }



    public String rollOnTable()
    {
        Random rand = new Random();
        int i = rand.nextInt(1, super.getTableEntries().size()+1);


        return i+": "+super.getTableEntries().get(i-1).getText();
    }

    @Override
    public String[] rollOnTable(int amount) {
        Random rand = new Random();
        String[] strings = new String[amount];


        for(int j = 0; j < amount; j++)
        {
            int i = rand.nextInt(1, super.getTableEntries().size()+1);
            strings[j] = i+": "+super.getTableEntries().get(i-1).getText();
        }

        return strings;
    }


}
