package TextPopup;

import processing.core.PApplet;

public class Box extends Shape{


    public Box(PApplet pApplet, float xPos, float yPos, float width, float height) {
        super(pApplet, xPos, yPos, width, height);
    }

    @Override
    void display(){
        super.pApplet.rect(super.xPos, super.yPos, super.width, super.height);
    }
}
