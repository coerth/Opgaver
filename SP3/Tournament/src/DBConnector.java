import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DBConnector implements IO{
    static final String DB_URL = "jdbc:mysql://localhost/tournament";

    //  Database credentials
    static final String USER = "pepsilaks";
    static final String PASS = "pepsilaks";

    @Override
    public ArrayList<Tournament> readTournaments() {
        ArrayList<Tournament> tournaments = new ArrayList<>();
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

            String sql = "SELECT * FROM tournaments";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int Id_tournaments = rs.getInt("Id_tournaments");
                String tournaments_name = rs.getString("Tournaments_name");
                String tournaments_date = rs.getString("Tournaments_date");
                boolean tournaments_isfixed = rs.getBoolean("Tournaments_isfixed");
                tournaments.add(new KnockOutTournament(Id_tournaments, tournaments_name, tournaments_date, tournaments_isfixed));
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
        return tournaments;
    }

    @Override
    public ArrayList<Team> readTeams(Tournament t) {
        ArrayList<Team> teams = new ArrayList<>();
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

            String sql = "SELECT * FROM teams where Teams_tournamentID ="+t.getId();
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int teams_id = rs.getInt("Id_teams");
                String teams_name = rs.getString("Teams_name");
                String teams_player1 = rs.getString("Teams_player1");
                String teams_player2 = rs.getString("Teams_player2");
                teams.add(new Team(teams_id, teams_name, teams_player1, teams_player2));
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
        System.out.println(Arrays.toString(teams.toArray()));
        return teams;
    }

    @Override
    public void saveTournaments(ArrayList<Tournament> tournaments) {
        Tournament t;
        Connection conn = null;
        String sql = "INSERT INTO tournaments (Id_tournaments, Tournaments_name, Tournaments_date, Tournaments_isfixed) " +
                "VALUES(?,?,?,?) ON DUPLICATE KEY UPDATE Tournaments_name=?, Tournaments_date=?, Tournaments_isfixed=?";


        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            System.out.println("Creating statement...");

            for (int i = 0; i < tournaments.size(); i++) {
                t = tournaments.get(i);
                pstmt.setInt(1, t.getId());
                pstmt.setString(2, t.getName());
                pstmt.setString(3, t.getStartDateString());
                pstmt.setBoolean(4 , t.isFixedDuration());
                pstmt.setString(5, t.getName());
                pstmt.setString(6, t.getStartDateString());
                pstmt.setBoolean(7, t.isFixedDuration());

                pstmt.addBatch();
            }

            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void saveTeams(Tournament t, int placement) {
        ArrayList<Team> teams = t.getTeams();
        Connection conn = null;
        String sql = "INSERT INTO teams (Id_teams, Teams_name, Teams_player1, Teams_player2, Teams_tournamentID) " +
                "VALUES(?,?,?,?,?) ON DUPLICATE KEY UPDATE Teams_name=?, Teams_player1=?, Teams_player2=?";


        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            System.out.println("Creating statement...");

            for (int i = 0; i < teams.size(); i++) {
                pstmt.setInt(1, teams.get(i).getId());
                pstmt.setString(2, teams.get(i).getName());
                pstmt.setString(3, teams.get(i).getPlayers().get(0).getName());
                pstmt.setString(4, teams.get(i).getPlayers().get(1).getName());
                pstmt.setInt(5, placement);
                pstmt.setString(6, teams.get(i).getName());
                pstmt.setString(7, teams.get(i).getPlayers().get(0).getName());
                pstmt.setString(8, teams.get(i).getPlayers().get(1).getName());
                pstmt.addBatch();
            }

            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
