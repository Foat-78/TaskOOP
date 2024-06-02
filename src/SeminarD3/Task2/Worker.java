package SeminarD3.Task2;

/**
 * Рабочий (работает с 9 до 18
 * получает фиксированную ЗП
 */
public class Worker extends Employee{


    public Worker(String surName, String name, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f рублей",
                surName, name, calculateSalary());
    }
}
