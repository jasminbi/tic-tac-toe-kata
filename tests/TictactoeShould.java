import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TictactoeShould {

    @Test
    public void let_X_not_win_on_empty_field() {
        //arrange (given)
        SpielfeldStatus status = new SpielfeldStatus (emptyList());

        //act (when)

        //assert (then we expect)
        assertFalse(status.xWins());
    }

    @Test
    public void let_X_win_if_3_X_in_a_row() {
        SpielfeldStatus status = new SpielfeldStatus(asList('X','X','X'));

        assertTrue(status.xWins());
    }

    @Test
    public void let_X_not_win_if_only_one_x_on_field() {
        SpielfeldStatus status = new SpielfeldStatus(asList('X'));

        assertFalse(status.xWins());
    }






}
