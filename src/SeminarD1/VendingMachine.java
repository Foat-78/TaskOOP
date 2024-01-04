package SeminarD1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public ElectricCar getElectricCar(String name, double engineCapacity){
        for (Product product: products) {
            if (product instanceof ElectricCar){
                ElectricCar electricCar = (ElectricCar) product;
                if (electricCar.getName().equals(name) && electricCar.getEngineCapacity() == engineCapacity){
                    return electricCar;
                }
            }
        }
        return null;
    }

}
