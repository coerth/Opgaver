package dk.cphbusiness.dat.datastructures;

public class Sortering {


    public void sortNumbers(int[] numbers){
        for(int j = 1 ; j < numbers.length; j++){
            for(int i = 0 ; i < numbers.length; i++){
                if(numbers[i] > numbers[j]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }


    }
}
