# Java Assignment: Generic Inventory System

## Objective
This assignment aims to practice the use of Java **generics** by creating generic classes, methods, and handling wildcards.

## Task Description
You will create a simple **inventory system** for a store. The store sells different types of products, including Books, Electronics, and Clothes. Each product type has unique characteristics. You’ll use generics to create a system that can handle any type of product without duplicating code.

### Instructions

1. **Create a Generic Class:**
   - Create a generic class `Product<T>`. This class will hold details about a product (like its name, price, and type-specific attributes).
   - `T` will be the type of the product (e.g., Book, Electronic, Clothes).

2. **Create Product Types:**
   - Create a class `Book` with attributes `author` and `pages`.
   - Create a class `Electronics` with attributes `brand` and `warranty`.
   - Create a class `Clothes` with attributes `size` and `material`.

3. **Create a Generic Inventory Class:**
   - Create a class `Inventory<T>`, which will use generics to store a list of products of type `T`.
   - Provide methods to add products, remove products, and display all products in the inventory.

4. **Implement Wildcards:**
   - Add a method `displayInventory` that accepts an `Inventory<? extends Product>` and prints the details of each product.
   - Use bounded wildcards to restrict what types of products can be added or viewed.

5. **Create a Main Method:**
   - In your main method, create instances of `Book`, `Electronics`, and `Clothes`.
   - Create `Inventory<Book>`, `Inventory<Electronics>`, and `Inventory<Clothes>`.
   - Add products to each inventory and display the contents using the generic methods.
