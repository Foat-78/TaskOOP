package Seminar1_2;

public class HotDrink extends Product{

    public int temperature;
    public double volume;
    public HotDrink(int cost, String name, double volume, int temperature) {
        super(cost, name);
        this.temperature = temperature;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
