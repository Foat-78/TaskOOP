package Seminar1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VendingMachineHotDrink implements VendingMachine{
    public List<Product> productList;


    public VendingMachineHotDrink(ArrayList<Product> products) {
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((HotDrink)product).getVolume() == volume && ((HotDrink)product).getTemperature() == temperature) {
                System.out.println(product);
            }
        }
           return null;
    }
    @Override
    public Product getProduct(String name) {
        return null;
    }


//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }


}
