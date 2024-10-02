package week2.assignment1.school.management;
import week2.assignment1.school.Person;
import java.util.ArrayList;

public class Student extends Person {

    private int studentID;
    private ArrayList<String> enrolledCourses;
    private double tuition;

    // Constructor
    public Student( String name, int age, int studentID){
        super(name, age); // calling Person class
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
    }

    // Accepts array of courses
    public void enrollCourses(String[] courses){
        for (String course : courses){
            enrolledCourses.add(course);
        }
        calculateTuition();
    }

    // Accepts a single course
    public void enrollCourses(String course){
        enrolledCourses.add(course);
        calculateTuition();
    }

    // Drop the courses
    public void dropCourses(String[] courses){
        for (String course : courses){
            enrolledCourses.remove(course);
        }
        calculateTuition();
    }

    // Getter
    public double getTuition(){
        return tuition;
    }

    // Calculate the tuition
    public void calculateTuition(){
        int tuitionPerCourse = 500;
        int numberOfCourses = enrolledCourses.size();
        this.tuition = numberOfCourses * tuitionPerCourse;
    }

    // Display student detail
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Enrolled Courses: " + enrolledCourses);
        System.out.println("Tuition: $" + tuition);
    }

}