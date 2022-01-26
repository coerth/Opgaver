package øvelse3;

import java.util.ArrayList;
import java.util.Comparator;

public class CombinedComparator implements Comparator<User> {

    ArrayList<Comparator> list = new ArrayList<>();

    public CombinedComparator() {
        list.add(new FirstNameComparator());
        list.add(new LastNameComparator());
    }

    @Override
    public int compare(User o1, User o2) {
        int c = 0;
        for(Comparator comp : list)
        {
            c = comp.compare(o1,o2);
            if(c != 0)
            {
                return c;
            }
        }

        return c;
    }
}
