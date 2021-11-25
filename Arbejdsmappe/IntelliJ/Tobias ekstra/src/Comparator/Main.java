package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[7];

        people[0] = new Person("Allan", "Petersen", 1);
        people[1] = new Person("Allan", "Adamsen", 3);
        people[2] = new Person("Allan", "Adamsen", 2);
        people[3] = new Person("Wens", "Jensen", 50);
        people[4] = new Person("Jens", "Jensen", 6);
        people[5] = new Person("Hans", "Allansen", 10);
        people[6] = new Person("Hans", "Bllansen", 9);

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
