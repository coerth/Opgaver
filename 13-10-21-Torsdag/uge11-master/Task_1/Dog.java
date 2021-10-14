package Task_1;

import java.util.ArrayList;

public class Dog {
    private String name;
    private boolean isHungry;
    private Owner owner;
    private ArrayList<Dog> offSpring;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
        this.offSpring = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(Dog dog) {
        this.offSpring.add(dog);
    }

    public String feedDog(){
        isHungry = false;

        return name + " has been feed and is happy";
    }

    //task 7
    public void printOffSpring(){
        for(Dog myP : offSpring){
            System.out.println(myP);
        }
    }

    public void setOffSpringFromFile(ArrayList<String> dogDataFromFile){
        String[] dogData;
        String name;
        boolean isHungry;
        for(String s : dogDataFromFile){
            dogData = s.split(",");

            name = dogData[0].trim();
            isHungry = Boolean.parseBoolean(dogData[1].trim());

            setOffSpring(new Dog(name,isHungry));
        }
    }

    @Override
    public String toString() {
        String s;

        if(isHungry){
            s = name + " og er sulten.";
        }

        else{
            s = name + " og er ikke sulten.";
        }

        return s;
    }
}
