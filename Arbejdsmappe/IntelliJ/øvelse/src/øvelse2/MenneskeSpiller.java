package øvelse2;

import java.util.Scanner;


public class MenneskeSpiller implements Spiller {

    @Override
    public int gætEtTal(int max) {
        Scanner scan = new Scanner(System.in);
        int gæt = 0;

        System.out.println("Indtast dit gæt på tallet");
        try {
            gæt = scan.nextInt();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        return gæt;
    }
}
