package com.company.Task3;

public class Customer {
    //static int counter for klassen for at tælle op i ID
    private static int idCount = 0;

    private String firstName;
    private String lastName;
    private String userName;
    private int id = 0;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        //hver gang constructor bliver kørt, går idCount op og det går så at ID'et tæller op.
        idCount++;
        this.id = idCount;
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName+"\n"+"Username: "+userName+"\n"+"ID: "+id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }
}
