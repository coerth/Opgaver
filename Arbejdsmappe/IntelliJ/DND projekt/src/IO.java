import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface IO {

    ArrayList<LootTable> readLootTables() throws FileNotFoundException;
    void writeLootTable();

}
