package SeminarD3.Task1;

public abstract class Animal {

    private static int counter;
    public static int getCounter(){
        return counter;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counter++;

    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не удалось пробежать %d метров\n", name, distance);
        }
    }

    public void swim(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не удалось проплыть %d метров\n", name, distance);
        }
    }

    String name;
    int maxRun;
    int maxSwim;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
