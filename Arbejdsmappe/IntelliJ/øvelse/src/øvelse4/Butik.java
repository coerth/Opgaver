package øvelse4;

public class Butik {


    public int køb(int pris, int betaling)
    {
        int byttepenge;

        if(pris < 0 || betaling < 0)
        {
            throw new ArithmeticException("pris/betaling skal være positive tal");
        }

        byttepenge = betaling - pris;

        return byttepenge;

    }


    public String byttepenge (int byttepenge)
    {
        int beløb = byttepenge;
        int[] pengetyper = {500,200,100,50,20,10,5,2,1};
        String s = "";

        for(int i : pengetyper)
        {
            if(beløb % i < beløb)
            {
                int rest = beløb % i;
                int antal = (beløb - rest) / i;

                s += antal + " * " + i + "kr. \n";

                beløb = rest;
            }
        }

        return s;
    }
}
