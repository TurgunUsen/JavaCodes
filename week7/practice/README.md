# Assignment

## Objective:
Write a Java program to create, save, read, and update a to-do list stored in a text file.

## Instructions

# Part 1:

### Create the ToDo Class
Define a `ToDo` class with the following properties:
- `int id` – a unique identifier for each task.
- `String task` – the description of the task.
- `boolean isComplete` – a flag indicating whether the task is completed.

**Requirements:**
- Implement constructors, getters, and setters for each field.
- Override `toString()` in the `ToDo` class to represent a task as a single line in a format like `id,task,isComplete`.

### Main Program Tasks

#### Task 1: Create and Write to a File
In the main method, write a method called `saveTasksToFile(String filePath, List<ToDo> tasks)`.  
This method should:
- Accept a file path and a list of `ToDo` tasks.
- Write each task’s data to the specified file, with each task on a new line in the format described.

#### Task 2: Read from a File
Implement a method called `loadTasksFromFile(String filePath)` that:
- Reads each line from the specified file.
- Parses each line to create a `ToDo` object.
- Adds each `ToDo` object to a list and returns the list.

#### Task 3: Mark a Task as Complete
Implement a method called `markTaskAsComplete(int id, String filePath)` that:
- Reads tasks from the file.
- Searches for the task by ID.
- Updates the `isComplete` flag to `true`.
- Writes the updated list of tasks back to the file.

#### Task 4: Display Tasks
Write a method called `displayTasks(List<ToDo> tasks)` that:
- Accepts a list of tasks.
- Displays each task's details in a readable format.

### Example Usage

#### Add Sample Data
- Create sample tasks in the main method, add them to a list, and save them to a file named `tasks.txt`.

#### Display Data
- Read tasks from `tasks.txt` and display them on the console.

#### Mark Task as Complete
- Mark a task as complete by providing the task ID and update `tasks.txt`.

### Sample Output

**Example contents of `tasks.txt` after writing:**
```plaintext
1,Buy groceries,false
2,Finish homework,false
3,Call the bank,true

Console output when displaying tasks:

ID: 1, Task: Buy groceries, Complete: false
ID: 2, Task: Finish homework, Complete: false
ID: 3, Task: Call the bank, Complete: true
```
# Part 2: SQL 101

## Scenario: Company Database for Employee and Department Management

In this exercise, you’ll create tables for a company database to store information about employees, departments, and projects. You'll then practice basic SQL operations, including creating tables, inserting data, and writing queries.

---

### Create the Database and Tables

```sql
-- Create the database

-- Create Departments table
CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL,
    location VARCHAR(50)
);

-- Create Employees table
CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

-- Create Projects table
CREATE TABLE Projects (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(50) NOT NULL,
    budget DECIMAL(15, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

-- Create EmployeeProjects (many-to-many relationship)
CREATE TABLE EmployeeProjects (
    employee_id INT,
    project_id INT,
    PRIMARY KEY (employee_id, project_id),
    FOREIGN KEY (employee_id) REFERENCES Employees(employee_id),
    FOREIGN KEY (project_id) REFERENCES Projects(project_id)
);

-- Insert data into Departments
INSERT INTO Departments (department_id, department_name, location)
VALUES (1, 'Engineering', 'Building A'),
(2, 'Human Resources', 'Building B'),
(3, 'Marketing', 'Building C');

-- Insert data into Employees
INSERT INTO Employees (employee_id, first_name, last_name, email, salary,
department_id)
VALUES (101, 'Alice', 'Smith', 'alice@company.com', 80000, 1),
(102, 'Bob', 'Brown', 'bob@company.com', 55000, 2),
(103, 'Carol', 'Johnson', 'carol@company.com', 70000, 3),
(104, 'David', 'Lee', 'david@company.com', 75000, 1);

-- Insert data into Projects
INSERT INTO Projects (project_id, project_name, budget, department_id)
VALUES (201, 'Project Alpha', 1000000, 1),
(202, 'Project Beta', 500000, 2),
(203, 'Project Gamma', 300000, 3);

-- Insert data into EmployeeProjects (assigning employees to projects)
INSERT INTO EmployeeProjects (employee_id, project_id)
VALUES (101, 201),
(104, 201),
(102, 202),
(103, 203);

```
# Part 3: Sample Queries for Practice

These queries cover basic SQL operations, joins, filtering, and aggregations.

1. **Retrieve All Employees**
    ```sql
    SELECT * FROM Employees;
    ```

2. **Find Employees in the Engineering Department**
    ```sql
    SELECT first_name, last_name
    FROM Employees
    WHERE department_id = 1;
    ```

3. **List Employees and Their Departments (Using INNER JOIN)**
    ```sql
    SELECT e.first_name, e.last_name, d.department_name
    FROM Employees e
    INNER JOIN Departments d ON e.department_id = d.department_id;
    ```

4. **Find Projects with Budgets Over $500,000**
    ```sql
    SELECT project_name, budget
    FROM Projects
    WHERE budget > 500000;
    ```

5. **Count the Number of Employees in Each Department**
    ```sql
    SELECT d.department_name, COUNT(e.employee_id) AS employee_count
    FROM Departments d
    LEFT JOIN Employees e ON d.department_id = e.department_id
    GROUP BY d.department_name;
    ```

6. **List All Employees and the Projects They’re Assigned To**
    ```sql
    SELECT e.first_name, e.last_name, p.project_name
    FROM Employees e
    JOIN EmployeeProjects ep ON e.employee_id = ep.employee_id
    JOIN Projects p ON ep.project_id = p.project_id;
    ```

7. **Calculate Total Budget per Department (Using Aggregation)**
    ```sql
    SELECT d.department_name, SUM(p.budget) AS total_budget
    FROM Departments d
    JOIN Projects p ON d.department_id = p.department_id
    GROUP BY d.department_name;
    ```

8. **Retrieve Employees with No Project Assigned**
    ```sql
    SELECT first_name, last_name
    FROM Employees e
    LEFT JOIN EmployeeProjects ep ON e.employee_id = ep.employee_id
    WHERE ep.project_id IS NULL;
    ```
