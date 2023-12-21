package Seminar1;

public class BotterOfWater extends Product{
    private double volume;

    public BotterOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BotterOfWater {" +
                "name ='" + super.getName() + '\'' +
                ", cost = " + super.getCost() +
                ", volume = " + volume +
                '}';
    }
}
