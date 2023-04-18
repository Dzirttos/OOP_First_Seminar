import java.util.function.ToDoubleBiFunction;

public class Tea extends Drinks{

    private final String type;

    public Tea(String name, Integer volume, Integer temperature, Integer cost, String type) {
        super(name, volume, temperature, cost);
        this.type = type;
       
    }

    @Override
    public String toString() {

        return super.toString() + ", " + type;
    }
    
}
