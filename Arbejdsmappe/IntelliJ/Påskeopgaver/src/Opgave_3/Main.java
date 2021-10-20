package Opgave_3;

public class Main {

    public static void main(String[] args) {

        NumberAnalyse numberAnalyse = new NumberAnalyse();

        numberAnalyse.importNumbers();

        int average = numberAnalyse.calculateAverage();
        System.out.println("Gennesnittet er: " + average);

        int higherThanAverage = numberAnalyse.higherThanAverage();
        System.out.println("Antal tal som er højere end gennemsnittet: " + higherThanAverage);


    }
}
