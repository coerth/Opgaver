package øvelse3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Morten", "Bendeke", "mb@mail.dk");
        User user2 = new User("Arne","Bobsen","ab@mail.dk");
        User user3 = new User("Mia", "Bengsten","mb@mail.dk");
        User user4 = new User("Casper", "Poulsen","cp@mail.dk");
        User user5 = new User("Casper", "Arnesen","ca@mail.dk");

        UserList userList = new UserList();


        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user4);
        userList.addUser(user5);

        ArrayList<User> users = userList.sortUserList(userList.getUsers());

        for(User u : users){
            System.out.println(u);
        }
    }
}
