package week2.assignment.school.management;

public class Main {

    public static void main(String[] args){

        // List of students
        Student student1 = new Student("John", 19, 10001);
        Student student2 = new Student("Robert", 18, 100002);
        Student student3 = new Student("Alex", 20, 100003);
        Student student4 = new Student("Johnathan", 18, 100004);

        // Enroll students in array
        String[] enrollStudent1 = {"Math", "Chemistry", "Physics", "Biology"};
        String[] enrollStudent2 = {"Math", "Physics"};
        student1.enrollCourses(enrollStudent1);
        student2.enrollCourses(enrollStudent2);

        // Enroll students by a single course
        student3.enrollCourses("Biology");
        student4.enrollCourses("Math");

        // Drop courses
        String[] droppedCourses = {"Biology", "Chemistry"};
        student1.dropCourses(droppedCourses);

        // Display students tuition fees
        System.out.println("\nJohn's tuition fee: $" + student1.getTuition());
        System.out.println("Robert's tuition fee: $" + student2.getTuition());
        System.out.println("Alex's tuition fee: $" + student3.getTuition());
        System.out.println("Johnathan's tuition fee: $" + student4.getTuition());

        // Add students
        CourseManager courseManager = new CourseManager();

        courseManager.addStudent(student1);
        courseManager.addStudent(student2);
        courseManager.addStudent(student3);
        courseManager.addStudent(student4);

        // Display details of all enrolled students
        courseManager.displayAllStudents();
    }

}