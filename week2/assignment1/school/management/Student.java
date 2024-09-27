package week2.assignment1.school.management;

import week2.assignment1.school.Person;

import java.util.ArrayList;

public class Student extends Person {

    private int studentID;
    private ArrayList<String> enrolledCourses;
    private double tuition;

    public Student( String name, int age, int studentID){
        super(name, age); // calling Person class
        this.age = age;
        this.enrolledCourses = new ArrayList<>();
    }

    // Accepts array of courses
    public void enrollCourses(String[] courses){
        for (String course : courses){
            enrolledCourses.add(course);
        }
    }

    // Accepts a single course
    public void enrollCourses(String course){
        enrolledCourses.add(course);
    }


}