package Test1;

public class Dog extends Animal{
    public static int counter;
    public static int count;

    public static int getCounter() {
        return counter;
    }

    private String color;
    private double age;

    public Dog(String name, String voice, double weight) {
        super(name, voice, weight);
    }

    public Dog(String name, double weight) {
        super(name, weight);
    }

    public Dog(String name, String voice, double weight, String color, double age) {
        super(name, voice, weight);
        this.color = color;
        this.age = age;
        counter++;
    }

    public Dog(String name, double weight, String color, double age) {
        super(name, weight);
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public double getAge() {
        return age;
    }

    @Override
    public void initDisplay() {
        System.out.printf("%s бежит %s и у него вес составляет %.1f, цвет шерсти %s и ему %.1f лет", name, voice, weight, color, age);
    }

    @Override
    public String toString() {
        count++;
        return String.format("%d. Кличка: %s -  Цвет: %s - Возраст: %s - Голос: %s - Вес: %.1f" + "\n", count, name, color, age, voice, weight).replace('-', ' ');
    }
}
