package SeminarD2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Белый");
        cat.setName("Персик");
        Dog dog = new Dog(12);
        dog.setName("Шарик");
//        Animal animal = new Animal();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);

        
        processVoice(animalList);
    }

    static void processVoice(List<Animal> animalList){
        for (Animal animal:animalList){
            if (animal instanceof Cat) {
                Cat cat = (Cat)animal;
                Animal a1 = (Animal)cat;
                a1.voice();
                a1.jump();
                System.out.println("Цвет котика: " + cat.getColor());
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog)animal;
                System.out.println("Вес собаки: " + dog.getWeight());
            }
            animal.voice();
        }
    }
}
