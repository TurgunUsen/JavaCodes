# University System Simulation in Java

## Goal
This exercise is designed to practice advanced OOP concepts such as:
- Inheritance
- Method overriding
- Polymorphism
- Interfaces
- Collections

Additionally, it introduces encapsulation and aggregation/composition by simulating a university system with students, courses, and departments.

## Problem Statement
You are tasked with designing a university system that models **Departments**, **Courses**, **Professors**, and **Students**. The system should allow for:
- Assigning professors to departments.
- Registering students for courses.
- Calculating and displaying each student's grades for their registered courses.
- Demonstrating polymorphism through different types of professors (e.g., AdjunctProfessor, FullTimeProfessor).

## Requirements

### 1. Create Classes:
- **Department**: Holds information about the department name and professors.
- **Professor (Abstract Class)**: Includes attributes like name, salary, and department. Methods should include `teachCourse()` and `calculateSalary()`.
- **AdjunctProfessor (Subclass)**: Implements a salary based on the number of courses taught.
- **FullTimeProfessor (Subclass)**: Implements a salary based on a fixed monthly amount.
- **Course**: Holds information about course name, credit hours, and students.
- **Student**: Includes details like student name, student ID, and a list of registered courses.
- **Grade**: Represents the grade a student receives in a particular course.

### 2. Encapsulation:
Ensure proper encapsulation by making use of private fields and providing getter and setter methods where necessary.

### 3. Implement Interfaces:
- **Teach**: An interface to be implemented by professors, which contains a method `conductLecture()`.
- **Evaluatable**: An interface for professors and Teaching Assistants (TA) that contains a method `gradeStudents()`.

### 4. Polymorphism:
- Demonstrate polymorphism through professor types. Use a list of **Professor** objects where both **AdjunctProfessor** and **FullTimeProfessor** are stored.
- Each professor should calculate their salary differently based on their type.

### 5. Use Collections:
- Use collections (`ArrayList`, `HashMap`) to store courses, students, and departments.

### 6. Aggregation:
- The **Department** should contain a list of professors and courses.
- The **Course** should aggregate a list of students.

### Example:
- A **Department** object can have multiple professors and courses.
- A **Course** object should have a list of students and assign grades.
- A **Student** object should have a list of courses they are enrolled in and be able to print their grade report.

## Bonus:
- Implement a simple GUI to interact with the system where users can:
  - Register students for courses.
  - Assign professors to courses.
  - View a student’s grade report.

## Expected Output:
```plaintext
Department: Computer Science
Professor: Dr. John Smith (Full-time)
Teaching: Data Structures
Students: Jane Doe, Mark Lee
Grade Report for Jane Doe:
- Data Structures: 85
