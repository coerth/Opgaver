import processing.core.PApplet;
import processing.core.PFont;

public class ProcessingTest extends PApplet {

    String test = "Hej";
    PFont f;
    String teamA = "teamA";
    String teamB = "teamB";
    public static void main(String[] args) {
        PApplet.main("Main", args);

    }

    public void settings(){
        size(500,500);
    }

    public void setup(){
        System.out.println(test);

        f = createFont("Arial", 16,true);


    }


    public void draw() {
        background(255);
        //line(5,5,50,50);
        textFont(f,30);
        fill(0);
        textAlign(CENTER);
        text("Match between "+teamA+" and "+teamB,width/2,50);


    }

    public void circle(){
        circle(width/2,height/2,40);
    }
}
