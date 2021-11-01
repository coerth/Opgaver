import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyTest {
Board board;
Player player1 = new Player("Hans", 30000);
Player player2 = new Player("Dans", 30000);

    @Before
    public void setUp() throws Exception {
        //Main.readGameData();
        String [] data = Main.readFieldsData();;
        board = new Board(data);

    }

    @Test
    public void onLand() {
        Main.currentPlayer = player1;
        int position = Main.getCurrentPlayer().updatePosition(4);
        Field f = board.getField(position);
        f.onLand();
        f.processResponse("Y");
        assertEquals(28800, Main.getCurrentPlayer().getAccount().getBalance());

    }
}