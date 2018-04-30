import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListOfValuesShould {

    @Test
    public void return_false_if_ValueList_is_empty(){
        ValueList valueList = new ValueList(emptyList());
        Boolean result = valueList.checkValue('X', 0);
        assertFalse(result);
    }

    @Test
    public void return_true_if_ValueList_contains_x(){
        ValueList valueList = new ValueList(asList(
                'X'
        ));
        Boolean result = valueList.checkValue('X',0);
        assertTrue(result);
    }

    @Test
    public void return_true_if_ValueList_contains_x_at_given_index(){
        ValueList valueList = new ValueList(asList(
                'X','*'
        ));
        Boolean result = valueList.checkValue('X',1);
        assertFalse(result);
    }



}
