package Zoo_example;

public class Ostrich extends Animal {

    public Ostrich(int numberOfLegs, String name) {

        super(numberOfLegs, name);
    }

    @Override
    public void makeSound() {

        System.out.println("Ostrich goes pfpffpfpfpffpf");
    }

    @Override
    public void eat(){
        System.out.println("The ostrich " + super.getName() + " eats some hay.");
    }
}
