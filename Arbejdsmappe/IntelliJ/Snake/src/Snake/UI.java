package Snake;

import processing.core.PApplet;

public class UI {
    PApplet pApplet;

    public UI(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    public void displayGameScreen(String s, float v, int size) {
        pApplet.fill(255);
        pApplet.textSize(size);
        pApplet.textAlign(pApplet.CENTER);
        pApplet.text(s, pApplet.width * 0.5f, pApplet.height * v);
    }



}
