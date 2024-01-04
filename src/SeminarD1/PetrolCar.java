package SeminarD1;

public class PetrolCar extends Product {
    double engineCapacity;

    public PetrolCar(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public PetrolCar(String inputName, double inputPrice, double engineCapacity) {
        super(inputName, inputPrice);
        this.engineCapacity = engineCapacity;
    }

    public PetrolCar(String inputBrand, String inputName, double inputPrice, double engineCapacity) {
        super(inputBrand, inputName, inputPrice);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String displayInfo() {
        return String.format("[Производитель] -> %s;\n[Название] -> %s;\n[Объём двигателя] -> %.1f;\n[Цена] -> %.2f;", brand, name, engineCapacity, price);
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}
