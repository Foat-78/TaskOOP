package SeminarD2;

public class Dog extends Animal{

    private double weight;

    public double getWeight() {
        return weight;
    }

    public Dog(double weight) {
        this.weight = weight;
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }
}
