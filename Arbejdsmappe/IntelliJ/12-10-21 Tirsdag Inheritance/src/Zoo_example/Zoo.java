package Zoo_example;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animalArrayList = new ArrayList<>();
    ArrayList<Staff> staffArrayList = new ArrayList<>();

    public void makeAllSounds(){
        for(Animal a : animalArrayList){
            a.makeSound();
        }
    }

    public void addAnimalToZoo(Animal animal){

        animalArrayList.add(animal);
    }

    public void addStaffToZoo(Staff staff){
        staffArrayList.add(staff);
    }

    public void printNumberOfLegs(){
        int sumOfLegs = 0;
        for(Animal a : animalArrayList){
            sumOfLegs += a.getNumberOfLegs();
        }
        System.out.println("Total number of legs in zoo: " + sumOfLegs);
    }

    public void lunchAtZoo(){
        for(Basic_Needs b : animalArrayList){
            b.eat();
        }
        for(Basic_Needs b : staffArrayList){
            b.eat();
        }
    }

}
