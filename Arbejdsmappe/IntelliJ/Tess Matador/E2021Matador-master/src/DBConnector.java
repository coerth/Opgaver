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

    public void saveGameData(ArrayList<Player> players) {
        Player p;
        Connection conn = null;

        String sql = "INSERT INTO Player(Player_id, Player_name, Player_balance, Player_position, Player_isNext) " +
                "VALUES(?,?,?,?,?)  ON DUPLICATE KEY UPDATE Player_balance=?, Player_position=?, Player_isNext=?";

        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //Step 2
            System.out.println("Creating Statement");

            for(int i = 0; i < players.size(); i ++) {
                //Disse bruges når brugeren ikke er i databasen
                p = players.get(i);
                pstmt.setInt(1, p.getId());
                pstmt.setString(2, p.getName());
                pstmt.setInt(3, p.account.getBalance());
                pstmt.setInt(4, p.getPosition());
                pstmt.setBoolean(5, Main.currentPlayer == p);

                //disse bruges ved UPDATES, når brugeren findes i databasen
                pstmt.setInt(6, p.account.getBalance());
                pstmt.setInt(7, p.getPosition());
                pstmt.setBoolean(8, Main.currentPlayer == p);

                pstmt.addBatch();
            }

            pstmt.executeBatch();
        }
        catch(Exception e){

        }
    }
}
