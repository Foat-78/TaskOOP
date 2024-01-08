package SeminarD3.Task1;

public class Cat extends Animal{

    private static int counter;
    public static int getCounter(){
        return counter;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        counter++;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать\n", name);
    }

    @Override
    public void run(int distance) {
        super.run(distance);
    }
}
