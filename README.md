# Inventory-Management-System
README – Inventory Management System (Java)
Project Overview
This project is a console-based Inventory Management System written in Java. It demonstrates key
OOP concepts such as encapsulation, inheritance, polymorphism, and abstraction. The system allows
users to add, view, update, and remove products.
Features
• Add a Product (Electronics, Clothing, Food)
• View Inventory
• Update Stock
• Remove a Product
• Input validation using try-catch
Program Structure
Main Class:
InventoryManagementSystem
Classes:
• Product – Base class (name, price, stock)
• Electronics – Extends Product with brand
• Clothing – Extends Product with size
• Food – Extends Product with expiration date
How the System Works
The program displays a menu:
1. Add a Product
2. View Inventory
3. Update Stock
4. Remove a Product
5. Exit
Products are stored in a fixed-size array of 10 elements.
How to Run
1. Compile:
javac InventoryManagementSystem.java
2. Run:
java InventoryManagementSystem
Limitations
• Limited to 10 products
• No database
• No file storage
• No search or sorting
Possible Improvements
• Use ArrayList
• Add search function
• Add sorting
• File saving/loading
• GUI using Swing/JavaFX
