package ordLeg;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hvor     ");
        list.add("Mange");
        list.add("Gange  ");
        list.add("Virker");
        list.add("Det?  ");
        list.add("Virker");

        OrdLeg ordleg = new OrdLeg();

        ordleg.sorteretOgTrimmet(list);

        for(String s : list){
           System.out.println(s);
       }
    }
}
