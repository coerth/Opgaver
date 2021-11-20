package Balls;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BallsMain extends PApplet {

    ArrayList<Ball> ballArrayList;
    int ballWidth = 48;
    boolean isPressed;
    static Scanner scan = new Scanner(System.in);
    static String userInput = "";

    public static void main(String[] args) {
        //ved at bruge Main.class.getName() så sørger vi får at det altid er det navn, i tilfælde af vi refactorer main
        PApplet.main(new String[] {BallsMain.class.getName()});


    }

    @Override
    public void settings() {

        size(640,360);
    }

    @Override
    public void setup(){
        noStroke();

        //create an empty Arraylist (will store ball objects)
        ballArrayList = new ArrayList<>();

        // Start by adding one element
       // ballArrayList.add(new Ball(this,width/2f,0,ballWidth));



    }

    @Override
    public void draw() {
        //her kaldes display funktionerne
            if (!isPressed) {
                background(255);
                fill(0);
                textSize(50);
                textAlign(CENTER);
                text("Press a button to start", width / 2f, height / 2f);
            } else if (isPressed) {
                background(255);

                for (int i = ballArrayList.size() - 1; i >= 0; i--) {
                    Ball ball = ballArrayList.get(i);
                    ball.move();
                    ball.display();
                    if (ball.finished()) {
                        ballArrayList.remove(i);
                    }
                }

            }
        //man kan bruge et for each loop
//        ballArrayList.forEach(ball -> {
//            ball.move();
//            ball.display();
//        });
        //så skal man bare køre endnu et loop for at tjekke om ball.finished er true
//        ballArrayList.removeIf(Ball::finished);
    }

    @Override
    public void mousePressed() {
        // a new ball object is added to the Arraylist
        if (isPressed) {
            ballArrayList.add(new Ball(this, mouseX, mouseY, ballWidth));
        }
    }

        @Override
        public void keyPressed() {
            isPressed = keyPressed;


            }
}




