public interface PlayerI extends PickupI, BuyI, SleepI, CombatI, DisplayI, MovementI {

    @Override
    default int attack() {
        return 0;
    }

    @Override
    default void takeDMG(int dmg) {

    }

    @Override
    default void display() {

    }

    @Override
    default void movement() {

    }

    @Override
    default void interact() {
        PickupI.super.interact();
    }
}
