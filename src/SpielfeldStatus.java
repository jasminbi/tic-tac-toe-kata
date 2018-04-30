import java.util.List;

public class SpielfeldStatus {


    private final List<Character> fields;


    public SpielfeldStatus(List<Character> fields) {

        this.fields = fields;
    }


    //Methoden
    public boolean xWins() {
        int countX = 0;
        for (Character field : fields) {
            if (field.equals('X')) {
                countX += 1;
                if (countX > 2) {
                    return true;
                }
            } else {
                countX = 0;
            }
        }

        return false;


    }


}
