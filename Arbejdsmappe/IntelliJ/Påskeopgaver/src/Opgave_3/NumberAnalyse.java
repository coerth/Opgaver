package Opgave_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyse {
ArrayList<Integer> numbersArrayList = new ArrayList<>();

public void importNumbers(){
    File file = new File("src/Opgave_3/numbers.txt");

    try{
        Scanner scan = null;
        scan = new Scanner(file);

        while(scan.hasNextInt()) {
            numbersArrayList.add(scan.nextInt());
        }

    }catch (FileNotFoundException e){
        System.out.println(e);
    }
}

public int calculateAverage(){
    int sum = 0;
    int average;

    for(Integer i : numbersArrayList){
        sum += i;
    }

    average = sum / numbersArrayList.size();
    //System.out.println("Gennemsnittet er: " + average);

    return average;
}

public int higherThanAverage(){
    int average = calculateAverage();
    int counter = 0;

    for(Integer i : numbersArrayList){
        if(i > average){
            counter++;
        }
    }

    return counter;

}

}
