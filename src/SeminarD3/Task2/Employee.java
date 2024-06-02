package SeminarD3.Task2;
/**
 * Рабочий (базовый тип)
 */
public abstract class Employee implements Comparable<Employee>{
//    @Override
//    public int compareTo(Employee o) {
//        int surNameRes = surName.compareTo(o.surName);
//        if (surNameRes == 0){
//            return name.compareTo(o.name);
//        }
//        return surNameRes;
//    }
    @Override
    public int compareTo(Employee o) {
        return surName.compareTo(o.surName);

    }

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчёт среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f рублей; заработная плата: %.2f рублей",
                surName, name, salary, calculateSalary());
    }
}
