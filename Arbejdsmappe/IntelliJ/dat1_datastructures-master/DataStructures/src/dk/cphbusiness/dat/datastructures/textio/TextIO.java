package dk.cphbusiness.dat.datastructures.textio;

import java.util.List;

public interface TextIO
{
    void output(String text);
    String input();

    default int menuChoice(String preText, String postText, List<String> choices)
    {
        output(preText);
        output("\n");
        for(int i = 0 ; i < choices.size(); i++)
        {
            output(""+ (i+1)+ ""+ choices.get(i) + "\n");
        }
        output("\n");
        output(postText);

        return inputInteger(1, choices.size()) -1;

    }

    default int inputInteger(int min, int max)
    {
        while (true)
        {
            int res = inputInteger();
            if(res >= min && res <= max)
            {
                return res;
            }
            output("Please enter an integer between "+ min + " and "+ max);
        }
    }

    default int inputInteger()
    {
        while (true)
        {
            String s = input();
            try {
                int i = Integer.parseInt(s);
                return i;
            }
            catch (NumberFormatException e)
            {
                output("Please input an integer!\n");
            }
        }
    }




}
