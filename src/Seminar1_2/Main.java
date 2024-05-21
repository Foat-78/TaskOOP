package Seminar1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product product = new BottleOfWater(123, "Foat", 0.5);

//        Product product1 = new BottleOfWater(45, "hk", 0.2);
//        Product product2 = new BottleOfWater(150, "rty", 0.5);
//        Product product3 = new BottleOfWater(200, "uio", 1.5);
//        Product product4 = new BottleOfWater(250, "asd", 0.9);
//        VendingMachineBottleOfWater vendingMachineBottleOfWater = new VendingMachineBottleOfWater();
////        VendingMachine vendingMachine = new VendingMachineBottleOfWater();
//        vendingMachineBottleOfWater.addProduct(product1);
//        vendingMachineBottleOfWater.addProduct(product2);
//        vendingMachineBottleOfWater.addProduct(product3);
//        vendingMachineBottleOfWater.addProduct(product4);
//        System.out.println(vendingMachineBottleOfWater.getProduct("asd").getName());
        ArrayList<Product> products = new ArrayList<>();
        HotDrink product5 = new HotDrink(123, "toma", 0.5, 45);
        HotDrink product6 = new HotDrink(56, "tima", 1.5, 96);
        HotDrink product7 = new HotDrink(785, "foat", 2.5, 70);
        HotDrink product8 = new HotDrink(15, "tata", 3.0, 50);


        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        VendingMachine vendingMachine1 = new VendingMachineHotDrink(products);

        System.out.println(vendingMachine1.getProduct("foat").getName());
    }
}