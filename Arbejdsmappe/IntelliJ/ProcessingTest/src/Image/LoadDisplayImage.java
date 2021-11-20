package Image;

import processing.core.PApplet;
import processing.core.PImage;

public class LoadDisplayImage extends PApplet {

    PImage img;
    public static void main(String[] args) {
        //ved at bruge Main.class.getName() så sørger vi får at det altid er det navn, i tilfælde af vi refactorer main
        PApplet.main(new String[] {LoadDisplayImage.class.getName()});
    }

    @Override
    public void settings() {
        size(1920,1080);
    }

    @Override
    public void setup(){
        img = loadImage("Data/test.jpg");

    }

    @Override
    public void draw(){
        //her kaldes display funktionerne
        image(img, 0,0);
        image(img,0, height/2f, img.width/2f,img.height/2f);


    }


}


