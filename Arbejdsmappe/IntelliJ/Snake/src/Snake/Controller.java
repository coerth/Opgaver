package Snake;

import processing.core.PApplet;

import static java.awt.event.KeyEvent.*;
import static processing.core.PConstants.*;

public class Controller {
    private PApplet pApplet;
    private Snake s;
    private int scale;
    private  Food food;
    private boolean isPressed;
    private  boolean up = false;
    private boolean down = false;
    private  boolean right = true;
    private  boolean left = false;
    private int score = 0;
    private boolean isGameOver;
    private float difficulty = 1;
    private int difficultyChoice = 70;
    private boolean isSetting;

    public Controller(PApplet pApplet, int scale) {
        this.pApplet = pApplet;
        this.scale = scale;
        s = new Snake(pApplet, this.scale);
        food = new Food(pApplet, this.scale);
    }

    private void endGameOptions(){
        if (pApplet.keyCode == VK_Y && isGameOver){
            this.score = 0;
            s = new Snake(pApplet, scale);
            isGameOver = false;
            food.pickLocation();
            up = false;
            down = false;
            right = true;
            left = false;
        }
        else if (pApplet.keyCode == VK_N && isGameOver){
            pApplet.exit();
        }
    }

    private void settingsOptions(){
        if(pApplet.keyCode == VK_1 && isSetting){
            this.difficultyChoice = 40;
            this.difficulty = 1.5f;
            setSetting(false);
        }
        else if(pApplet.keyCode == VK_2 && isSetting){
            this.difficultyChoice = 70;
            this.difficulty = 1f;
            setSetting(false);
        }
        else if(pApplet.keyCode == VK_3 && isSetting){
            this.difficultyChoice = 100;
            this.difficulty = 0.5f;
            setSetting(false);
        }

    }

    public void playGame() {
        s.update();
        s.display();
        pApplet.delay(difficultyChoice);

        if (s.eat(food.getpVector())) {
            boundary();
            this.score += 100 * difficulty;
        }

        food.display();

        if(s.collision()){
            isGameOver = true;

        }
    }

    private void boundary(){
        while(s.getTail().contains(food.getpVector())){
            food.pickLocation();
        }
    }

    private void displayGameScreen(String s, float v, int size) {
        pApplet.fill(255);
        pApplet.textSize(size);
        pApplet.textAlign(pApplet.CENTER);
        pApplet.text(s, pApplet.width * 0.5f, pApplet.height * v);
    }

    public void endgameScreen(){
        displayGameScreen("Game Over!",0.3f, 50);
        displayGameScreen("Score: "+score, 0.5f, 40);
        displayGameScreen("Play again? Y/N",0.65f,40);
        endGameOptions();
    }

    public void startGameScreen(){
        displayGameScreen("Press Enter to start", 0.3f,40 );
        displayGameScreen("Press S for settings", 0.5f,20 );
    }

    public void settings(){
        displayGameScreen("Choose Speed:",0.3f, 40);
        displayGameScreen("1. Fast",0.4f, 20);
        displayGameScreen("2. Medium <- Default",0.5f, 20);
        displayGameScreen("3. Slow",0.6f, 20);
        settingsOptions();
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public Snake getSnake() {
        return s;
    }

    public Food getFood(){
        return food;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public boolean isSetting() {
        return isSetting;
    }

    public void setSetting(boolean setting) {
        isSetting = setting;
    }
}
