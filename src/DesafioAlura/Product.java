package DesafioAlura;

public class Product {
    private double price;
    private String description;

    public Product(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
