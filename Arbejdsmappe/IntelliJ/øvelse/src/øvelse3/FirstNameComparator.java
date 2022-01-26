package øvelse3;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<User> {


    @Override
    public int compare(User o1, User o2) {

        return o1.getFornavn().compareTo(o2.getFornavn());
    }
}
