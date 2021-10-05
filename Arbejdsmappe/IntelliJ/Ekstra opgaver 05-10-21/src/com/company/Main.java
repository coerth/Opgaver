package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(opgave1(5, 4, 10));
        opgave2(20);
    }


    static int opgave1(int input1, int input2, int input3){
        int tal1 = input1;
        int tal2 = input2;
        int tal3 = input3;

        int forsteCheck = Math.min(tal1, tal2);
        int andetCheck = Math.min(forsteCheck, tal3);

    return andetCheck;
    }

    static void opgave2(int input){
        int tal = 1;
        for(int i = 0; i < input; i++){
            if(tal % 2 == 0){
                System.out.print("{"+tal+"}");
            }
            tal++;
        }
    }

}
