import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;

public class DBConnector implements IO
{
    static final String DB_URL = "jdbc:mysql://localhost/dnd";

    //  Database credentials
    static final String USER = "dnduser";
    static final String PASS = "Bananflue";



    @Override
    public ArrayList<LootTable> readLootTables() throws FileNotFoundException {
        ArrayList<LootTable> lootTableArrayList = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            // Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT loottable.loottable_name, category.category_name, loottable.loottable_weighted, loottable.loottable_id  FROM loottable INNER JOIN category ON loottable.category_id = category.category_id";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                String lootTableName = rs.getString("loottable_name");
                String category_name = rs.getString("category_name");
                boolean isWeighted = rs.getBoolean("loottable_weighted");
                int lootTableID = rs.getInt("loottable_id");

                lootTableArrayList.add(readLootTableContents(lootTableName, category_name, isWeighted, lootTableID));

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        return lootTableArrayList;
    }

    @Override
    public LootTable readLootTableContents(String name, String category, boolean isWeighted, int id) throws FileNotFoundException
    {
        LootTable lootTable;

        if(isWeighted)
        {
            lootTable = new WeightedLootTable(name,category);
        }
        else
        {
            lootTable = new SimpleLootTable(name, category);
        }

        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            // Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql = "SELECT entrytable.entrytable_text, entrytable.entrytable_rollvalue FROM entrytable INNER JOIN loottable ON entrytable.loottable_id = loottable.loottable_id WHERE loottable.loottable_id ="+id;
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                String entryTableText = rs.getString("entrytable_text");
                int entryTableRollValue = rs.getInt("entrytable_rollvalue");

                lootTable.addTableEntry(entryTableRollValue,entryTableText);

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try





        return lootTable;
    }


}
