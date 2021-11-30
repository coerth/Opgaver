package user;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UserList {
    private final ArrayList<User>  list;

    public UserList() {
        list = new ArrayList<>();
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void addUser(User newUser) {
        for(User user : list){
            if(newUser.getEmail().equals(user.getEmail())){

                throw new StringIndexOutOfBoundsException("The list already contains a user with that email-address");

//                System.out.println("This list already contains a user with that email-address");
//                return;
            }
        }
        list.add(newUser);
    }
}
