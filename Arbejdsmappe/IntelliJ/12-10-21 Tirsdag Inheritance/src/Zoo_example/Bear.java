package Zoo_example;

public class Bear extends Animal {

    public Bear(int numberOfLegs, String name) {

        super(numberOfLegs, name);
    }

    @Override
    public void makeSound() {

        System.out.println("Bear goes HAUGR");
    }

    @Override
    public void eat(){
        System.out.println("The bear " + super.getName() + " eats some salmon.");
    }
}
