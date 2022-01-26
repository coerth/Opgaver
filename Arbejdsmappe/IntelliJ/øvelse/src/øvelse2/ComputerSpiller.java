package øvelse2;

import java.util.Random;

public class ComputerSpiller implements Spiller {


    @Override
    public int gætEtTal(int max) {
        Random rand = new Random();

        int i = rand.nextInt(1,max+1);
        System.out.println(i);

        return i;
    }
}
