package Opgave_7;

public abstract class Fruit implements Edible {

    boolean ripe;

    public boolean isRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }
}
