package org.yourcompany.yourproject;

public abstract class Electronics {
    private final String name;
    private final double price;
    private final int stockQuantity;

    public Electronics(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stockQuantity;
    }
}
