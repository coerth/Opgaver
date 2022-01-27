import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface IO {

    ArrayList<LootTable> readLootTables() throws FileNotFoundException;
    LootTable readLootTableContents(String name, String category, boolean isWeighted, int id) throws FileNotFoundException;
    //void writeLootTable();

}
