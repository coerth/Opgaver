import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface CombatTest {
    Combat createNewCombat();

    @Test
    default void attackRolls()
    {
        Combat c  = createNewCombat();
        assertEquals(4,c.attack());
    }

    @Test
    default void throwsArithmicException(){
        Combat c = createNewCombat();
        assertThrows(ArithmeticException.class , () -> c.takeDMG(-1));
    }
}
