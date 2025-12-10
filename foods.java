package org.yourcompany.yourproject;

public abstract class foods {
    protected String name;
    protected double price;
    protected int stockQuantity;

    public foods(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract void displayDetails();

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public void setStockQuantity(int quantity) {
        this.stockQuantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}
