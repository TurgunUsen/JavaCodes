package week4.assignment;

import java.util.ArrayList;

public class Course {
    private String name;
    private int creditHours;
    private ArrayList<Student> students;

    //Constructor
    public Course(String name, int CreditHours){
        this.name = name;
        this.creditHours = creditHours;
        this.students = new ArrayList<Student>();
    }
    // Add student to the course
    public void addStudent(Student student){
        student.add(student);
    }
    // Getters
    public String getName(){
        return name;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
    // Assign a grade to a student
    public void assignGrade(Student student, int grade){
        student.setGrade(this.name, grade);
    }
}
