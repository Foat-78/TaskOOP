* Абстрактный тип не позволяет создавать экземпляр класса, а можно 
создавать типы на базе абстрактного класса!
* В абстрактном классе можно создавать абстрактные методы, но только
без реализации и их необходимо обязательно реализовать в классе наследнике
* Если когда на уровне наследника создано поле "вес" и мы работаем с родительским классом 
и нам необходимо вытащить вес животного то мы преобразуем следующим образом
~~~
Cat cat = (Cat)animal;
~~~
когда в коллекции ```List<Animal>``` находится несколько животный то при компиляции выдаст ошибку, если одно животное 
то ошибок не будет. И ```douncast``` в данном случае не безопасно
~~~
List<Animal> animalList = new ArrayList<>();
        animalList.add(cat); // ошибки не будет 
       // animalList.add(dog); // будет ошибка
        static void processVoice(List<Animal> animalList){
        for (Animal animal:animalList){
            Cat cat = (Cat)animal;
            animal.voice();
            System.out.println("Цвет котика: " + cat.getColor());
        }
    }
~~~
И ```downcast``` в данном случае не безопасно(один ко многим) и поэтому код необходимо реализовать 
по другому c помощью ключевого слова ``` instanceof ```
~~~
static void processVoice(List<Animal> animalList){
        for (Animal animal:animalList){
            animal.voice();
            if (animal instanceof Cat) {
                Cat cat = (Cat)animal;
                System.out.println("Цвет котика: " + cat.getColor());
            }
        }
    }
~~~
* Существует другой тип преобразования ```upcast``` (преобразование вверх - многим к одному)
~~~
Animal a1 = (Animal)cat; - преобразование (Animal a1 = cat; - или можно так)                
~~~