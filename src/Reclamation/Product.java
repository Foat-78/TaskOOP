package Reclamation;

import java.time.LocalDate;
import java.time.Period;


public abstract class Product {
    protected String name;
    protected int numbers;
    protected int year;
    protected int month;
    protected int dayOfMonth;

    public Product() {

    }
    public Product(String name, int numbers, int year, int month, int dayOfMonth) {
        this.name = name;
        this.numbers = numbers;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    //отказ изделия

    public String productFailure(String name, int numbers) {
        return String.format("Отказ изделия %s № %s", name, numbers);
    }

// проверяет, что изделие на гарантии или нет
    public String checkingTheDateOfManufacture(int year, int month, int dayOfMonth, String name, int numbers) {
        System.out.println(productFailure(name, numbers));
        LocalDate dateProduct = LocalDate.of(year, month, dayOfMonth);
        LocalDate date = LocalDate.now();
        Period period = Period.between(dateProduct, date);
        if (period.getYears() < 3) {
            return String.format("Изделие %s № %s подлежит оформлению рекламационного акта", name, numbers);
        } else {
            return String.format("Изделие %s № %s не подлежит оформлению рекламационного акта", name, numbers);
        }
    }

//        System.out.println(period.getYears()+ period.getMonths() + period.getDays());

}
