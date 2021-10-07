package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();

        stringArray.add("Life");
        stringArray.add("is");
        stringArray.add("awesome");

//        //print af selve stringArrayListen
//        System.out.println(stringArray);
//
//        //print af individuelt element i stringArrayListen
//        System.out.println(stringArray.get(0)+" "+stringArray.get(1)+" "+stringArray.get(2));

        //add et element på plads 2, som så skubber awesome til plads 3
        stringArray.add(2,"not");
        System.out.println(stringArray);

        //set et element på plads 2 til at være "totally" i stedet for "not
//        stringArray.set(2,"totally");
//        System.out.println(stringArray);

        //for each loop som printer hvert element i stringArrayListen ud
//        for(String s : stringArray){
//            System.out.println(s);
//        }

//        for(int i = 0; i < stringArray.size(); i++){
//            if(stringArray.get(i).contains("not")){
//                stringArray.remove(i);
//                System.out.println("Element " + i + " has been removed");
//            }
//            else if(i < stringArray.size()){
//                System.out.println(stringArray);
//            }

        //while loop for at kigge efter om et element indeholder "not" , og så fjern det element
            int i = 0;
            while(i < stringArray.size()){
                if(stringArray.get(i).contains("not")){
                    stringArray.remove(i);
                    //System.out.println("Element " + i + " has been removed");
            }
                System.out.println(stringArray.get(i));
                i++;
        }

            // en måde at sammenligne primitive datatyper, på forskellige måde.
            stringArray.sort(Comparator.comparing(String::length));
            for(String s : stringArray){
                System.out.println(s);
            }

    }
}
