package dk.cphbusiness.dat.datastructures;

public class Main {
    public static void main(String[] args) {
        int[] tempArray = new int[1];

        int[] numbers = {7,9,12,3,6,42,68,8,5};

        Sortering sortering = new Sortering();
        int[] newNumbers = sortering.sortNumbers(numbers);

        for(Integer i : newNumbers){
            System.out.println(i);
        }
    }
}
