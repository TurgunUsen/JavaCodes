package week2.assignment1.school.management;
import java.util.Arrays;

public class CourseManager {

    private Student[] students;
    int studentCount = 0;

    // Constructor
    public CourseManager(){
        Student[] students = new Student[0];
    }

    // Adds students to the array
    public void addStudent(Student student){
    students = Arrays.copyOf(students, studentCount++);
    students[studentCount] = student;
    studentCount++;

    }

    // Loops through the list and displays the details of all students
    public void displayAllStudents(){

    }
}
