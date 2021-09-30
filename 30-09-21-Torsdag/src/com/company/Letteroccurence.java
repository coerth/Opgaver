package com.company;


public class Letteroccurence implements Comparable<Letteroccurence> { //skal adde implements Comparable<Object> for at kunne sortere arraylist

    private char theCharacter;
    private int numberOfOccurences;

    public Letteroccurence(char theCharacter, int numberOfOccurences) {
        this.theCharacter = theCharacter;
        this.numberOfOccurences = numberOfOccurences;
    }

    public char getTheCharacter() {
        return theCharacter;
    }

    public int getNumberOfOccurences() {
        return numberOfOccurences;
    }

    public void setNumberOfOccurences(int numberOfOccurences) {
        this.numberOfOccurences = numberOfOccurences;
    }

   // @Override
    public int compareTo(Letteroccurence otherLetter) { //skal lave en metode som hedder compareTo for at kunne lave sortering, på den værdi du vil have
        return this.numberOfOccurences - otherLetter.numberOfOccurences;
    }
}
