package dk.cphbusiness.dat.datastructures;

public class Main {
    public static void main(String[] args) {
        int[] tempArray = new int[1];

        int[] numbers = {7,9,12,3,6,42,68,8,5};

        System.out.println("Før sortering");
        for (Integer i : numbers){

        }

        Sortering sortering = new Sortering();
        sortering.sortNumbers(numbers);

        System.out.println("\n" + "Efter sortering");
        for(Integer i : numbers){
            System.out.println(i);
        }
    }
}
