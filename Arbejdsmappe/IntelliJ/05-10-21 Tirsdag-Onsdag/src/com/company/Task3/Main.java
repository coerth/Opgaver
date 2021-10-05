package com.company.Task3;

import java.util.ArrayList;

public class Main {
  static  ArrayList<Customer> customerArrayList = new ArrayList<>();

    public static void main(String[] args) {
        customerArrayList.add(new Customer("Morten","Bendeke", "Mben"));
        customerArrayList.add(new Customer("Lars","Larsen", "Jysk"));
        customerArrayList.add(new Customer("Egon","Olsen", "OG"));
        customerArrayList.add(new Customer("Kim","Larsen", "Bigmouth"));
        customerArrayList.add(new Customer("Benny","Frandsen", "Tallboi"));
        customerArrayList.add(new Customer("Kjeld","Jensen", "Glasses"));

        printCustomers();
    }

    static void printCustomers(){
        for(Customer c : customerArrayList){
            System.out.println(c);
        }
    }
}
