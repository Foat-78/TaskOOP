package SeminarD3.Task2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        Worker worker = new Worker("Фамилия", "Имя", 300);
//
//        Worker worker1 = EmployeeFabric.generateWorker();
//        System.out.println(worker1);
        Worker[]workers = EmployeeFabric.generateEmployees(15);
        for (Worker worker: workers) {
            System.out.println(worker);
        }
        System.out.println("\n***************ОТСОРТИРОВАННЫЙ СПИСОК*******************\n");

        Arrays.sort(workers, new SalaryComparator()); // Сортировка по заработной плате



//        Arrays.sort(workers/*, new SalaryComparator()*/); // Сортировка по имени фамилии

        for (Worker worker: workers) {
            System.out.println(worker);
        }

    }
}
