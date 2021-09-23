import java.util.Arrays; //importet library for at kunne sortere

public class Task4 {

public static void main(String[] args) {
  String[] stringArray = {"Laks", "Torsk","Pighvar","Mørk Sej"};
  int[] intArray = {40, 10, 30, 20};
  boolean[] booleanArray = {true, false, true};

  System.out.println("Dette er vores string array");
  printStringArray(stringArray);
  System.out.println(" ");

  System.out.println("Dette er vores int array");
  System.out.println(Arrays.toString(intArray) );
  System.out.println(" ");

  System.out.println("Dette er vores Sumfunkion");
  System.out.println(printSumOfArray(intArray) );
  System.out.println(" ");

  System.out.println("Dette er vores gennemsnitsfunktion");
  System.out.println(printAverageOfArray(intArray) );
  System.out.println(" ");

  sortIntArray(intArray);
  System.out.println("Dette er vores sorterede int array");
  System.out.println(Arrays.toString(intArray) );
  System.out.println(" ");
}

//funktion til at printe string array
public static void printStringArray(String[] stringArrayToPrint){

    for(int i = 0; i < stringArrayToPrint.length; i++ ){
    System.out.println(stringArrayToPrint[i]);
  }
}

//funktion som tager et int array og adder hver del til summen, og returner summen
public static int printSumOfArray(int[] intArrayToAdd){
int totalSum = 0;

for(int i = 0; i <intArrayToAdd.length; i++){
  totalSum += intArrayToAdd[i];
  }
  return totalSum;
}

//funktion som tager et int array og adder hver del til summen, derefter bliver summen divideret med længden af arrayet og returner summen
public static int printAverageOfArray(int[] intArraytoAvg){
int totalSum = 0;

for(int i = 0; i <intArraytoAvg.length; i++){
  totalSum += intArraytoAvg[i];
  }
   totalSum = totalSum / intArraytoAvg.length;
  return totalSum;
}

//funktion til at sortere arrays, den kræver: import java.util.Arrays; for at virke 
public static void sortIntArray(int[] intArrayToSort){
  Arrays.sort(intArrayToSort);
}

}
