# Geometric Shapes Hierarchy Program in Java

## Goal
Create a program that models a hierarchy of geometric shapes (e.g., Circle, Rectangle, Square). Each shape should have common behaviors, like calculating area and perimeter, but their implementation will vary depending on the shape. The program will use **abstract classes** for shared behavior and **interfaces** to define behaviors that all shapes must implement.

## Instructions

### 1. Create an Abstract Class `Shape`:
- Declare **abstract methods** `calculateArea()` and `calculatePerimeter()`.
- Include a **non-abstract method** `getShapeType()` to return the type of shape.

### 2. Create Concrete Subclasses:
- **Circle**: Implement the `calculateArea()` and `calculatePerimeter()` methods.
- **Rectangle**: Implement the `calculateArea()` and `calculatePerimeter()` methods.
- **Square**: Extend `Rectangle` (since a square is a special type of rectangle).

### 3. Create an Interface `Drawable`:
- Define a method `draw()` that will display a simple representation of each shape (e.g., print the shape's name or dimensions).

### 4. Implement Polymorphism:
- Create a list of `Shape` objects (using an **ArrayList**), populate it with different shapes, and demonstrate **polymorphism** by calling `calculateArea()` and `calculatePerimeter()` on each shape.

## Bonus:
- Add a **Colorable** interface with a method `getColor()` and implement it in your shapes.
