package SeminarD1;


import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Product product = new Product();
//        product.brand = "Toyota";
//        product.name = "Prius @";
//        product.price = 100_000;
        System.out.println(product.displayInfo());

        Product product1 = new Product("Honda", "CRV", 10000);
        System.out.println(product1.displayInfo());

        // Вариант работы защиты от дурака
        Product product2 = new Product("Ho", "CR", 10000);
        System.out.println(product2.displayInfo());

        System.out.println();
        PetrolCar petrolCar = new PetrolCar("Suzuki","PV", 10000000, 3.5);
        System.out.println(petrolCar.displayInfo());

        System.out.println();
        ElectricCar electricCar = new ElectricCar("Toyota","HRV", 10, 3.5, 1.5);
        System.out.println(electricCar.displayInfo());

        PetrolCar petrolCar1 = new PetrolCar("Suzuki","PV", 100340000, 6.5);
        System.out.println(petrolCar1.displayInfo());

        ElectricCar electricCar1 = new ElectricCar("Honda","MPV", 10333333, 3.5, 1.5);
        System.out.println(electricCar1.displayInfo());

        ArrayList<Product> products = new ArrayList<>();
        products.add(petrolCar);
        products.add(petrolCar1);
        products.add(electricCar1);
        products.add(electricCar);

        VendingMachine vendingMachine = new VendingMachine(products);
        ElectricCar electricCar2 = vendingMachine.getElectricCar("MPV",3.1);
        if (electricCar2 == null){
            System.out.println("\nМы не нашли такую машину!!!");
        }else {
            System.out.println("\nВы купили машину!!\n");
            System.out.println(electricCar2.displayInfo());
        }


    }
}