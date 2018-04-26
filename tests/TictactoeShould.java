import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TictactoeShould {

    @Test
    public void let_X_not_win_on_empty_field() {
        //arrange (given)
        char input = 'X';
        SpielfeldStatus status = new SpielfeldStatus (Arrays.asList());

        //act (when)

        //assert (then we expect)
        assertFalse(status.xWins());
    }

    @Test
    public void let_X_win_if_3_X_in_a_row() {
        char input = 'X';
        SpielfeldStatus status = new SpielfeldStatus(Arrays.asList('X','X','X'));

        assertTrue(status.xWins());
    }






}
