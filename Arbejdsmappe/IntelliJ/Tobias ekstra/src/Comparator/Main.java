package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[6];

        people[0] = new Person("Allan", "Petersen", 00001);
        people[1] = new Person("Allan", "Adamsen", 00004);
        people[2] = new Person("John", "Jensen", 00002);
        people[3] = new Person("Jens", "Jensen", 00050);
        people[4] = new Person("Jens", "Jensen", 00006);
        people[5] = new Person("Hans", "Allansen", 00010);

        System.out.println("Before sorting" + "\n");
        List<Comparator<Person>> list = new ArrayList<>();
        list.add(new PersonFirstNameComparator());
        list.add(new PersonLastNameComparator());
        list.add(new PersonIDComparator());

        CombinedComparator combinedComparator = new CombinedComparator(list);

        Arrays.sort(people,combinedComparator);
        System.out.println("After sorting");
        for(Person p : people){
            System.out.println(p);
        }

    }
}
