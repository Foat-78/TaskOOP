package SeminarD3.Task2;

import java.util.Random;

public class EmployeeFabric {
    private static Random random = new Random();
    public static Worker generateWorker(){

        String[] names = new String[]{"Анатолий", "Петр", "Сергей", "Василий", "Михаил", "Дмитрий"};
        String[] surNames = new String[]{"Анатольев", "Петрович", "Сергеев", "Васильев", "Соловьёв", "Бабич"};
        int salary = random.nextInt(6000, 12000);
        return new Worker(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                salary);
    }
    public static Worker[] generateEmployees(int count){
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }
}
