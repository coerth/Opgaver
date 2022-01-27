import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class WeightedLootTable extends LootTable {



    public WeightedLootTable(String lootTableName, String category)
    {
        super(lootTableName, category);
    }

    @Override
    public String rollOnTable() {
        //String returnString = null;
        Random rand = new Random();
        Integer i = rand.nextInt(1, 100 + 1);

        System.out.println(i);

        for(int j = 0 ; j < super.getTableEntries().size() ; j ++)
        {
            if (j == 0)
            {
                if(i <= super.getTableEntries().get(j).getRollValue())
                {
                    return super.getTableEntries().get(j).getText();
                }

            }
            else
            {
                if(i <= super.getTableEntries().get(j).getRollValue() && i > super.getTableEntries().get(j-1).getRollValue())
                {
                  return super.getTableEntries().get(j).getText();

                }

            }
        }

        return "What";
    }
}