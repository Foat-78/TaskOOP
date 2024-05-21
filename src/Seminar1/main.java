package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        BotterOfWater botterOfWater = new BotterOfWater("test", 150, 1.5);
        BotterOfWater botterOfWater1 = new BotterOfWater("test1", 160, 1.6);
        BotterOfWater botterOfWater2 = new BotterOfWater("test2", 170, 1.7);
        BotterOfWater botterOfWater3 = new BotterOfWater("test3", 180, 1.8);
        BotterOfWater botterOfWater4 = new BotterOfWater("test4", 200, 2.0);
//        System.out.println(botterOfWater.getName() + " " + botterOfWater.getCost() + " " + botterOfWater.getVolume());
        List<Product> productList = new ArrayList<>();
        productList.add(botterOfWater);
        productList.add(botterOfWater1);
        productList.add(botterOfWater2);
        productList.add(botterOfWater3);
        productList.add(botterOfWater4);
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("test1",1.6));
    }
}
