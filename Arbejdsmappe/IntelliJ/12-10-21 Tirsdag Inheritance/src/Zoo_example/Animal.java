package Zoo_example;

public class Animal implements AnimalSound, Basic_Needs {
    private int numberOfLegs;
    private String name;

    public Animal(int numberOfLegs, String name) {

        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }

    public int getNumberOfLegs() {

        return numberOfLegs;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {

        System.out.println("Undefined animal makes no sound.");
    }

    @Override
    public void eat() {
        System.out.println("Undefined animal eats no food.");
    }

    @Override
    public void sleep() {
        System.out.println("Undefined animal needs no sleep.");
    }

    @Override
    public void poop() {
        System.out.println("Undefined animal needs not poop.");
    }
}
