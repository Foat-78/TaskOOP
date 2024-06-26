package SeminarD3.Task2;

import java.util.Comparator;

/**
 * Класс для сравнения заработной платы
 */
public class SalaryComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
//       return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        return Double.compare(o2.calculateSalary(), o1.calculateSalary()); // Перевёрнутый список
        // Первый вариант
//        if (o1.calculateSalary() > o2.calculateSalary())
//            return 1;
//        else if (o1.calculateSalary() == o2.calculateSalary())
//            return 0;
//        else return -1;
    }
}
