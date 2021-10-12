package Zoo_example;

public class Bear extends Animal {

    public Bear(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("Bear goes HAUGR");
    }
}
