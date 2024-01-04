package SeminarD1;

public class Product {

    protected String brand;
    protected String name;
    protected double price;

    public Product() {
        this("<brend>", "HRV", 100_000);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public Product(String inputName, double inputPrice) {
        checkName(inputName);
        checkPrice(inputPrice);
    }

    public Product(String inputBrand, String inputName, double inputPrice) {
        // Защита стоимости то дурака
        checkBrand(inputBrand);
        checkPrice(inputPrice);
        checkName(inputName);
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }

    private void checkPrice(double price) {
        if (price < 100000) {
            this.price = 180000;
        } else {
            this.price = price;
        }
    }

    private void checkName(String name) {
        if (name.length() < 3 || name == null) {
            this.name = "машина";
        } else {
            this.name = name;
        }
    }

    private void checkBrand(String brand) {
        if (brand.length() < 3 || brand == null) {
            this.brand = "производитель";
        } else {
            this.brand = brand;
        }
    }
}
