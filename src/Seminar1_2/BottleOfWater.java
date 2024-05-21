package Seminar1_2;

public class BottleOfWater extends Product {
    public double volume;
    public BottleOfWater(int cost, String name, double volume) {
        super(cost, name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
