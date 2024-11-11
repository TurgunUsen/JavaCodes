## Objective
Create a Java application that interacts with a MySQL database to perform basic CRUD (Create, Read, Update, Delete) operations. The application should manage a list of students and allow interaction with a MySQL database.

## Requirements

### 1. Establish a Database Connection
- Use the JDBC API to establish a connection to a MySQL database.

### 2. Create a Table
- Create a table named **`students`** with the following columns:
  - `id` (INT, primary key)
  - `name` (VARCHAR)
  - `age` (INT)
  - `grade` (DOUBLE)

### 3. Insert Data
- Insert multiple student records into the `students` table.

### 4. Retrieve Data
- Retrieve all student records and print them to the console.

### 5. Update Data
- Update the grade of a specific student.

### 6. Delete Data
- Delete a student record based on the `ID`.

### 7. Close the Connection
- Properly close the database connection to release resources.

## Additional Requirements

- **Error Handling**: Implement proper error handling to catch and manage exceptions such as `SQLException`.
- **Prepared Statements**: Use prepared statements to prevent SQL injection vulnerabilities.
- **Input Validation**: Validate user input to avoid inserting invalid data into the database.
- **User Interface**: Create a simple user interface (console-based or GUI-based) to interact with the database.
