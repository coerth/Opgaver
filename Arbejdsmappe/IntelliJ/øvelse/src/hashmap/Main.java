package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> food = new HashMap<>();

        food.put("ice cream","cherry");
        food.put("bread","butter");



        if(food.containsKey("ice cream"))
        {
            System.out.println("ice cream exists");
        }

        System.out.println(food);


    }
}
