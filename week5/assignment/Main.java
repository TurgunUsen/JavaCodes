package week5.assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseRegistration courseRegistration = new CourseRegistration();

        while (courseRegistration.getRegisteredCount() < 5) {
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            try {
                Student student = new Student(name, age);
                courseRegistration.registerStudent(student);
            } catch (InvalidNameException | InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (CourseFullException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("Registration process completed.");
        scanner.close();
    }
}
