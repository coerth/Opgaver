package Snake;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.Random;

import static processing.core.PApplet.floor;

public class Food {

    private PApplet pApplet;
    private int scale;
    private PVector pVector;
    private float red;
    private float green;
    private float blue;

    public Food(PApplet pApplet, int scale) {
        this.pApplet = pApplet;
        this.scale = scale;
        randomiseColor();
        pickLocation();
    }

    public void display() {
        pApplet.fill(red, green, blue);
        pApplet.rect(pVector.x, pVector.y, scale, scale);
    }

    public void pickLocation() {
        Random rand = new Random();
        int cols = floor(pApplet.width / scale);
        int rows = floor(pApplet.height / scale);
        pVector = new PVector(floor(rand.nextInt(cols)), floor(rand.nextInt(rows)));
        pVector.mult(scale);

//        while (pVectorArrayList.contains(pVector)) {
//            pVector = new PVector(floor(rand.nextInt(cols)), floor(rand.nextInt(rows)));
//            pVector.mult(scale);
//        }
        randomiseColor();
    }

    public PVector getpVector() {
        return pVector;
    }

    private void randomiseColor(){
        this.red = pApplet.random(255);
        this.green = pApplet.random(255);
        this.blue = pApplet.random(255);
    }
}
