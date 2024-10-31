# Student Course Registration System

## Problem Description

You are required to write a program that manages the process of registering students for a course. The system should:

- Register students, ensuring valid inputs such as non-null names and a valid age range (18-60).
- Enforce a maximum limit of 5 students for a particular course.
- Create and handle custom exceptions for invalid input scenarios.

The program will take user input for each student and handle different error cases using exceptions.

## Requirements

### 1. Create a `Student` Class

#### Fields:
- **String name**: Cannot be null or empty.
- **int age**: Must be between 18 and 60.

#### Constructor
- Initializes the fields and throws exceptions if the input is invalid.

### 2. Create Custom Exceptions

#### InvalidAgeException
- Thrown if the age is not within the valid range (18-60).

#### InvalidNameException
- Thrown if the name is null or empty.

### 3. Course Registration System

#### Class: `CourseRegistration`
- A class to register students.
- Stores registered students in an **ArrayList**.

#### Method: `registerStudent(Student student)`
- Registers students to a course.
- If the course already has 5 students, throws a **CourseFullException**.
- Catches and handles custom exceptions properly.

### 4. Main Class

- Simulates the registration process by reading input from the user.
- Handles possible exceptions during registration using **try-catch**.
- Ensures that after each student registration, the program continues to operate.

## Bonus Task

- Extend the program to allow students to unregister from the course.
- Handle exceptions for invalid unregistration (e.g., trying to remove a student who is not registered).

---

This program demonstrates object-oriented programming concepts, exception handling, and validation in Java. It ensures robust handling of errors during the student registration process and enforces course limitations effectively.

