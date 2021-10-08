package Sorting.Obects_in_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//    Det kan være fedt at kunne sortere objekter man kan placeret i en arrayliste.Sorting_Objects_ArrayList.
//    det kan lade sig gøre men det kræver lige lidt forarbejde

        ArrayList<Object> objectArrayList = new ArrayList<>();

//      når Comparable er implementeret og compareTo metoden findes.
//      så kan Collections.sort() bruges til at sortere det gældne objekt.
        Collections.sort(objectArrayList);
    }


}
