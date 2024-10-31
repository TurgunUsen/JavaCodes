# Problem Statement: File Reading and Data Processing

You are tasked with writing a Java program that reads a file containing student names and their respective scores, processes the data, and outputs the average score. Implement proper exception handling using `try-catch-finally` and follow best practices. Also, create a custom exception to handle invalid score entries.

## Steps:

### Input File:
The file `students.txt` contains lines with student names and scores, formatted as `name,score`.

#### Example:

```plaintext
Alice,85
Bob,95
Charlie,abc
Dave,78
```

### Tasks:
1. **Read the file** using `FileReader` and `BufferedReader`.
2. **Process each line** to extract the student name and score.
3. **Calculate and print the average score** of all students.
4. **Handle possible exceptions**:
   - **`FileNotFoundException`**: If the file is not found.
   - **`NumberFormatException`**: If a score is not a valid number (e.g., "abc").
   - **Custom Exception**: If the score is out of the range 0-100.

### Requirements:
- Use a `try-catch-finally` block to handle exceptions.
- Catch specific exceptions rather than generic ones.
- Ensure that file resources are closed in the `finally` block.
- Create and use a custom exception (`InvalidScoreException`) for scores outside the valid range.


