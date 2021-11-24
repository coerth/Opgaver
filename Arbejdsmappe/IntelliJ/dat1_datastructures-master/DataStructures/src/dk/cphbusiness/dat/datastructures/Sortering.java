package dk.cphbusiness.dat.datastructures;

public class Sortering {


    public int[] sortNumbers(int[] numbers){
        int[] tempArray = new int[numbers.length];
        int currentNumber = 0;

        for(int i = 0; i < numbers.length -1; i++){
            if(currentNumber == 0){
               currentNumber = numbers[i];
            }
            if(numbers[i]< currentNumber){
                currentNumber = numbers[i];
            }

        }
        tempArray[0] = currentNumber;
        for(Integer integer : numbers){
            currentNumber = integer;
            for(int i = 0; i < tempArray.length-1; i++){
                if(currentNumber < tempArray[i] || tempArray[i] == 0){
                        tempArray[i + 1] = tempArray[i];
                    tempArray[i] = integer;
                    //currentNumber = tempArray[i];
                }
            }
        }

        return tempArray;
    }
}
