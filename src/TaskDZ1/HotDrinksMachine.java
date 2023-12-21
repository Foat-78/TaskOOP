package TaskDZ1;


import java.util.List;

public interface HotDrinksMachine {
    public void initHotDrink(List<ProductHotDrinks> productHotDrinks);

    public ProductHotDrinks getHotDrink(String name);
}
