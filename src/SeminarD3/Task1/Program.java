package SeminarD3.Task1;

/*
Задача 1.
Создать классы Собака и Кот с наследованием от класса Животное
Все животные могут бежать и плыть.
Результатом выполнения действия будет печать в консоль.
У каждого животного есть ограничения на действия.
Добавить подсчет созданных котов, собак и животных.
 */

public class Program {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик", 1000, 0),
                new Dog("Шарик", 200, 300),
                new Cat("Персик", 3000, 0),
                new Dog("Тузик", 200, 4300),
                new Dog("Бима", 400, 40)
        };


        for (Animal a : animals) {
            a.run(200);
            a.swim(10);
            a.run(300);
            a.swim(20);
            a.run(400);
            a.swim(50);
            a.run(6000);
            a.swim(400);
        }
        System.out.printf("Было создано %d животных\n", Animal.getCounter());
        System.out.printf("Было создано %d котов\n", Cat.getCounter());
        System.out.printf("Было создано %d собак\n", Dog.getCounter());

    }
}
