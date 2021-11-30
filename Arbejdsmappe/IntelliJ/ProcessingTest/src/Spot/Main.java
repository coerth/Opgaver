package Spot;

import Image.LoadDisplayImage;
import processing.core.PApplet;

public class Main extends PApplet {

    Spot sp1;
    Spot sp2;

    public static void main(String[] args) {
        //ved at bruge Main.class.getName() så sørger vi får at det altid er det navn, i tilfælde af vi refactorer main
        PApplet.main(new String[]{Main.class.getName()});
    }

    @Override
    public void settings() {
        //visse ting vil hellere stå i settings fremfor setup()
        //man får en fejl hvis det er tilfældet

        size(640, 360);
    }

    @Override
    public void setup() {
        background(204);
        noLoop();

        sp1 = new Spot(this);
        sp2 = new Spot(this, width * 0.5f, height * 0.25f, 120);


    }

    @Override
    public void draw() {
        //her kaldes display funktionerne

        sp1.display();
        sp2.display();

    }

}


