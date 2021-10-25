public class Dice {
    private int die1;
    private int die2;
    private boolean pair;

    public Dice() {
    }

    public int throwDice(){
        die1 = (int) (6*Math.random() + 1);
        die2 = (int) (6*Math.random() + 1);

        if(die1 == die2) pair = true;
        else pair = false;

        return die1+die2;
    }

    public boolean getPair() { return pair;}
}




/*import java.util.Random;

public class Dice {

    private int num1;
    private int num2;

    public Dice() {
    }

    public int throwDice(){
        Random rand = new Random();
        int total;
        this.num1 = rand.nextInt(1,7);
        this.num2 = rand.nextInt(1,7);

        total = num1 + num2;

        return total;

    }
}*/
