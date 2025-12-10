package org.yourcompany.yourproject;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InventoryManagementSystem {

    private static final Product[] products = new Product[10];
    private static int productCount = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Inventory Management System!");
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewInventory();
                    break;
                case 3:
                    updateStock();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n--- Inventory Management Menu ---");
        System.out.println("1. Add a Product");
        System.out.println("2. View Inventory");
        System.out.println("3. Update Stock");
        System.out.println("4. Remove a Product");
        System.out.println("5. Exit");
    }

    private static void addProduct() {
        if (productCount >= products.length) {
            System.out.println("Inventory is full! Cannot add more products.");
            return;
        }

        System.out.println("Select product type:");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Food");
        int type = getIntInput("Enter type (1-3): ");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        double price = getDoubleInput("Enter price: ");

        int stock = getIntInput("Enter stock quantity: ");

        switch (type) {
            case 1:
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                products[productCount++] = new Electronics(name, price, stock, brand);
                break;
            case 2:
                System.out.print("Enter size: ");
                String size = scanner.nextLine();
                products[productCount++] = new Clothing(name, price, stock, size);
                break;
            case 3:
                System.out.print("Enter expiration date: ");
                String expiration = scanner.nextLine();
                products[productCount++] = new Food(name, price, stock, expiration);
                break;
            default:
                System.out.println("Invalid type.");
                return;
        }
        System.out.println("Product added successfully!");
    }

    private static void viewInventory() {
        if (productCount == 0) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n--- Current Inventory ---");
        for (int i = 0; i < productCount; i++) {
            System.out.print("Index " + i + ": ");
            products[i].displayDetails();
            System.out.println("In Stock: " + products[i].isInStock());
            System.out.println();
        }
    }

    private static void updateStock() {
        if (productCount == 0) {
            System.out.println("No products to update.");
            return;
        }
        int index = getIntInput("Enter product index (0 to " + (productCount - 1) + "): ");
        if (index >= 0 && index < productCount) {
            int newStock = getIntInput("Enter new stock quantity: ");
            products[index].setStockQuantity(newStock);
            System.out.println("Stock updated!");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void removeProduct() {
        if (productCount == 0) {
            System.out.println("No products to remove.");
            return;
        }
        int index = getIntInput("Enter product index to remove (0 to " + (productCount - 1) + "): ");
        if (index >= 0 && index < productCount) {
            for (int i = index; i < productCount - 1; i++) {
                products[i] = products[i + 1];
            }
            products[--productCount] = null;
            System.out.println("Product removed!");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // discard invalid input
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // discard invalid input
            }
        }
    }

    private static class Product {
        protected String name;
        protected double price;
        protected int stockQuantity;

        public Product(String name, double price, int stockQuantity) {
            this.name = name;
            this.price = price;
            this.stockQuantity = stockQuantity;
        }

        public void setStockQuantity(int quantity) {
            this.stockQuantity = quantity;
        }

        public boolean isInStock() {
            return stockQuantity > 15;
        }

        public void displayDetails() {
            System.out.println("Name: " + name + ", Price: $" + price + ", Stock: " + stockQuantity);
        }
    }

    private static class Electronics extends Product {
        private String brand;

        public Electronics(String name, double price, int stockQuantity, String brand) {
            super(name, price, stockQuantity);
            this.brand = brand;
        }

        @Override
        public void displayDetails() {
            System.out.println("Electronics - Name: " + name + ", Price: $" + price + ", Stock: " + stockQuantity + ", Brand: " + brand);
        }
    }

    private static class Clothing extends Product {
        private final String size;

        public Clothing(String name, double price, int stockQuantity, String size) {
            super(name, price, stockQuantity);
            this.size = size;
        }

        @Override
        public void displayDetails() {
            System.out.println("Clothing - Name: " + name + ", Price: $" + price + ", Stock: " + stockQuantity + ", Size: " + size);
        }
    }

    private static class Food extends Product {
        private final String expiration;

        public Food(String name, double price, int stockQuantity, String expiration) {
            super(name, price, stockQuantity);
            this.expiration = expiration;
        }

        @Override
        public void displayDetails() {
            System.out.println("Food - Name: " + name + ", Price: $" + price + ", Stock: " + stockQuantity + ", Expiration: " + expiration);
        }
    }
}
