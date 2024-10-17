package week4.assignment;
import java.util.ArrayList;

public class Department{
  
    private String name;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

  // Constructor
  public Department(String name) {
      this.name = name;
      this.professors = new ArrayList<>();
      this.courses = new ArrayList<>();
  }

  // Add Professor
  public void addProfessor(Professor professor){
      this.professors.add(professor);
  }

  // Add Course
  public void addCourse(Course course){
      this.courses.add(course);
  }

  // Getters
  public ArrayList<Professor> getProfessors(){
    return professors;
  }

  public ArrayList<Course> getCourses(){
    return courses;
  }

  // Display department details
  public void displayDepartmentDetails(){
    System.out.println("Departmetn: " + name);
    for (Professor professor : professors){
        professor.teachCourse();
    }
    for (Course course : courses){
        System.out.println("Course: " + course.getName());
    }
  }
}
