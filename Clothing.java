package org.yourcompany.yourproject;

public class Clothing {
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Clothing(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public void displayDetails() {
        System.out.println("[Food] Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + stockQuantity);
    }

}