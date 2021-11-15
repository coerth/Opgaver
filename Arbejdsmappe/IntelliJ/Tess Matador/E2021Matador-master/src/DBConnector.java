import java.sql.*;
import java.util.ArrayList;

public class DBConnector {

    //database URL
    String DB_URL = "jdbc:mysql://localhost/Matador";

    //database credentials
    String USER = "SQLUser";
    String PASS = "Bananflue";




    public String[] readFieldData(){
        String[] field_data = new String[40];
        Connection conn = null;
        Statement stmt = null;
        try{
            //step 1: open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //Step 2: Create a statement
            stmt = conn.createStatement();
            String sql  ="SELECT * FROM Field";

            //Step 3: execute a query
            ResultSet rs = stmt.executeQuery(sql);

            //Step 4: extract data from result set
            while(rs.next()){
                int id = rs.getInt("field_id");
                String type = rs.getString("field_type");
                String label = rs.getString("field_label");
                int cost = rs.getInt("field_cost");
                int income = rs.getInt("field_income");
                int series = rs.getInt("field_seriesid");


                field_data[id-1] = id+","+type+","+label+","+cost+","+income+","+series;
            }

            // step 5 close connections
            rs.close();
            stmt.close();
            conn.close();
        }


        catch(SQLException e){

        }

        return field_data;
    }

    public ArrayList<Player> readGameData() {
        ArrayList<Player> playerArrayList = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        try {
            //step 1: open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //Step 2: Create a statement
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Player";

            //Step 3: execute a query
            ResultSet rs = stmt.executeQuery(sql);

            //Step 4: extract data from result set
            while (rs.next()) {
                String name = rs.getString("player_name");
                int balance = rs.getInt("player_balance");

                playerArrayList.add(new Player(name, balance));
            }

            // step 5 close connections
            rs.close();
            stmt.close();
            conn.close();
        }


        catch(SQLException e){

        }

        return playerArrayList;
    }

}
