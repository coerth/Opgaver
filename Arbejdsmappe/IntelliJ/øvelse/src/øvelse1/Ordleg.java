package øvelse1;

import java.util.ArrayList;

public class Ordleg {

   private final MyStringComparator myStringComparator = new MyStringComparator();

    public ArrayList<String> gentagOrd (ArrayList<String> ord, int k)
    {
        ArrayList<String> array = new ArrayList<>();

        for(String s : ord)
        {
            for(int i = 0; i < k; i++)
            {
                array.add(s);
            }
        }

        return array;
    }

    public ArrayList<String> sorteretOgTrimmmet(ArrayList<String> ord)
    {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String s : ord)
        {
            arrayList.add(s.trim());
            for(int i = 1; i < arrayList.size(); i++)
            {
                if(arrayList.get(i).equals(arrayList.get(i-1)) ){
                    arrayList.remove(i-1);
                }
            }
        }

        arrayList.sort(myStringComparator);

        return arrayList;
    }


}
