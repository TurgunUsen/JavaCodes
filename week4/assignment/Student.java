package week4.assignment;
import java.util.HashMap;

public class Student {
    private String name;
    private String studentID;
    private HashMap<String, Integer> grades;
}
    // Constructor
    public Student(String name, String studentID){
        this.name = name;
        this.studentID = studentID;
        this.grades = new HashMap<>();
    }
}
