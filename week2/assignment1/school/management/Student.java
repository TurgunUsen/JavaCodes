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

    // Getter
    public double getTuition(double tuition){
        return tuition;
    }

    // Calculate the tuition
    public void calculateTuition(){
        int tuitionPerCourse = 500;
        int numberOfCourses = enrolledCourses.size();
        this.tuition = numberOfCourses * tuitionPerCourse;
    }

}