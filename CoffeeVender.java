import java.util.ArrayList;
import java.util.List;

public class CoffeeVender {

    List<Drinks> list = new ArrayList<>();

    public CoffeeVender addDrinks(Drinks drinks) {
        list.add(drinks);
        return this;
    }

    public List<Drinks> getList() {
        return list;
    }
}
