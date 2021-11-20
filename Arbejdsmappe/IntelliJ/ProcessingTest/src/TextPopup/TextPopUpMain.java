package TextPopup;

import Image.LoadDisplayImage;
import Spot.Spot;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TextPopUpMain extends PApplet {

   static ArrayList<Match> matches = new ArrayList<>();


   static int current;
   //static PApplet pApplet
   static Scanner scan = new Scanner(System.in);
   static String userInput = "";


    LoadDisplayImage loadDisplayImage;
    public static void main(String[] args) {
        //ved at bruge Main.class.getName() så sørger vi får at det altid er det navn, i tilfælde af vi refactorer main

        PApplet.main(new String[] {TextPopUpMain.class.getName()});

//        System.out.println("Her når vi til");
//        while(!userInput.equals("Q".toLowerCase(Locale.ROOT).trim())) {
//            userInput = scan.nextLine();
//        }

        }


    @Override
    public void settings() {
        size(640,360);
    }

    @Override
    public void setup(){
        frameRate(SCREEN);
        background(204);
        // noLoop();
        matches.add(new Match(this, "Navi", "Folketinget"));
        matches.add(new Match(this, "Pepsilax", "Astralis"));

    }

    @Override
    public void draw(){
        //her kaldes display funktionerne

//        background(255);
//        fill(0);
//        textSize(50);
//        textAlign(CENTER);
//        text(userInput, width / 2f, height / 2f);

        for (int i = 0; i < matches.size(); i++){
            while(matches.get(i).matchFinished == false) {
                matches.get(i).display();
                matches.get(i).processMatch();
                matches.get(i).display();
            }

       }

        //shape.display();



    }



    @Override
    public void keyPressed() {
        //key = String.valueOf(keyCode);
    }

    //    @Override
//    public void keyTyped() {
//        if(keyCode == 1){
//            shape = new Box(this, width/2,height/2, 20,20);
//        }
//        else if(keyCode == 2){
//                shape = new Circle(this, width/2,height/2, 20,20);
//        }
//    }
}

