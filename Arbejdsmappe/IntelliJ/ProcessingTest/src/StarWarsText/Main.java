package StarWarsText;

import processing.core.PApplet;

public class Main extends PApplet {

    float textY;
    String crawl;

    public static void main(String[] args) {

        PApplet.main(new String[]{Main.class.getName()});
    }

    @Override
    public void settings() {
        //visse ting vil hellere stå i settings fremfor setup()
        //man får en fejl hvis det er tilfældet

        size(800, 640, P3D);
        crawl = "The year is 2042. \n\nThe way of training new programmers has changed. \nA.I. does all the coding and automation has taken over production. \n\nWhich means new candidates need to be tested on different qualities. \nTheir ability to both problem solve and survive in a competitive environment. \n\nThe last exam for the student involves navigating the basement of CPH Lyngby. \nSolving riddles and defeating the remnants of previous failed students. \n\nWho got what it takes to become a programmer?";
    }

    @Override
    public void setup() {
        background(204);
    }

    @Override
    public void draw() {
        //det her er den "nye" main.
        background(0);
        fill(255,255,0);
        translate(width/2f-400, height);
        rotateX(PI/3.0f);
        textSize(75);
        text(crawl, 0, textY, 1100, 3600);
        textY -= 1;

    }

}
