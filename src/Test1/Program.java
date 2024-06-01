package Test1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        Animal animal = new Animal(null, "мяукает", 13.5);
//        animal.initDisplay();
        List<Animal> animalList1 = new ArrayList<>();
        Animal dog = new Dog("Шарик", "гавкает", 2, "чёрный", 9);
        Animal cat = new Cat("Белка", "мяукает", 2);
        Animal dog1 = new Dog("Тузик", "какает", 3, "белый", 10);
        Animal cat1 = new Cat("Чернявка", "гавкает", 2);
        Animal dog2 = new Dog("Музик", "топает", 4, "коричневый", 11);
        Animal cat2 = new Cat("Мурка", "гавкает", 2);
        Animal dog3 = new Dog("Карлик", "мяукает", 5, "серый", 12);
        Animal dog4 = new Dog("Кролик", "шмыгает", 6, "красный", 13);
        Animal dog5 = new Dog("Марик", "сопит", 1.2, "рыжий", 20);
        Animal dog6 = new Dog("Нарик", "мопит", 6.3, "бурый", 21);

        animalList1.add(cat);
        animalList1.add(cat1);
        animalList1.add(cat2);
        animalList1.add(dog);
        animalList1.add(dog1);
        animalList1.add(dog2);
        animalList1.add(dog3);
        animalList1.add(dog4);
        animalList1.add(dog5);
        animalList1.add(dog6);

        Zoo zoo = new Zoo(animalList1);
        System.out.println(animalList1);

        System.out.println(zoo.getDog("Тузик", 10));
//        System.out.println(dog6);
        System.out.printf("Количество собак = %d\n", Dog.counter);
        System.out.printf("Количество кошечек = %d", Cat.counter);


    }
}
