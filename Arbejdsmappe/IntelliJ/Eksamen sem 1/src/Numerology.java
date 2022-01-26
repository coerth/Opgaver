import java.util.HashMap;
import java.util.Scanner;

public class Numerology {

    private HashMap<String, Integer> namesMap = new HashMap<String, Integer>();


    private String inputName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the name to check value for:");

        return scan.nextLine();

    }

    private int calcSum(String name)
    {
        int sum = 0;

        for(int i = 0; i < name.length(); i++)
        {
        sum += (int) name.charAt(i);
        }

        return sum;
    }

    public int calcAcross(int num)
    {
        int across = 0;

        if (num % 100 < num)
        {
            int remainder = num % 100;
            across += (num - remainder) / 100;
        }
        if( num % 10 < num)
        {
            int remainder = num % 10;
            across += (num % 100 - remainder) / 10;
        }

        across += num % 10;


        return across;
    }


    public void processName(int amountOfNames)
    {
        for(int i = 0; i < amountOfNames; i++)
        {
            String name = inputName();

            if (namesMap.containsKey(name))
            {
                System.out.println("From hashmap");
                System.out.println(namesMap.get(name));
            } else
            {
                namesMap.put(name, calcSum(name));
                System.out.println(namesMap.get(name));
            }
        }
    }

}
