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


        return super.getTableEntries().get(i).getText();
    }


}
