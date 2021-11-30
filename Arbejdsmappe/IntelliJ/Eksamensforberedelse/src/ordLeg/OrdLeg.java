package ordLeg;

import java.util.ArrayList;

public class OrdLeg {

    public ArrayList<String> gentagOrd(ArrayList<String> list, int k)
    {
        ArrayList<String> returnList = new ArrayList<>();

        if(k <= 0)
        {
            throw new ArithmeticException("Number must be higher than 0");
        }

        if(list.isEmpty())
        {
            throw new NullPointerException("List must contain elements");
        }

        for(int i = 0; i < k; i++)
        {
            for (int j = 0; j < list.size(); j++)
            {
                returnList.add(list.get(j));
            }
        }
        return returnList;
    }

    public ArrayList<String> sorteretOgTrimmet(ArrayList<String> list)
    {
        for(int j = 0; j < list.size(); j++)
        {


            for (int i = 0; i < list.size()-1; i++)
            {


                if (list.get(i).trim().length() > list.get(j).trim().length())
                {
                    String tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,tmp);
                }

            }

            for (int k = 0; k < list.size()-1; k++){
                if (list.get(k).equals(list.get(k+1))){
                    list.remove(k);
                }
            }

        }

        return list;
    }
}
