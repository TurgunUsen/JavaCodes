package week4.assignment;

public class Main {
    public static void main(String[] args){
        // Create a department
        Department csDepartment = new Department("Computer Science");

        // Create professors
        FullTimeProfessor fullTimeProfessor = new FullTimeProfessor("Prof. John Smith", "Computer Science");
        AdjunctProfessor adjunctProfessor = new AdjunctProfessor("Prof. Joe Wick", "Computer Science", 3);

        // Add professors to a department
        csDepartment.addProfessor(fullTimeProfessor);
        csDepartment.addProfessor(adjunctProfessor);

        // Create courses
        Course dataStructure = new Course("Data Structures", 3);
        Course algorithm = new Course("Algorithm", 4);

        // Add courses to department
        csDepartment.addCourse(dataStructure);
        csDepartment.addCourse(algorithm);

        // Create students
        Student student1 = new Student("Alice", "098903456549");
        Student student2 = new Student("Tim", "2389048900012");

        // Register students for courses
        student1.registerForCourse(dataStructure);
        student2.registerForCourse(algorithm);

        // Assign grades
        dataStructure.assignGrade(student1, 85);
        algorithm.assignGrade(student2, 95);

        // Display grade report
        student1.displayGradeReport();
        student2.displayGradeReport();

        // Display department status
        csDepartment.displayDepartmentDetails();
    }
}
