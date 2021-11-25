package Snake;

import processing.core.PApplet;

import static java.awt.event.KeyEvent.*;

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
        if(controller.isVictoryCondition() && controller.isGameOver()){
            controller.getUi().victoryScreen(controller.getScore());
            controller.victoryOptions();
            if (controller.isSetting()) {
                background(51);
                controller.getUi().settingsScreen(controller.getDifficultyModifier());
                controller.settingsOptions();
            }
        }

        //background(51);
        else if (controller.isGameOver()) {
            controller.getUi().endgameScreen(controller.getScore());
            controller.endGameOptions();
            if (controller.isSetting()) {
                background(51);
                controller.getUi().settingsScreen(controller.getDifficultyModifier());
                controller.settingsOptions();
            }
        }

            if (!controller.isPressed() && !controller.isGameOver()) {
                background(51);

                controller.getUi().startGameScreen();
                controller.startGameOptions();
                if (controller.isSetting()) {
                    background(51);
                    controller.getUi().settingsScreen(controller.getDifficultyModifier());
                    controller.settingsOptions();
                }

            } else if (controller.isPressed() && !controller.isGameOver()) {
                controller.playGame();
            }
        }


    @Override
    public void keyPressed() {


        if ( keyCode == UP && !controller.isDown() ||
             keyCode == VK_W && !controller.isDown()){
            controller.getSnake().dir(0,-1);
            controller.setUp(true);
            controller.setDown(false);
            controller.setRight(false);
            controller.setLeft(false);

        }
        else if (keyCode == DOWN && !controller.isUp() ||
                keyCode == VK_S && !controller.isUp()){
            controller.getSnake().dir(0,1);
            controller.setUp(false);
            controller.setDown(true);
            controller.setRight(false);
            controller.setLeft(false);
        }
        else if (keyCode == RIGHT && !controller.isLeft() ||
                keyCode == VK_D && !controller.isLeft()){
            controller.getSnake().dir(1,0);
            controller.setUp(false);
            controller.setDown(false);
            controller.setRight(true);
            controller.setLeft(false);
        }
        else if (keyCode == LEFT && !controller.isRight() ||
                keyCode == VK_A && !controller.isRight()){
            controller.getSnake().dir(-1,0);
            controller.setUp(false);
            controller.setDown(false);
            controller.setRight(false);
            controller.setLeft(true);
        }
    }

}

