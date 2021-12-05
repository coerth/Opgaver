import Interfaces.*;

public class Player extends Entity implements PlayerI{


    public Player(int HP, int attack) {
        super(HP, attack);
    }

    @Override
    public int attack() {
        return super.getAttack();
    }

    @Override
    public void takeDMG(int dmg) {
        if(dmg < 0){
            throw new ArithmeticException("Damage has to be higher than 0.");
        }
            super.setHP(super.getHP() - dmg);

    }

    @Override
    public void display() {

    }

    @Override
    public void interact() {

    }

    @Override
    public void movement() {

    }
}
