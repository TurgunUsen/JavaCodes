package week4.assignment;
import java.util.HashMap;

public class Student {
    private String name;
    private String studentID;
    private HashMap<String, Integer> grades;

    // Constructor
    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
        this.grades = new HashMap<>();
    }
    // Register for a course
    public void registerForCourse(Course course){
        course.addStudent(this);
    }
    // Set grade for a course
    public void setGrade(String courseName, int grade){
        grades.put(courseName, grade);
    }
    //Get grade report
    public void displayGradeReport(){
        System.out.println("Grade report for " + name + ":");
        for (String course : grades.keySet()){
            System.out.println(course + ": " + grades.get(course));
        }
    }
}
