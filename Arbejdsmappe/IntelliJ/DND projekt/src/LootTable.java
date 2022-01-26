import java.util.HashMap;
import java.util.Random;

public abstract class LootTable implements LootTableInterface {

    private final String name;

    private final String category;


    public LootTable(String lootTableName, String category) {
        this.name = lootTableName;
        this.category = category;
    }


    public String getName() {
        return name;
    }
}
