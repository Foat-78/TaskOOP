package TaskDZ1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        HotCoffee hotCoffee = new HotCoffee("Cappuccino", 150, 95, 0.3);
        HotCoffee hotCoffee1 = new HotCoffee("Black coffee", 100, 90, 0.5);
        HotCoffee hotCoffee2 = new HotCoffee("Americano", 95, 80, 0.3);
        HotCoffee hotCoffee3 = new HotCoffee("Latte coffee", 130, 95, 0.5);
        List<ProductHotDrinks> productHotDrinks = new ArrayList<>();
        productHotDrinks.add(hotCoffee);
        productHotDrinks.add(hotCoffee1);
        productHotDrinks.add(hotCoffee2);
        productHotDrinks.add(hotCoffee3);
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        hotDrinksVendingMachine.initHotDrink(productHotDrinks);
        System.out.println(hotDrinksVendingMachine.getHotDrink("Cappuccino", 0.3, 95));
    }
}
