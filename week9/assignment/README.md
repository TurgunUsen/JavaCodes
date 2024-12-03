# Homework Assignment: Multi-Threaded Library System in Java

## Objective
This assignment aims to deepen your understanding of multi-threaded programming in Java by:
- Creating and managing threads.
- Practicing thread lifecycle methods.
- Handling concurrent transactions without explicit synchronization.

---

## Task: Multi-Threaded Library Simulation
You will create a simple library management system where multiple users (threads) attempt to check out, return, or search for books in a shared Library collection.

---

## Instructions

### 1. Create the `Book` Class
- Define a `Book` class with properties:
  - `id`: A unique identifier for the book.
  - `title`: The book's title.
  - `author`: The book's author.
  - `isAvailable`: A boolean to track the book's availability.
- Include methods:
  - `checkOut()`: Updates `isAvailable` to `false` and prints a message.
  - `returnBook()`: Updates `isAvailable` to `true` and prints a message.

---

### 2. Implement the `Library` Class
- Use an `ArrayList<Book>` to hold a list of available books.
- Add methods:
  - `addBook(Book book)`: Adds a book to the collection.
  - `isAvailable(String bookTitle)`: Checks if a book is available.
  - `displayAvailableBooks()`: Displays all available books in the library.

---

### 3. Create the `User` Class
- Implement `User` as a `Runnable`, representing each library user.
- Each `User` thread will perform 3-5 random actions:
  - **Check out a book**: Choose a random book to check out.
  - **Return a book**: Return a previously checked-out book.
  - **Search for a book**: Check if a specific book is available.

---

### 4. Main Program (`LibrarySimulation`)
- Instantiate a `Library` and populate it with several books.
- Create and start multiple `User` threads to perform operations on the library.
- After all threads complete, display the final list of available books in the library.

---

## Requirements

- **Thread Management**: Use thread lifecycle methods like `join()` to ensure all users finish their transactions.
- **Random Actions**: Use `Random` to simulate different user actions.
- **Print Output**: Display output messages for each action taken, including the state of books after each transaction.

---

## Example Output

Sample output could look like this (each action should print):

User 1: Checking out "Java Fundamentals"  
User 2: "Data Structures" is already checked out.  
User 3: Returned "Algorithms in Java"  

---

## Final Available Books in Library

- **"Java Fundamentals"** by John Doe  
- **"Advanced Java"** by Jane Smith  

---

## Extension (Optional)

- Experiment with setting different thread priorities.  
- Add new methods to the `Library` class, such as a `reserveBook()` option.  

---

This assignment practices creating and managing threads while simulating real-world scenarios, giving insight into concurrent operations on shared resources.


