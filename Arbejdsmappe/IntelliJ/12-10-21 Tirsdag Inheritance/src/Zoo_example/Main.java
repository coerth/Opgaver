package Zoo_example;

public class Main {

    public static void main(String[] args) {
	Zoo zoo = new Zoo();
    Caretaker caretaker1 = new Caretaker("Jesper");
    Animal ostrich = new Ostrich(2, "Ollie");
    Animal bear = new Bear(4, "Peter");
    Animal tiger = new Tiger(4, "Tony");

    zoo.addStaffToZoo(caretaker1);

    zoo.addAnimalToZoo(ostrich);
    zoo.addAnimalToZoo(bear);
    zoo.addAnimalToZoo(tiger);

    zoo.makeAllSounds();

    zoo.printNumberOfLegs();

    zoo.lunchAtZoo();



    }
}
