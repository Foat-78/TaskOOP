package TaskDZ1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements HotDrinksMachine {
    private List<ProductHotDrinks> productHotDrinksList = new ArrayList<>();

    @Override
    public void initHotDrink(List<ProductHotDrinks> productHotDrinksList) {
        this.productHotDrinksList = productHotDrinksList;
    }

    @Override
    public ProductHotDrinks getHotDrink(String name) {
        for (ProductHotDrinks product : productHotDrinksList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }
    public ProductHotDrinks getHotDrink(String name, double volume){
        for (ProductHotDrinks product : productHotDrinksList) {
            if (product.getName().equals(name) && ((HotCoffee) product).getVolume() == volume)
                return product;
        }
        return null;
    }

    public ProductHotDrinks getHotDrink(String name, double volume, int temperature){
        for (ProductHotDrinks product : productHotDrinksList) {
            if (product.getName().equals(name) && ((HotCoffee) product).getVolume() == volume && ((HotCoffee) product).getTemperature() == temperature)
                return product;
        }
        return null;
    }
}
