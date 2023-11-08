package DesafioAlura;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limit;
    private double balance;
    private List<Product> products;

    public CartaoCredito(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.products = new ArrayList<>();
    }

    public boolean buyApproved(Product product){
        if (this.balance >= product.getPrice()){
            balance -= product.getPrice();
            products.add(product);
            return true;
        }
        return false;
    }

    public void showProducts(){
        System.out.println("-------- PRODUTOS ________");
        System.out.println("LIMITE ATUAL: " +  getLimit());
        for (Product product : getProducts()){
            System.out.println( "Descrição: " + product.getDescription() +
                                " - Preço: " + product.getPrice());
        }
        System.out.println("Saldo: " + getBalance());
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Product> getProducts() {
        return products;
    }
}
