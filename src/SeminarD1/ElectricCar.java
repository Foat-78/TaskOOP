package SeminarD1;

public class ElectricCar extends Product{

    double engineCapacity;
    double electricBatteryCharge;

    public ElectricCar(double engineCapacity, double electricBatteryCharge) {
        this.engineCapacity = engineCapacity;
        this.electricBatteryCharge = electricBatteryCharge;
    }

    public ElectricCar(String inputName, double inputPrice, double engineCapacity, double electricBatteryCharge) {
        super(inputName, inputPrice);
        this.engineCapacity = engineCapacity;
        this.electricBatteryCharge = electricBatteryCharge;
    }

    public ElectricCar(String inputBrand, String inputName, double inputPrice, double engineCapacity, double electricBatteryCharge) {
        super(inputBrand, inputName, inputPrice);
        this.engineCapacity = engineCapacity;
        this.electricBatteryCharge = electricBatteryCharge;
    }

    @Override
    public String displayInfo() {
        return String.format("[Производитель] -> %s;\n[Название] -> %s;\n[Объём двигателя] -> %.1f;\n[Объём заряда электродвигателя] -> %.1f;\n[Цена] -> %.2f;",
                brand, name, engineCapacity, electricBatteryCharge, price);
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public double getElectricBatteryCharge() {
        return electricBatteryCharge;
    }
}
