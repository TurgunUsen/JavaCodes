package week2.assignment1.school.management;

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




    }

}