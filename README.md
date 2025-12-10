# Inventory-Management-System

Project Overview

This project is a simple console-based Inventory Management System written in Java.
It demonstrates key Object-Oriented Programming (OOP) concepts such as:

Encapsulation – using classes and private fields

Inheritance – multiple product types extend the base Product class

Polymorphism – overridden displayDetails() for each product type

Abstraction – the base Product class defines common structure

The system allows users to add, view, update, and remove products in an inventory.

📂 Features
✔️ Add a Product

Users can add 3 product types:

Electronics (with brand)

Clothing (with size)

Food (with expiration date)

✔️ View Inventory

Displays all stored products with full details, including stock status.

✔️ Update Stock

Allows changing the stock quantity of a selected product.

✔️ Remove a Product

Deletes a product using its index.

✔️ Input Validation

All numerical inputs are validated using try-catch for safe console interaction.

🧱 Program Structure
Main Class:

InventoryManagementSystem
Contains the menu, input handling, and product management logic.

Classes:
Class	Purpose
Product	Base class for all product types (name, price, stock).
Electronics	Extends Product with brand.
Clothing	Extends Product with size.
Food	Extends Product with expiration date.
📌 How the System Works
1. The program displays a menu:
1. Add a Product
2. View Inventory
3. Update Stock
4. Remove a Product
5. Exit

2. Users choose an option

The system performs the requested action, handling errors like invalid inputs or empty inventory.

3. Products are stored in:
private static final Product[] products = new Product[10];


Maximum capacity: 10 products.

🚀 How to Run

Copy all .java files into a single project folder

Compile and run:

javac InventoryManagementSystem.java
java InventoryManagementSystem

📌 Example Output
--- Inventory Management Menu ---
1. Add a Product
2. View Inventory
3. Update Stock
4. Remove a Product
5. Exit
Enter your choice: 1
Select product type:
1. Electronics
2. Clothing
3. Food
Enter type (1-3): 1
Enter name: Laptop
Enter price: 35000
Enter stock quantity: 25
Enter brand: Asus
Product added successfully!

🧠 Concepts Demonstrated

OOP Principles

Method Overriding

Array storage and manual shifting

Scanner input management

Basic CRUD operations

User-friendly console interface

📌 Limitations

Maximum of 10 products only

No database (in-memory storage only)

No file saving/loading

No advanced search or sorting

(These can be added if you want!)
