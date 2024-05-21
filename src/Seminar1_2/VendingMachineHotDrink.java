package Seminar1_2;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Product getProduct(String name) {
        return null;
    }
    public HotDrink getHotDrink(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((HotDrink)product).getVolume() == volume && ((HotDrink)product).getTemperature() == temperature) {
                return (HotDrink) product;
            }
        }
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
