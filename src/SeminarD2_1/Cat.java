package SeminarD2_1;

public class Cat extends BaseCat implements Runnable{
    @Override
    public void run() {
        System.out.println("Кошка бежит");
    }
}
