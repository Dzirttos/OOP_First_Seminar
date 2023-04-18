/**
 * Создать торговый кофейный автомат, напитки в автомате должны содержать
 * следующие данные: наименование, объем, температура, цена.
 * Проинициализировать несколько напитков в классе main и торговый автомат,
 * воспроизвести логику продажи напитков. Сделать на основе ООП
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        CoffeeVender coffeeVender = new CoffeeVender();
        coffeeVender.addDrinks(new Drinks("Espresso", 35, 88, 120))
                .addDrinks(new Drinks("Cappuccino", 180, 70, 180))
                .addDrinks(new Drinks("Latte", 250, 65, 200))
                .addDrinks(new Drinks("Butterbeer from Harry Potter", 500, 75, 350))
                .addDrinks(new Tea("Tea", 200, 95, 100, "Black"))
                .addDrinks(new HotChocolate("Hot Chocolate", 120, 95, 150, "Dark"));




        for (int i = 0; i < coffeeVender.getList().size(); i++) {
            System.out.println(coffeeVender.getList().get(i));
        }
        System.out.println("Initialization");
    }
}