package øvelse3;

import java.util.ArrayList;

public class UserList {

    private ArrayList<User> users = new ArrayList<>();
    private CombinedComparator comparator = new CombinedComparator();


    public void addUser(User user){
        for(User u : users){
            if(user.equals(u)){
                throw new ArithmeticException("Denne bruger eksisterer i listen i forvejen");
            }
        }
        users.add(user);
    }

    public ArrayList<User> sortUserList(ArrayList<User> userArrayList)
    {
        userArrayList.sort(comparator);

        return userArrayList;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
