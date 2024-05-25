package SeminarD2_1;

public class Dog extends BaseDog implements Runnable{
    @Override
    public void run() {
        System.out.println("Собака бежит");
    }
}
