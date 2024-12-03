# Practice Exercise: Multithreading in Java

## Objective
This exercise will help practice creating and managing threads in Java, using the concepts covered in the presentation, such as:
- Thread creation
- Thread lifecycle
- Using thread-safe data structures without explicit synchronization.

---

## Task Overview

1. **Goal**: Simulate a simple bank system where multiple customers (threads) make deposits, withdrawals, and balance inquiries to a single bank account.
2. **Components**: The program will use a main `BankAccount` class and separate threads representing customer actions.
3. **Skills Practiced**: 
   - Creating and starting threads
   - Using thread-safe data structures (e.g., `ConcurrentLinkedQueue`)
   - Practicing thread lifecycle concepts.

---

## Step-by-Step Instructions

### 1. Create the `BankAccount` Class
- Implement basic methods for:
  - `deposit()`
  - `withdraw()`
  - `getBalance()`
- Ensure each transaction is printed to the console to track transactions.

### 2. Create a `Customer` Runnable Class
- Create a class `Customer` implementing the `Runnable` interface.
- In the `run()` method:
  - Simulate various operations (e.g., deposit or withdraw) on the shared `BankAccount` instance.
  - Use `Random` to select operation types and amounts.

### 3. Implement the Main Program
- Create a shared `BankAccount` object.
- Instantiate multiple `Customer` threads and start each thread.
- Print the final balance after all transactions complete.

---

