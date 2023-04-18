import java.util.ArrayList;
import java.util.List;

public class CoffeeVender {

    List<Drinks> list = new ArrayList<>();

    public int getSummary() {
        return summary;
    }

    private int summary = 0;

    public CoffeeVender addDrinks(Drinks drinks) {
        list.add(drinks);
        return this;
    }

    public List<Drinks> getList() {
        return list;
    }

    public Drinks findDrinks(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Drinks sellDrinks(Drinks drinks) {
        try {
            Drinks drinkFound = findDrinks(drinks.getName());
            getList().remove(drinkFound);
            summary += drinkFound.getCost();
            return drinkFound;

        } catch (Exception ex) {
            throw new RuntimeException("\u001B[31mSorry! We are out of that drink!");

        }
    }
}
