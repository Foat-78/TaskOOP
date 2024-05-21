package Reclamation;

import java.time.LocalDate;
import java.time.Period;

// Рекламационный акт
public class TheActOfReclamation extends Product {

    int numbersReclam;
    int dataReclam;

    public TheActOfReclamation() {

    }

    public TheActOfReclamation(int numbersReclam, int dataReclam) {
        this.numbersReclam = numbersReclam;
        this.dataReclam = dataReclam;
    }

    public TheActOfReclamation(String name, int numbers, int year, int month, int dayOfMonth, int numbersReclam, int dataReclam) {
        super(name, numbers, year, month, dayOfMonth);
        this.numbersReclam = numbersReclam;
        this.dataReclam = dataReclam;
    }

    public String registrationReclamation(String name, int numbers){
        LocalDate dataReclam = LocalDate.now();
        numbersReclam = 1;
        return String.format("Рекламационный акт %sA от %s на изделие %s № %s оформлен", numbersReclam++, dataReclam, name, numbers);

    }

    @Override
    public String checkingTheDateOfManufacture(int year, int month, int dayOfMonth, String name, int numbers) {
        System.out.println(productFailure(name, numbers));
        LocalDate dateProduct = LocalDate.of(year, month, dayOfMonth);
        LocalDate date = LocalDate.now();
        Period period = Period.between(dateProduct, date);
        if (period.getYears() < 3) {
            return registrationReclamation(name, numbers);
        } else {
            return String.format("Изделие %s № %s не подлежит оформлению рекламационного акта", name, numbers);
        }

    }

    public int getNumbersReclam() {
        return numbersReclam;
    }

    public void setNumbersReclam(int numbersReclam) {
        this.numbersReclam = numbersReclam;
    }

    public int getDataReclam() {
        return dataReclam;
    }

    public void setDataReclam(int dataReclam) {
        this.dataReclam = dataReclam;
    }
}
