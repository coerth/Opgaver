package butik;

import java.util.HashMap;
import java.util.HashSet;

public class Butik {

    public int køb(int varePris, int kundePenge)
    {

        if(varePris < 0 || kundePenge < 0){
            throw new ArithmeticException("varepris eller kundepenge kan være negative tal");
        }

        if(kundePenge < varePris){
            throw new ArithmeticException("Ikke nok penge til at købe varen");
        }

        return kundePenge - varePris;
    }

    public String byttePenge(int byttePenge){
        String s = "";

        HashMap<Integer,Integer> values = new HashMap<>();
        values.put(1, 500);
        values.put(2, 200);
        values.put(3, 100);
        values.put(4, 50);
        values.put(5, 20);
        values.put(6, 10);
        values.put(7, 5);
        values.put(8, 2);
        values.put(9, 1);

        for(Integer i : values.values()){
            if(byttePenge % i < byttePenge){
                byttePenge = byttePenge % i;
                s += values.get(i)+"\n";

            }
        }

        return s;
    }
}
