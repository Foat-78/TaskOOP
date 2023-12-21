package Seminar1;

import java.util.List;

// Интерфейс, который в себе хранит набор методов, которое класс наследник должен реализовать
public interface VendingMachine {
    public void initProduct(List<Product> productList);

    public Product getProduct(String name);
}
