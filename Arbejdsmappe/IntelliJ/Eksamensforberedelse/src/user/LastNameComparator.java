package user;

import java.util.Comparator;

public class LastNameComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
