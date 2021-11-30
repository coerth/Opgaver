package Spot;

import processing.core.PApplet;

public class Spot {

   private float xPos;
   private float yPos;
   private float radius;
   //klasser skal have en PApplet for at kunne kaldes og vises
   private PApplet pApplet;

   //man kan tilføje PAplet til constructoren, i tilfælde af at man have forskellige PApplet der har forskellige parametere
    public Spot(PApplet pApplet) {
        this.pApplet = pApplet;
        this.xPos = pApplet.width * 0.25f;
        this.yPos = pApplet.height* 0.5f;
        this.radius = 40;
    }

    //man kan tilføje PAplet til constructoren, i tilfælde af at man have forskellige PApplet der har forskellige parametere
    public Spot(PApplet pApplet, float xPos, float yPos, float radius){
        this.pApplet = pApplet;
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    //grafisk funktion som kaldes i draw
    //det som ligger i processing kan findes via at skrive pApplet.
    void display(){
        pApplet.ellipse(xPos, yPos, radius*2, radius*2);

    }
}
