## Objective:
This assignment will help you practice core Object-Oriented Programming (OOP) concepts in Java. You will create classes, use constructors, demonstrate method overloading, organize your code into packages, and explore the use of access modifiers.

---

## Create Packages:
- **Create a package called `school`.**
- Inside the `school` package, create another package named `management`.

---

## Create the `Person` Class in the `school` Package:
- Inside the `school` package, create a class named `Person`.

### Fields:
- `String name` (public)
- `int age` (protected)

### Constructor:
- Create a constructor that accepts `name` and `age` as parameters and initializes the fields.

### Method:
- Create a method `public void displayDetails()` to print the name and age.

---

## Create the `Student` Class in the `school.management` Package:
- In the `management` package, create a class named `Student` that extends `Person`.

### Fields:
- `int studentID` (private)
- `String[] enrolledCourses` (private)
- `double tuition` (private)

### Constructor:
- Create a constructor that takes `name`, `age`, and `studentID` as parameters and uses the parent class constructor to initialize the name and age.

### Method Overloading:
Implement two overloaded methods `enrollCourses()`:
1. The first method accepts a `String` array of courses as parameters and stores them in `enrolledCourses`.
2. The second method accepts a single `String` representing a course and adds it to the `enrolledCourses` array.

### Encapsulation with Getter/Setter Methods:
- Create getter and setter methods for `tuition`.
- Ensure the `tuition` can only be updated via a public method that calculates it based on the number of enrolled courses (e.g., $500 per course).

---

## Create the `CourseManager` Class in the `school.management` Package:
### Fields:
- `Student[] students` (private)

### Constructor:
- Create a constructor that initializes an empty list of students.

### Methods:
- `public void addStudent(Student student)`: Adds a student to the array.
- `public void displayAllStudents()`: Loops through the list and displays the details of all students.

---

## Create the `Main` Class to Test Your Program:
- In the `school.management` package, create a `Main` class that contains the `main` method.

### Tasks in `Main` Method:
- Create several `Student` objects using the constructor and initialize them with different names, ages, and IDs.
- Enroll them in courses using both overloaded `enrollCourses()` methods.
- Update and display their tuition fees using the setter/getter methods.
- Use the `CourseManager` to add students and display details of all enrolled students.

---

## Bonus Task (Optional):
- Allow the `CourseManager` to remove a student or modify the courses they are enrolled in.
- Implement a feature where a `Student` can drop a course, adjusting the tuition accordingly.

---

## Directory Structure:

```plaintext
school/
  Person.java
school/management/
  Student.java
  CourseManager.java
  Main.java
