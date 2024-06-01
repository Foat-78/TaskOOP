package Test1;

public class Cat extends Animal{
    public static int counter;
    public static int count;

    public static int getCounter() {
        return counter;
    }

    public Cat(String name, String voice, double weight) {
        super(name, voice, weight);
        counter++;
    }

    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void initDisplay() {
        System.out.printf("%s бежит %s и у него вес составляет %.1f", name, voice, weight);
    }

    @Override
    public String toString() {
        count++;
        return String.format("%d. Кличка: %s -  Цвет: %s - Возраст: %s" + "\n", count, name, voice, weight).replace('-', ' ');
    }
}
