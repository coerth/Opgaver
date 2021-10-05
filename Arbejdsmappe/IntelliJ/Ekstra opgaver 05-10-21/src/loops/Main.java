package loops;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }
    static String loop1(){
        String loopPattern = "";
        int loopCounter = 0;

        for(int i = 0; i <36; i++){
            if(loopCounter == 8){
                loopPattern += "\n";
                loopCounter = 0;
            }
            else if(loopCounter % 2 == 0){
                loopPattern += "*";
                loopCounter++;
            }
            else{
                loopPattern += "!";
                loopCounter++;
            }
        }
        return loopPattern;
    }

    static String loop2(){
        String loopPattern = "";
        int loopCounter = 0;
        boolean charCheck = true;

        for(int i = 0; i <4; i++){
            for(int j = 0; j < 4; j++){

                if(charCheck){
                    loopPattern += "*";
                    charCheck = false;
                }
                else if(loopPattern.length() == 8) {
                    loopPattern += "!" + "\n";
                }
                else{
                    loopPattern += "!";
                    charCheck = true;
                }
            }
        }
        return loopPattern;
    }

}
