# Assignment

## Objective
Write a Java program to create, save, read, and update a to-do list stored in a text file.

## Instructions

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
