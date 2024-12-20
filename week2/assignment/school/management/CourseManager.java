package week2.assignment.school.management;
import java.util.Arrays;

public class CourseManager {

    private Student[] students;
    int studentCount = 0;

    // Constructor
    public CourseManager(){
        students = new Student[0];
    }

    // Adds students to the array
    public void addStudent(Student student){
    students = Arrays.copyOf(students, studentCount + 1);
    students[studentCount] = student;
    studentCount++;

    }

    // Loops through the list and displays the details of all students
    public void displayAllStudents(){
        System.out.println("\nList of All Students:");
        for (int i = 0; i < studentCount; i++){
            students[i].displayDetails();
        }
    }
}
