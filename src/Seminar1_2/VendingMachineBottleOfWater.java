package Seminar1_2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine{
    private List<Product> productList;

    public VendingMachineBottleOfWater() {
        productList = new ArrayList<>();
    }
    @Override
    public void initProducts(List<Product>productList){
        this.productList = productList;
    }
    @Override
    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == volume) {
                return product;
            }
        }
        return null;
    }
}
