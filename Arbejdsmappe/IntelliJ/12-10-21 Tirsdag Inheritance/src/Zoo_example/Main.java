package Zoo_example;

public class Main {

    public static void main(String[] args) {
	Zoo zoo = new Zoo();
    Animal ostrich = new Ostrich(2);
    Animal bear = new Bear(4);
    Animal tiger = new Tiger(4);

    zoo.addAnimalToZoo(ostrich);
    zoo.addAnimalToZoo(bear);
    zoo.addAnimalToZoo(tiger);

    zoo.makeAllSounds();

    zoo.printNumberOfLegs();
    }
}
