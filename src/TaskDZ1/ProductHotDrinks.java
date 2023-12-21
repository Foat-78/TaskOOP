package TaskDZ1;

public abstract class ProductHotDrinks {
    private String name;
    private int cost;


    public ProductHotDrinks(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ProductHotDrinks {" +
                "name = '" + name + '\'' +
                ", cost = " + cost +
                '}';
    }
}
