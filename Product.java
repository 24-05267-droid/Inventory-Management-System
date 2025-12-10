package org.yourcompany.yourproject;

public class Product {
    private final String name;
    private final double price;
    private final int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
