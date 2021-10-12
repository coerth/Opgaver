package Zoo_example;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zooArrayList = new ArrayList<>();


    void makeAllSounds(){
        for(Animal a : zooArrayList){
            a.makeSound();
        }
    }

    void addAnimalToZoo(Animal animal){
        zooArrayList.add(animal);
    }

    void printNumberOfLegs(){
        int sumOfLegs = 0;
        for(Animal a : zooArrayList ){
            sumOfLegs += a.getNumberOfLegs();
        }
        System.out.println("Total number of legs in zoo: " + sumOfLegs);
    }


}
