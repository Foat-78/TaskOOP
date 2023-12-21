package TaskDZ1;

public class HotCoffee extends ProductHotDrinks {
    private int temperature;
    private double volume;

    public HotCoffee(String name, int cost, int temperature, double volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {

        return "HotCoffee {" +
                "name = '" + getName() + '\'' +
                ", cost = " + getCost() +
                ", temperature = " + temperature +
                ", volume = " + volume +
                '}';
    }
}
