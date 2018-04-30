import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TictactoeShould {

    public static final char _ = '*';
    public static final char X = 'X';
    public static final char O = 'O';

    @Test
    public void let_X_not_win_on_empty_field() {
        //arrange (given)
        SpielfeldStatus status = new SpielfeldStatus(asList(
                _, _, _,
                _, _, _,
                _, _, _
        ));

        //act (when)

        //assert (then we expect)
        assertFalse(status.xWins());
    }


    // add other "row" cases and diagonal cases?

    @Test
    public void let_X_win_if_3_X_in_a_row() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                X, X, X,
                _, _, _,
                _, _, _));

        assertTrue(status.xWins());
    }

    @Test
    public void let_X_win_if_3_X_in_a_column() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                X, _, _,
                X, _, _,
                X, _, _));

        assertTrue(status.xWins());
    }

    @Test
    public void let_X_win_if_3_X_in_second_column() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                _, X, _,
                _, X, _,
                _, X, _));

        assertTrue(status.xWins());
    }

    @Test
    public void let_X_not_win_if_3_X_not_in_row() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                X, X, _,
                _, _, X,
                _, _, _));

        assertFalse(status.xWins());

    }


    //one x could be at another position... Say max. 8 'x' in list?

    @Test
    public void let_X_not_win_if_only_one_field_is_filled() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                X, _, _,
                _, _, _,
                _, _, _
        ));
        assertFalse(status.xWins());
    }

    @Test
    public void let_X_not_win_if_only_two_fields_are_filled() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                X, X, _,
                _, _, _,
                _, _, _
        ));

        assertFalse(status.xWins());
    }

    @Test
    public void let_X_not_win_if_field_is_full_with_o() {
        SpielfeldStatus status = new SpielfeldStatus(asList(
                O, O, O,
                O, O, O,
                O, O, O
        ));
        assertFalse(status.xWins());
    }




}
