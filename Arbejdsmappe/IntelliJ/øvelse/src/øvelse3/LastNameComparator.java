package øvelse3;

import java.util.Comparator;

public class LastNameComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getEfternavn().compareTo(o2.getEfternavn());
    }
}
