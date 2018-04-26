import java.util.List;

public class SpielfeldStatus {


    private final List<Object> fields;


    public SpielfeldStatus(List<Object> fields) {

        this.fields = fields;
    }


    //Methoden
    public boolean xWins() {
        return !fields.isEmpty();
    }

}
