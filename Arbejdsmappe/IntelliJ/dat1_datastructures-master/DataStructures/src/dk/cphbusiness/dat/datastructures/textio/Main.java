package dk.cphbusiness.dat.datastructures.textio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TextIO tio = new SimpleTextIO();

        ArrayList<String> menu = new ArrayList<>();

        menu.add("Tomat");
        menu.add("Agurk");
        menu.add("Salat");

        int choice = tio.menuChoice("Hvad vil du helst spise?", "Indtast nummeret på dit valg: ", menu);

        System.out.println("Du har valgt: "+ menu.get(choice));
    }
}
