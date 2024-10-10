package week3.practice1;
import java.util.HashMap;
import java.util.Map;

public class StudentGradesProgram {

    public static void main(String[] args) {
        // Step 1: Create a HashMap to store student names and grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Step 2: Add students and their grades
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 88);

        // Step 3: Display all students and their grades
        System.out.println("\nAll students and their grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Step 4: Search for a specific student and display their grade
        String searchName = "Alice";
        if (studentGrades.containsKey(searchName)) {
            System.out.println(searchName + "'s grade: " + studentGrades.get(searchName));
        } else {
            System.out.println(searchName + " is not found in the student list.");
        }

        // Step 5: Remove a student
        System.out.println("\nRemoving Bob...");
        studentGrades.remove("Bob");

        // Step 6: Check if a particular student exists
        if (studentGrades.containsKey("Charlie")) {
            System.out.println("Charlie is in the map.");
        } else {
            System.out.println("Charlie is not in the map.");
        }

        // Display the updated student list
        System.out.println("\nUpdated student list:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
