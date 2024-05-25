package SeminarD2_1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Персик");

        Dog dog = new Dog();
        dog.setName("Шарик");

        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(cat);
        runnableList.add(dog);
        processRun(runnableList);
    }

    static void processRun(List<Runnable> runnableList){
        for (Runnable runnable: runnableList){
            runnable.run();
        }
    }

}
