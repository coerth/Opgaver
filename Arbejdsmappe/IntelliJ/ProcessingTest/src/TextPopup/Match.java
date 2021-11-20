package TextPopup;

import processing.core.PApplet;

import java.util.Scanner;

public class Match {
    PApplet pApplet;
    String holdAName;
    String holdBName;
    int holdAScore = 0;
    int holdBScore = 0;
    Scanner scan;
    boolean matchFinished;

    public Match(PApplet pApplet,String holdAName, String holdBName) {
        this.pApplet = pApplet;
        this.holdAName = holdAName;
        this.holdBName = holdBName;
    }

    void processMatch() {
        //while (!matchFinished) {
            holdAScore = Integer.parseInt(userInput("Hvad har HoldA af score?"));
            holdBScore = Integer.parseInt(userInput("Hvad har HoldB af score?"));

            if (holdAScore == 10 && holdBScore != 10 || holdBScore == 10 && holdAScore != 10) {
                matchFinished = true;

            }
        //}
    }

        public String userInput(String message){
            Scanner scan = new Scanner(System.in);
            String userInput = "";

            System.out.println(message);
            userInput = scan.nextLine();

            return userInput;
        }

        void display(){

            pApplet.background(255);
            pApplet.fill(0);
            pApplet.textSize(40);
            pApplet.textAlign(pApplet.CENTER);
            pApplet.text("Kamp mellem "+holdAName + " og " + holdBName, pApplet.width / 2f, pApplet.height / 3f);

            pApplet.text(holdAName+ "'s score = "+holdAScore, pApplet.width / 2f, pApplet.height / 2f);

            pApplet.text(holdBName + "'s score = "+holdBScore, pApplet.width / 2f, pApplet.height / 1.5f);

        }

    public String getHoldAName() {
        return holdAName;
    }

    public String getHoldBName() {
        return holdBName;
    }

    public int getHoldAScore() {
        return holdAScore;
    }

    public int getHoldBScore() {
        return holdBScore;
    }

    public boolean isMatchFinished() {
        return matchFinished;
    }
}
