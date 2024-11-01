# Assignment

## Part 1: File Operations

### Homework Assignment: Student Management System Using Files

**Objective**: Write a Java program that uses files to manage a list of students, including their names, IDs, and grades. Practice creating, reading, and writing data to files.

### Instructions

#### 1. Create a Class for Student Records
- Define a `Student` class with the following properties:
  - `int id` – a unique identifier for each student.
  - `String name` – the student's name.
  - `double grade` – the student’s grade.
- Add appropriate constructors, getters, and setters for each property.
- Override `toString()` in the `Student` class to format student data for easy storage and retrieval.

#### 2. Main Program Tasks

##### Task 1: Create and Write to File
- In the main method, create a method called `saveStudentsToFile(String filePath, List<Student> students)`.
- This method should:
  - Accept a file path and a list of students.
  - Write each student's data to the specified file, with each student on a new line, separated by commas (e.g., `id,name,grade`).

##### Task 2: Read from File
- Create a method called `loadStudentsFromFile(String filePath)` that:
  - Reads data from the specified file line by line.
  - Parses each line to create a `Student` object.
  - Adds each `Student` object to a list and returns the list.

##### Task 3: Display Students
- Add a method called `displayStudents(List<Student> students)` that:
  - Accepts a list of students.
  - Displays each student's data in a readable format.

##### Task 4: Update a Student’s Grade
- Add a method `updateGrade(int id, double newGrade, String filePath)` that:
  - Loads the list of students from the file.
  - Searches for a student by ID.
  - Updates the student’s grade if the student is found.
  - Saves the updated list back to the file.

### Example Usage

1. **Add Sample Data**:
   - Initialize a few sample `Student` objects in the main method, add them to a list, and save them to a file called `students.txt`.
   
2. **Display Data**:
   - Read the student data from `students.txt` and display it in the console.

3. **Update Grades**:
   - Update a student’s grade based on their ID and save the changes.

### Sample Output

**Example contents of `students.txt` after writing:**
```plaintext
101,John Doe,88.5
102,Jane Smith,92.0
103,Emily White,76.3

Example console output after reading and displaying:

ID: 101, Name: John Doe, Grade: 88.5
ID: 102, Name: Jane Smith, Grade: 92.0
ID: 103, Name: Emily White, Grade: 76.3
```

## Bonus Tasks (Optional)

1. **Delete a Student Record**:
   - Add a method `deleteStudent(int id, String filePath)` to delete a student from the file by ID.

2. **Sort Students by Grade**:
   - Add functionality to sort and display students by their grade in descending order.

## Part 2: Build and Query a Library Database

**Objective**: Create a library management database in SQLite. Practice using SQL commands to create tables, insert data, and write queries.

### Step 1: Setup

1. Download and install SQLite if you haven't already.
2. Open your SQLite environment and create a new database called `library.db`.

### Step 2: Create Tables

1. **Books**: Create a table to store information about books.
   - Columns: `book_id` (INTEGER, Primary Key), `title` (TEXT), `author` (TEXT), `genre` (TEXT), `published_year` (INTEGER), `available` (BOOLEAN).

2. **Members**: Create a table to store information about library members.
   - Columns: `member_id` (INTEGER, Primary Key), `first_name` (TEXT), `last_name` (TEXT), `membership_date` (DATE).

3. **Borrowings**: Create a table to record which books are borrowed by members.
   - Columns: `borrowing_id` (INTEGER, Primary Key), `book_id` (INTEGER, Foreign Key referencing Books), `member_id` (INTEGER, Foreign Key referencing Members), `borrowed_date` (DATE), `return_date` (DATE).

### Step 3: Insert Seed Data

Insert sample data for testing and queries.

1. **Books**: Add at least 5 different books with varying genres and authors.
2. **Members**: Add at least 3 library members.
3. **Borrowings**: Add records showing which members have borrowed which books, along with the borrowing and return dates.

### Step 4: Practice Queries

Write SQL queries to answer the following questions:

1. **All Books**: List all books in the library.
2. **Available Books**: Retrieve only the books that are currently available.
3. **Members who Borrowed Books**: Show each member’s name and the titles of books they have borrowed.
4. **Books by Genre**: List all books grouped by genre.
5. **Count of Borrowed Books**: Find out how many books each member has borrowed.
6. **Overdue Books**: List all books that have been borrowed for more than 30 days.
7. **Most Recent Borrowing**: Retrieve the most recent borrowing record.

### Step 5: Advanced Queries (Bonus)

1. **Popular Books**: Find the book that has been borrowed the most times.
2. **Average Borrowing Duration**: Calculate the average number of days a book is borrowed before being returned.


