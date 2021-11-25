package Sorting.Obects_in_ArrayList;

//der skal implementeres Comparable<Class> så objekter kan sammenlignes med andre objekter af samme klasse
public class ClassObject implements Comparable<ClassObject>  {
    private String name;
    private int age;

//    der skal være en compareTo metode som sorteringen anvender til at sortere.
//    i dette tilælde sorteres der på age
    @Override //override ved jeg ikke helt hvad gør i denne sammenhæng.
    public int compareTo(ClassObject otherObject) {

        return this.age - otherObject.age;
    }
//  IntelliJ kan lave compareTo for en, under Generate;

}


