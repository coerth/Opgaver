package øvelse1;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Ordleg ordleg = new Ordleg();


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Hey");

        arrayList = ordleg.gentagOrd(arrayList,3);

        /*for(String s : arrayList){
            System.out.println(s);
        }*/

        arrayList = ordleg.sorteretOgTrimmmet(arrayList);

        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
