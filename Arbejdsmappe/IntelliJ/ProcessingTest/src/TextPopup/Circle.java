package TextPopup;

import processing.core.PApplet;


public class Circle extends Shape{

    public Circle(PApplet pApplet, float xPos, float yPos, float width, float height) {
        super(pApplet, xPos, yPos, width, height);
    }

    @Override
    void display(){
        super.pApplet.ellipse(super.xPos, super.yPos, super.width, super.height);
    }
}
