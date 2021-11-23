package Snake;

import processing.core.PApplet;

import static java.awt.event.KeyEvent.*;

public class Controller {
    private PApplet pApplet;
    private Snake s;
    private  Food food;
    private UI ui;
    private int scale;
    private boolean isPressed;
    private  boolean up = false;
    private boolean down = false;
    private  boolean right = true;
    private  boolean left = false;
    private int score = 0;
    private boolean isGameOver;
    private float difficultyModifier = 1;
    private int difficultySpeed = 70;
    private boolean isSetting;

    public Controller(PApplet pApplet, int scale) {
        this.pApplet = pApplet;
        this.scale = scale;
        s = new Snake(pApplet, this.scale);
        food = new Food(pApplet, this.scale);
        ui = new UI(pApplet);
    }

    public void playGame() {
        s.update();
        s.display();
        pApplet.delay(difficultySpeed);

        if (s.eat(food.getpVector())) {
            boundary();
            this.score += 100 * difficultyModifier;
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

    public void startGameScreen(){
        ui.displayGameScreen("Press Enter to start", 0.3f,40 );
        ui.displayGameScreen("Press S for settings", 0.5f,20 );
        startGameOptions();
    }

    public void startGameOptions(){
        if(pApplet.keyCode == VK_ENTER){
            setPressed(true);
        }

        else if(pApplet.keyCode == VK_S){
            setSetting(true);
        }
    }

    public void settingsMenu(){
        ui.displayGameScreen("Choose Speed:",0.3f, 40);
        if(difficultyModifier == 1.5){
            ui.displayGameScreen("1. Fast."+ " <-- Selected",0.4f, 20);
        }
        else {
            ui.displayGameScreen("1. Fast.", 0.4f, 20);
        }
        if(difficultyModifier == 1){
            ui.displayGameScreen("2. Medium."+ " <-- Selected",0.5f, 20);
        }
        else {
            ui.displayGameScreen("2. Medium.", 0.5f, 20);
        }
        if(difficultyModifier == 0.5){
            ui.displayGameScreen("3. Slow."+ " <-- Selected",0.6f, 20);
        }
        else {
            ui.displayGameScreen("3. Slow", 0.6f, 20);
        }
        settingsOptions();
    }

    private void settingsOptions(){
        if(pApplet.keyCode == VK_1 && isSetting){
            this.difficultySpeed = 40;
            this.difficultyModifier = 1.5f;
            setSetting(false);
        }
        else if(pApplet.keyCode == VK_2 && isSetting){
            this.difficultySpeed = 70;
            this.difficultyModifier = 1f;
            setSetting(false);
        }
        else if(pApplet.keyCode == VK_3 && isSetting){
            this.difficultySpeed = 100;
            this.difficultyModifier = 0.5f;
            setSetting(false);
        }
    }

    public void endgameScreen(){
        ui.displayGameScreen("Game Over!",0.3f, 50);
        ui.displayGameScreen("Score: "+score, 0.5f, 40);
        ui.displayGameScreen("Play again? Y/N",0.65f,40);
        ui.displayGameScreen("Press S for settings", 0.9f,20 );
        endGameOptions();
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
        else if(pApplet.keyCode == VK_S && isGameOver){
            setSetting(true);
        }
        else if (pApplet.keyCode == VK_N && isGameOver){
            pApplet.exit();
        }
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

    public UI getUi() {
        return ui;
    }
}
