package Zoo_example;

public class Ostrich extends Animal {

    public Ostrich(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich goes pfpffpfpfpffpf");
    }
}
