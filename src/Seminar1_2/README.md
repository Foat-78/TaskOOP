### Задача 1. - Абстракция 
Реализуйте класс Товар, содержащий данные о товаре, и Торговый автомат, содержащий в себе методы initProducts (List<Product>) 
сохраняющий в себе список исходных продуктов и getProduct(String name).

### Задача 2. - Инкапсуляция
Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на 
основе кода сделанного в предыдущем задании.
# Примечание:
* get - получить значение переменной
* set - поменять значение переменной
### 3 Вида модификаторы доступа:
* public - когда мы можем (т.е. разрешает) обращаться к переменной из вне класса!!!
* private - когда мы имеем доступ только внутри нашего класса т.е. запрещает обращение к переменной вне класса!!!
* protected - когда делает приватные наши переменные вне класса и публичными для нашего класса наследника!!!!

### Задача 3ю - Наследование
Сделайте класс. Товар абстрактным, создайте несколько наследников 
(к примеру: БутылкаВоды), сделайте интерфейсов ТорговыйАвтомат и реализуйте класс какого-то одного 
типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
# Примечание:
* если необходимо классу наследоваться от интерфейса то используем ключевое 
слово implemehts
* если необходимо наследоваться интерфейсу от другого интерфейса то применяем
ключевое слово extende
* для работы с переменными базового типа и для исключения конфликта необходимо использовать ключевое слово super
* для работы с переменными в текущем классе необходимо использовать ключевое слово this

### Домашнее задание
~~~
* Создать наследника БутылкаВоды - ГорячийНапиток с дополнительным полем int температура
* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
перегруженный метод getProduct (int name, int volume, int temperature) выдающий продукт 
соответствующей имени, объёму и температуре.
* В main проинициализировать несколько ГорящихНапитков и ГорящихНапитковАвтомат и 
воспроизвести логику заложенную в программе.
* Всё вышеуказанное создать согласно принципам ООП пройденным на семинаре.
~~~


