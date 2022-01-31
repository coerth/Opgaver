import java.util.Comparator;

public class LootTableComparator implements Comparator<LootTable>
{


    @Override
    public int compare(LootTable o1, LootTable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
