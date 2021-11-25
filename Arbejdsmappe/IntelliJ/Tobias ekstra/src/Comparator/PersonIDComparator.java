package Comparator;

import java.util.Comparator;

public class PersonIDComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPersonID() - o2.getPersonID();
    }
}
