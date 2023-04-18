public class HotChocolate extends Drinks{

    private final String color;

    public HotChocolate(String name, Integer volume, Integer temperature, Integer cost, String color) {
        super(name, volume, temperature, cost);
        this.color = color;

    }
    
    @Override
    public String toString() {
        
        return super.toString()+", "+color;
    }
}
