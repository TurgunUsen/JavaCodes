# Practical Example: JDBC "Bookstore" Database Application in Java

This example demonstrates how to use JDBC to create a small application for managing a "Bookstore" database in Java. The application includes steps for creating a database connection, inserting data, retrieving records, and closing resources properly.

## Step-by-Step Code Example

### Create a Database Table

Use the following SQL command to create the `books` table:

```sql
CREATE TABLE IF NOT EXISTS books (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    author TEXT NOT NULL,
    price REAL NOT NULL
);
