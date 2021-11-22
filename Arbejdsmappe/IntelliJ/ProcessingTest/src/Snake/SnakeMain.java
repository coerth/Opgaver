package Snake;

import Image.LoadDisplayImage;
import Spot.Spot;
import processing.core.PApplet;
import processing.core.PVector;

import java.util.Random;

public class SnakeMain extends PApplet {

    Snake s;
    int scl = 20;
    PVector food;



    public static void main(String[] args) {

        PApplet.main(new String[] {SnakeMain.class.getName()});
    }

    @Override
    public void settings() {
        size(600,600);

    }

    @Override
    public void setup(){
        s = new Snake(this, scl);
        frameRate = 1;

        //food = new PVector(floor(random(width/scl)),floor(random(height/scl)));
        food = pickLocation();

    }

    @Override
    public void draw() {
        //her kaldes display funktionerne
        background(51);
        s.update();
        s.show();
        delay(70);

        if(s.eat(food)){
            food = pickLocation();
        }

        fill(255,0,100);
        rect(food.x, food.y, scl,scl);
    }

    @Override
    public void keyPressed() {
        if ( keyCode == UP){
            s.dir(0,-1);
        }
        else if (keyCode == DOWN){
           s.dir(0,1);
        }
        else if (keyCode == RIGHT){
            s.dir(1,0);
        }
        else if (keyCode == LEFT){
            s.dir(-1,0);
        }
    }

    public PVector pickLocation(){
        Random rand = new Random();
        int cols = floor(width/scl);
        int rows = floor(height/scl);
        food = new PVector(floor(rand.nextInt(cols)),floor(rand.nextInt(rows)));
        food.mult(scl);

        return food;
    }
}

