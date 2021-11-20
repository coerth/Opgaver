package Balls;

import processing.core.PApplet;
import processing.core.*;

import java.util.Random;

public class Ball {

    Random random = new Random();
    PApplet pApplet;
    float x;
    float y;
    float speed;
    float gravity;
    float w;
    float life = 255;
    float colorRed = random.nextFloat(1,255);
    float colorBlue = random.nextFloat(1,255);
    float colorGreen = random.nextFloat(1,255);

    public Ball(PApplet pApplet, float x, float y, float w) {
        this.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.w = w;
        this.speed = 0;
        this.gravity = 0.1f;
    }

    void move() {
        //add gravity to speed
        speed = speed + gravity;
        // add speed to y location
        y = y + speed;
        // if square reaches the bottom
        // reverse speed
        if (y > pApplet.height){
            //dampening
            speed = speed * -0.8f;
            y = pApplet.height;
        }
    }

    boolean finished(){
        //Balls fade out
        life--;
        if(life < 0){
            return true;
        }
        else{
            return false;
        }
    }

    void display() {
        //display the circle
        //pApplet.fill(0,life);
        pApplet.fill(colorRed,colorGreen,colorBlue,life);
        //stroke(0,life);
        pApplet.ellipse(x,y,w,w);


    }

}
