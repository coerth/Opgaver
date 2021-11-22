package Snake;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Snake {
    private PApplet pApplet;
    private int xPos = 0;
    private int yPos = 0;
    private int xSpeed = 1;
    private int ySpeed = 0;
    private int scale;
    private int total = 1;
    private ArrayList<PVector> tail = new ArrayList<>();

    public Snake(PApplet pApplet, int scl) {
        this.pApplet = pApplet;
        this.scale = scl;
        this.tail.add(new PVector(xPos,yPos));
    }

    public void update() {
        if (this.total > this.tail.size()) {
            this.tail.add(0,new PVector(this.xPos, this.yPos));
        }

        for (int j = 0; j < tail.size()-1; j++) {
            //this.tail.set(j - 1,this.tail.get(j));
            this.tail.get(j).x = this.tail.get(j+1).x;
            this.tail.get(j).y = this.tail.get(j+1).y;
        }

        this.xPos = this.xPos + this.xSpeed* scale;
        this.yPos = this.yPos + this.ySpeed* scale;

        tail.set(tail.size()-1,new PVector(xPos, yPos) );
    }

    public void display() {
        pApplet.fill(255);

        for(PVector pv : tail){
            pApplet.rect(pv.x,pv.y, scale, scale);
        }
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


    public ArrayList<PVector> getTail() {
        return tail;
    }

    public boolean collision(){
      boolean isCollision = false;
        for(int i = 0; i < tail.size()-2; i++) {
            if (tail.get(tail.size() - 1).x == tail.get(i).x && tail.get(tail.size() - 1).y == tail.get(i).y) {
                isCollision = true;
            }
        }
            if(tail.get(tail.size()-1).x > pApplet.width || tail.get(tail.size()-1).x < 0 ){
                isCollision = true;
            }
            else if(tail.get(tail.size()-1).y > pApplet.height || tail.get(tail.size()-1).y < 0 ){
                isCollision = true;
            }

        return isCollision;
    }
}
