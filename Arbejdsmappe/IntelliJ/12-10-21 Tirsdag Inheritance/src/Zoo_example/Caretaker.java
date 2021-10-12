package Zoo_example;

public class Caretaker extends Staff {
    private String name;
    private int id;

    public Caretaker(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The caretaker " + name + " takes lunch.");
    }

}
