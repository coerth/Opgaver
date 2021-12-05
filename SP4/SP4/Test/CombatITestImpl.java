import Interfaces.CombatI;

public class CombatITestImpl implements CombatITest {


    @Override
    public CombatI createNewCombat() {
        return new Player(10,4);
    }


}
