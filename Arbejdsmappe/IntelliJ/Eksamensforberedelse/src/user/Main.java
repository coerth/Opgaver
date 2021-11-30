package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User morten = new User("Morten", "Bendeke", "cph-mb808@cphbusiness.dk");
        User mia = new User("Mia","Falk","1234@gmail.dk");
        User casper = new User("Casper", "Posche", "56678@hotmail.com");
        User martin = new User("Martin", "Bond", "dfgf@yahoo.dk");

        UserList userList = new UserList();

        userList.addUser(morten);
        userList.addUser(casper);
        userList.addUser(mia);
        userList.addUser(martin);

        for(User u : userList.getList()){
            System.out.println(u);
        }

        ArrayList<Comparator> compList = new ArrayList<>();
        Comparator lastComp = new LastNameComparator();
        Comparator firstComp = new FirstNameComparator();

        compList.add(firstComp);
        compList.add(lastComp);

        Comparator cc = new CombinedComparator(compList);

        Collections.sort(userList.getList(), cc);

        for(User u : userList.getList()){
            System.out.println(u);
        }

    }
}
