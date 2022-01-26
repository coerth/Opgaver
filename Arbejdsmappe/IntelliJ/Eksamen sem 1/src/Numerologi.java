import java.util.ArrayList;
import java.util.Scanner;

public class Numerologi {


    public ArrayList<String> indtastNavn()
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> navneListe = new ArrayList<>();

        System.out.println("Indtast fornavn");
        navneListe.add(scan.nextLine());



        return  navneListe;
    }

    public ArrayList<String> indtastNavnArrayList(int antal , String tekst)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> navneListe = new ArrayList<>();

        System.out.println(tekst);

        for(int i = 0; i < antal ; i++)
            navneListe.add(scan.nextLine());

        return navneListe;
    }

    public int beregnNavneSum(ArrayList<String> navneListe)
    {
        int sum = 0;
        for(String navn : navneListe)
        {
            for (int i = 0; i < navn.length(); i++)
            {
                sum += (int) navn.charAt(i);
            }
        }

        return sum;
    }

    public int beregnTværSum(int tal)
    {
        int tværSum = 0;

        if (tal % 100 < tal)
        {
            int rest = tal % 100;
           tværSum += (tal - rest) / 100;
        }
        if( tal % 10 < tal)
        {
            int rest = tal % 10;
            tværSum += (tal % 100 - rest) / 10;
        }

        tværSum += tal % 10;


        return tværSum;
    }


}
