import java.util.List;

public class ValueList {

    private final List<Character> values;

    public ValueList(List<Character> values) {
        this.values = values;

    }

    public Boolean checkValue(char x, int i) {
        return !values.isEmpty() && x == values.get(i);
    }
}
