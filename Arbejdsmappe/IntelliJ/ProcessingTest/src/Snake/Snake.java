package Snake;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;
import java.util.Arrays;

public class Snake {
    private PApplet pApplet;
    private int xPos = 0;
    private int yPos = 0;
    private int xSpeed = 1;
    private int ySpeed = 0;
    private int scl;
    private int total = 1;
    private ArrayList<PVector> tail = new ArrayList<>();
    //private PVector[] tail = new PVector[total];

    public Snake(PApplet pApplet, int scl) {
        this.pApplet = pApplet;
        this.scl = scl;
        this.tail.add(new PVector(xPos,yPos));
    }

    public void update() {
        if (this.total > this.tail.size()) {
            this.tail.add(new PVector(this.xPos, this.yPos));
            System.out.println(tail.size());
        }

        this.xPos = this.xPos + this.xSpeed*scl;
        this.yPos = this.yPos + this.ySpeed*scl;

        tail.set(tail.size()-1,new PVector(xPos, yPos) );
        for (int j = 0; j < tail.size()-1; j++) {
            //this.tail.set(j - 1,this.tail.get(j));
            this.tail.get(j).x = this.tail.get(j+1).x;
            this.tail.get(j).y = this.tail.get(j+1).y;
        }

        this.xPos = pApplet.constrain(this.xPos, 0 , pApplet.width-scl);
        this.yPos = pApplet.constrain(this.yPos, 0 , pApplet.height-scl);
    }

    public void show() {
        pApplet.fill(255);

//        for (int i = this.tail.size()-1; i < 0; i--){
//            pApplet.rect(this.tail.get(i).x,this.tail.get(i).y, scl, scl);
//        }

        for(PVector pv : tail){
            pApplet.rect(pv.x,pv.y, scl, scl);
        }

        //pApplet.rect(this.xPos, this.yPos, scl,scl);
    }

    public void dir(int xSpeed, int ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public boolean eat(PVector food){
        float d = pApplet.dist(food.x,food.y, this.xPos, this.yPos);
        if(d < 1){
            this.total++;
            return true;
        }
        else{
            return false;
        }
    }



}
