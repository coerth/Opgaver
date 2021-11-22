package Snake;

import processing.core.PApplet;

import static java.awt.event.KeyEvent.VK_S;

public class Main extends PApplet {

    Controller controller;


    public static void main(String[] args) {

        PApplet.main(new String[] {Main.class.getName()});
    }

    @Override
    public void settings() {
        size(400,400);

    }

    @Override
    public void setup(){
        controller = new Controller(this, 20);
    }

    @Override
    public void draw() {
        //her kaldes display funktionerne
        background(51);
        if (controller.isGameOver()) {
            controller.endgameScreen();
            if (controller.isSetting()) {
                background(51);
                controller.settingsMenu();
            }
        }

            if (!controller.isPressed() && !controller.isGameOver()) {
                background(51);

                controller.startGameScreen();
                if (controller.isSetting()) {
                    background(51);
                    controller.settingsMenu();
                }

            } else if (controller.isPressed() && !controller.isGameOver()) {
                controller.playGame();
            }
        }


    @Override
    public void keyPressed() {


        if ( keyCode == UP && !controller.isDown()){
            controller.getSnake().dir(0,-1);
            controller.setUp(true);
            controller.setDown(false);
            controller.setRight(false);
            controller.setLeft(false);

        }
        else if (keyCode == DOWN && !controller.isUp()){
            controller.getSnake().dir(0,1);
            controller.setUp(false);
            controller.setDown(true);
            controller.setRight(false);
            controller.setLeft(false);
        }
        else if (keyCode == RIGHT && !controller.isLeft()){
            controller.getSnake().dir(1,0);
            controller.setUp(false);
            controller.setDown(false);
            controller.setRight(true);
            controller.setLeft(false);
        }
        else if (keyCode == LEFT && !controller.isRight()){
            controller.getSnake().dir(-1,0);
            controller.setUp(false);
            controller.setDown(false);
            controller.setRight(false);
            controller.setLeft(true);
        }
        else if(keyCode == ENTER){
            controller.setPressed(true);
        }

        else if(keyCode == VK_S){
            controller.setSetting(true);
        }
    }

}

