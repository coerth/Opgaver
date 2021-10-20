package Opgave_7;

public class Chicken extends Animal implements Edible{


    @Override
    public String sound() {
        return "BAKOWK";
    }

    @Override
    public String howToEat() {
        return "KFC Style";
    }
}
