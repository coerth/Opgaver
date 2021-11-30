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

//       list = ordleg.gentagOrd(list,2);
//
//       for(String s : list){
//           System.out.println(s);
//       }

        ordleg.sorteretOgTrimmet(list);

        for(String s : list){
           System.out.println(s);
       }


    }
}
