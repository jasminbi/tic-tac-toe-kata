import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TictactoeShould {

    @Test
    public void state_if_x_wins() {
        //arrange (given)
        char input = 'X';
        SpielfeldStatus status = new SpielfeldStatus ();

        //act (when)

        //assert (then we expect)
        assertFalse(status.xWins());
    }




}
