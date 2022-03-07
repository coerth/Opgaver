import entities.Student;

import java.sql.*;
import java.util.ArrayList;

public class Main
{

    private final static String USER = "SQLUser";
    private final static String PASSWORD = "Bananflue";
    private final static String DB = "CPHbusiness";
    private final static String URL = "jdbc:mysql://localhost:3306/"+DB+"?serverTimezone=CET&useSSL=false&allowPublicKeyRetrieval=true";




    public static void main(String[] args)
    {
        System.out.println("Klar til start");

        //Initialise arraylist

        ArrayList<Student> studentList = new ArrayList<>();

        //studentList.add(new Student(1,"Jon", 52));



        //Connect to database

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Connection connection = null;

        try
        {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Nu har vi en connection til databasen");

            String sql = "SELECT * FROM students";

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                int id = rs.getInt("idSTUDENTS");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                studentList.add(new Student(id, name, age));
            }

            connection.close();
        } catch (SQLException e)
        {
            System.out.println("Der er noget galt i vores connection");
            e.printStackTrace();
        }




        //Select all students from database

        //Print out all students

        showStudents(studentList);

    }

    private static void showStudents(ArrayList<Student> studentList)
    {

        studentList.forEach(System.out::println);

        /*for (Student student : studentList)
        {
            System.out.println(student);
        }*/
    }
}
