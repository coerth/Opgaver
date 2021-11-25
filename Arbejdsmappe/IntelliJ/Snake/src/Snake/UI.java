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

    public void startGameScreen(){
        displayGameScreen("Press Enter to start", 0.3f,40 );
        displayGameScreen("Press S for settings", 0.5f,20 );
    }

    public void settingsScreen(float difficultyModifier){
        displayGameScreen("Choose Speed:",0.3f, 40);
        if(difficultyModifier == 1.5){
            displayGameScreen("1. Fast."+ " <-- Selected",0.4f, 20);
        }
        else {
            displayGameScreen("1. Fast.", 0.4f, 20);
        }
        if(difficultyModifier == 1){
            displayGameScreen("2. Medium."+ " <-- Selected",0.5f, 20);
        }
        else {
            displayGameScreen("2. Medium.", 0.5f, 20);
        }
        if(difficultyModifier == 0.5){
            displayGameScreen("3. Slow."+ " <-- Selected",0.6f, 20);
        }
        else {
            displayGameScreen("3. Slow", 0.6f, 20);
        }
    }

    public void endgameScreen(int score){
        displayGameScreen("Game Over!",0.3f, 50);
        displayGameScreen("Score: "+score, 0.5f, 40);
        displayGameScreen("Play again? Y/N",0.65f,40);
        displayGameScreen("Press S for settings", 0.9f,20 );
    }

    public void victoryScreen(int score) {
        displayGameScreen("You Win!",0.3f, 50);
        displayGameScreen("Score: "+score, 0.5f, 40);
        displayGameScreen("Play again? Y/N",0.65f,40);
        displayGameScreen("Press S for settings", 0.9f,20 );
    }
}
